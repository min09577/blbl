package blbl.cat3399.core.prefs

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

/**
 * Comprehensive integrity test for all FeaturePrefs batches and PlayerSettingsPart files.
 */
class FeaturePrefsIntegrityTest {
    @Test
    fun allBatches_haveCorrectTypeCounts() {
        val baseDir = File("src/main/java/blbl/cat3399/core/prefs")
        val batchFiles = baseDir.listFiles()?.filter { it.name.matches(Regex("FeaturePrefs\\d+to\\d+\\.kt")) } ?: emptyList()
        assertTrue("No FeaturePrefs batch files found", batchFiles.isNotEmpty())

        val typeCountRegex = Regex("""var (v\d+\w+): (Boolean|Int)""")
        val fileRangeRegex = Regex("FeaturePrefs(\\d+)to(\\d+)\\.kt")
        for (file in batchFiles.sortedBy { it.name }) {
            val match =
                fileRangeRegex.find(file.name)
                    ?: error("Cannot parse range from ${file.name}")
            val start = match.groupValues[1].toInt()
            val end = match.groupValues[2].toInt()
            val numBatches = (end - start) / 10 + 1
            val expectedBoolean = 100 * numBatches
            val expectedInt = 50 * numBatches

            val content = file.readText()
            val boolCount = typeCountRegex.findAll(content).count { it.groupValues[2] == "Boolean" }
            val intCount = typeCountRegex.findAll(content).count { it.groupValues[2] == "Int" }
            assertEquals("Batch ${file.name}: Boolean count mismatch", expectedBoolean, boolCount)
            assertEquals("Batch ${file.name}: Int count mismatch", expectedInt, intCount)
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
        val partFiles = partDir.listFiles()?.filter { it.name.matches(Regex("PlayerSettingsPart\\d+to\\d+\\.kt")) } ?: emptyList()
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
        // Collect ALL batch start numbers from file ranges (e.g. FeaturePrefs701to731.kt -> 701,711,721,731)
        val fileRangeRegex = Regex("FeaturePrefs(\\d+)to(\\d+)\\.kt")
        val allBatchNums = mutableSetOf<Int>()
        baseDir
            .listFiles()
            ?.filter { it.name.matches(fileRangeRegex) }
            ?.forEach { file ->
                val match = fileRangeRegex.find(file.name)!!
                val start = match.groupValues[1].toInt()
                val end = match.groupValues[2].toInt()
                for (n in start..end step 10) allBatchNums.add(n)
            }
        assertTrue("No batch files found", allBatchNums.isNotEmpty())

        val accessorFile = File(baseDir, "FeaturePrefsAccessor.kt")
        val content = accessorFile.readText()
        val accessorBatches = Regex("""batch(\d+):""").findAll(content).map { it.groupValues[1].toInt() }.toSet()
        assertEquals("Accessor should declare all batches", allBatchNums.sorted(), accessorBatches.sorted())
    }

    @Test
    fun totalFunctionCount_isReasonable() {
        val partDir = File("src/main/java/blbl/cat3399/feature/player")
        val partFiles = partDir.listFiles()?.filter { it.name.matches(Regex("PlayerSettingsPart\\d+to\\d+\\.kt")) } ?: emptyList()
        val funcRegex = Regex("""internal fun PlayerActivity\.(showV\d+\w+)\(""")
        val total = partFiles.sumOf { funcRegex.findAll(it.readText()).count() }
        assertTrue("Should have at least 30,000 functions, got $total", total >= 30000)
    }
}
