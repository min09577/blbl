package blbl.cat3399.core.prefs

import org.junit.Assert.*
import org.junit.Test
import java.io.File

/**
 * Comprehensive integrity test for all FeaturePrefs batches and PlayerSettingsPart files.
 */
class FeaturePrefsIntegrityTest {

    @Test
    fun allBatches_haveCorrectTypeCounts() {
        val baseDir = File("src/main/java/blbl/cat3399/core/prefs")
        val batchFiles = baseDir.listFiles()?.filter { it.name.matches(Regex("FeaturePrefs\\d+\\.kt")) } ?: emptyList()
        assertTrue("No FeaturePrefs batch files found", batchFiles.isNotEmpty())

        val typeCountRegex = Regex("""var (v\d+\w+): (Boolean|Int)""")
        for (file in batchFiles.sortedBy { it.name }) {
            val content = file.readText()
            val boolCount = typeCountRegex.findAll(content).count { it.groupValues[2] == "Boolean" }
            val intCount = typeCountRegex.findAll(content).count { it.groupValues[2] == "Int" }
            assertEquals("Batch ${file.name}: Boolean count mismatch", 100, boolCount)
            assertEquals("Batch ${file.name}: Int count mismatch", 50, intCount)
        }
    }

    @Test
    fun noDuplicateProperties_acrossAllFiles() {
        val baseDir = File("src/main/java/blbl/cat3399/core/prefs")
        val allFiles = baseDir.listFiles()?.filter { it.name.endsWith(".kt") } ?: emptyList()
        val props = mutableMapOf<String, MutableList<String>>()
        val propRegex = Regex("""(var|val) (v\d+\w+)\s*:""")
        for (file in allFiles) {
            for (m in propRegex.findAll(file.readText())) {
                props.getOrPut(m.groupValues[2]) { mutableListOf() }.add(file.name)
            }
        }
        val duplicates = props.filter { it.value.size > 1 }
        assertTrue("Found ${duplicates.size} duplicate properties", duplicates.isEmpty())
    }

    @Test
    fun noDuplicateFunctions_acrossAllPartFiles() {
        val partDir = File("src/main/java/blbl/cat3399/feature/player")
        val partFiles = partDir.listFiles()?.filter { it.name.matches(Regex("PlayerSettingsPart\\d+\\.kt")) } ?: emptyList()
        val funcs = mutableMapOf<String, MutableList<String>>()
        val funcRegex = Regex("""internal fun PlayerActivity\.(showV\d+\w+)\(""")
        for (file in partFiles) {
            for (m in funcRegex.findAll(file.readText())) {
                funcs.getOrPut(m.groupValues[1]) { mutableListOf() }.add(file.name)
            }
        }
        val duplicates = funcs.filter { it.value.size > 1 }
        assertTrue("Found ${duplicates.size} duplicate functions", duplicates.isEmpty())
    }

    @Test
    fun accessor_declaresAllBatches() {
        val baseDir = File("src/main/java/blbl/cat3399/core/prefs")
        val batchNums = baseDir.listFiles()
            ?.mapNotNull { Regex("FeaturePrefs(\\d+)\\.kt").find(it.name)?.groupValues?.get(1)?.toInt() }
            ?.toSet() ?: emptySet()
        val accessorFile = File(baseDir, "FeaturePrefsAccessor.kt")
        val content = accessorFile.readText()
        val accessorBatches = Regex("""batch(\d+):""").findAll(content).map { it.groupValues[1].toInt() }.toSet()
        assertEquals("Accessor should declare all batches", batchNums.sorted(), accessorBatches.sorted())
    }

    @Test
    fun totalFunctionCount_isReasonable() {
        val partDir = File("src/main/java/blbl/cat3399/feature/player")
        val partFiles = partDir.listFiles()?.filter { it.name.matches(Regex("PlayerSettingsPart\\d+\\.kt")) } ?: emptyList()
        val funcRegex = Regex("""internal fun PlayerActivity\.(showV\d+\w+)\(""")
        val total = partFiles.sumOf { funcRegex.findAll(it.readText()).count() }
        assertTrue("Should have at least 30,000 functions, got $total", total >= 30000)
    }
}
