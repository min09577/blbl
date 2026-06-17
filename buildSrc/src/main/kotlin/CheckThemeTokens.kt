package blbl.build

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File

abstract class CheckThemeTokens : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val resDir: DirectoryProperty

    @get:Internal
    abstract val projectRoot: RegularFileProperty

    @TaskAction
    fun check() {
        val res = resDir.get().asFile
        val projDir = projectRoot.get().asFile
        val layoutDirs = res.listFiles()
            ?.filter { it.isDirectory && it.name.startsWith("layout") }
            .orEmpty()

        val forbidden = listOf(
            "@color/blbl_bg",
            "@color/blbl_surface",
            "@color/blbl_text",
            "@color/blbl_text_secondary",
            "@color/blbl_focus_stroke",
            "@drawable/blbl_focus_bg_round",
        )

        val violations = mutableListOf<String>()
        for (dir in layoutDirs) {
            dir.walkTopDown()
                .filter { it.isFile && it.extension.equals("xml", ignoreCase = true) }
                .forEach { f ->
                    val relPath = f.relativeTo(projDir).invariantSeparatorsPath
                    val lines = f.readLines(Charsets.UTF_8)
                    for ((index, line) in lines.withIndex()) {
                        for (token in forbidden) {
                            if (containsWholeToken(line, token)) {
                                violations.add("$relPath:${index + 1}: $token")
                            }
                        }
                    }
                }
        }

        if (violations.isNotEmpty()) {
            val msg = buildString {
                appendLine("Theme token check failed: layouts must use theme attributes, not fixed palette colors.")
                appendLine(
                    "Use ?attr/colorOnSurface, ?android:attr/textColorSecondary, ?attr/colorBackground, " +
                        "?attr/colorSurface, ?attr/blblOnPageBackdrop, ?attr/blblFocusBgRound, " +
                        "?attr/blblFocusStrokeColor, etc.",
                )
                appendLine("Violations:")
                violations.forEach { appendLine("  $it") }
            }
            throw GradleException(msg)
        }
    }

    companion object {
        private fun isWordChar(c: Char): Boolean = c.isLetterOrDigit() || c == '_'

        private fun containsWholeToken(line: String, token: String): Boolean {
            var fromIndex = 0
            while (true) {
                val idx = line.indexOf(token, startIndex = fromIndex)
                if (idx < 0) return false
                val before = line.getOrNull(idx - 1)
                val after = line.getOrNull(idx + token.length)
                val beforeOk = before == null || !isWordChar(before)
                val afterOk = after == null || !isWordChar(after)
                if (beforeOk && afterOk) return true
                fromIndex = idx + token.length
            }
        }
    }
}
