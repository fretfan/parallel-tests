package asd.paralleltests.slow

import org.junit.jupiter.api.*

//@SpringBootTest
class SlowTests {

    @BeforeEach
    fun beforeEach() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} beforeEach")
    }

    @AfterEach
    fun afterEach() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} afterEach")
    }

    @Test
    fun test1() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test1")
        doStuff(threadId)
        println("thread-id:${threadId} end test1")
    }
    @Test
    fun test2() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test2")
        doStuff(threadId)
        println("thread-id:${threadId} end test2")
    }
    @Test
    fun test3() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test3")
        doStuff(threadId)
        println("thread-id:${threadId} end test3")
    }
    @Test
    fun test4() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test4")
        doStuff(threadId)
        println("thread-id:${threadId} end test4")
    }
    @Test
    fun test5() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test5")
        doStuff(threadId)
        println("thread-id:${threadId} end test5")
    }
    @Test
    fun test6() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test6")
        doStuff(threadId)
        println("thread-id:${threadId} end test6")
    }
    @Test
    fun test7() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test7")
        doStuff(threadId)
        println("thread-id:${threadId} end test7")
    }
    @Test
    fun test8() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test8")
        doStuff(threadId)
        println("thread-id:${threadId} end test8")
    }
    @Test
    fun test9() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test9")
        doStuff(threadId)
        println("thread-id:${threadId} end test9")
    }
    @Test
    fun test10() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test10")
        doStuff(threadId)
        println("thread-id:${threadId} end test10")
    }
    @Test
    fun test11() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test11")
        doStuff(threadId)
        println("thread-id:${threadId} end test11")
    }
    @Test
    fun test12() {
        val threadId = Thread.currentThread().id
        println("thread-id:${threadId} start test12")
        doStuff(threadId)
        println("thread-id:${threadId} end test12")
    }


    private fun doStuff(threadId: Long) {
        for (x in 0..5) {
            println("thread-id:${threadId} new x=$x")
            Thread.sleep(200)
        }
    }

}
