package application.controller

import application.Service.IncrementService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
class IncrementController(
    private val incrementService: IncrementService
) {
    @GetMapping("/{increment}")
    fun increment(@PathVariable("increment") n: Long): Long {
        println(n)
        return incrementService.Increment(n)
    }
}