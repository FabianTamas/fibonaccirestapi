package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    fun fibonacci(@RequestParam n: Int): ResponseEntity<Int> {
        if (n > 46) {
            // 46 felett az Int túlcsordulhat, ezért visszatérünk BAD_REQUEST-tal
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }

        val result = fibonacciService?.fibonacci(n)
        return if (result != null) {
            ResponseEntity.ok(result)
        } else {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }
}
