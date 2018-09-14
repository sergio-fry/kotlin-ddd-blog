package api


import domain.Article
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong


@RestController
class ApplicationController {

    @GetMapping("/")
    fun root(@RequestParam(value = "name", defaultValue = "World") name: String): String {

        val name = "Spring"
        return "Hello $name!"
    }

    @GetMapping("/api/articles")
    fun posts(): Array<Article> {
        val article = Article("My First Article")

        return arrayOf(article)
    }
}