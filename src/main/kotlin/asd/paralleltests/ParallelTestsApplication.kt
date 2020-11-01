package asd.paralleltests

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParallelTestsApplication

fun main(args: Array<String>) {
	runApplication<ParallelTestsApplication>(*args)
}
