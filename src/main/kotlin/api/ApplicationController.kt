package api


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong


@RestController
class ApplicationController {

    @GetMapping("/")
    fun root(@RequestParam(value = "name", defaultValue = "World") name: String) =
            "Hello Spring!"

}