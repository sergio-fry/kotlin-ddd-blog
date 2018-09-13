package domain

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class ArticleTest {
    @Test
    fun myFirstTest() {
        val article = Article("foo bar")
        assertEquals(article.title, "foo bar")
    }
}