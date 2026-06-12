package blbl.cat3399.feature.player

import org.junit.Assert.assertEquals
import org.junit.Test

class PlayerAutoNextTitleTest {
    @Test
    fun keepsShortTitlesAfterWhitespaceNormalization() {
        assertEquals("\u7B2C2\u8BDD", formatAutoNextHintTitle("  \u7B2C2\u8BDD ", fallbackTitle = "\u63A8\u8350\u89C6\u9891"))
    }

    @Test
    fun truncatesTitlesToEighteenCharactersBeforeEllipsis() {
        // AUTO_NEXT_TITLE_MAX_CHARS = 18: first 18 chars + "..."
        assertEquals("123456789012345678...", formatAutoNextHintTitle("12345678901234567890", fallbackTitle = "\u63A8\u8350\u89C6\u9891"))
    }

    @Test
    fun fallsBackWhenTitleIsBlank() {
        assertEquals("\u63A8\u8350\u89C6\u9891", formatAutoNextHintTitle("  \n\t  ", fallbackTitle = "\u63A8\u8350\u89C6\u9891"))
    }
}
