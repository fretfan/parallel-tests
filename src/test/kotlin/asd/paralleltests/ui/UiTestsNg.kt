package asd.paralleltests.ui

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.*
//import org.testng.annotations.AfterMethod
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test

//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Condition.*;

//@SpringBootTest
class UiTestsNg {

//    @BeforeMethod
//    fun beforemMethod() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} beforemMethod")
//    }
//
//    @AfterMethod
//    fun afterEach() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} AfterMethod")
//    }
//
//    @Test
//    fun test1() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test1")
//        doStuff()
//        println("UI:thread-id:${threadId} end test1")
//    }
//
//    @Test
//    fun test2() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test2")
//        doStuff()
//        println("UI:thread-id:${threadId} end test2")
//    }
//
//    @Test
//    fun test3() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test3")
//        doStuff()
//        println("UI:thread-id:${threadId} end test3")
//    }
//
//    @Test
//    fun test4() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test4")
//        doStuff()
//        println("UI:thread-id:${threadId} end test4")
//    }
//
//    @Test
//    fun test5() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test5")
//        doStuff()
//        println("UI:thread-id:${threadId} end test5")
//    }
//
//    @Test
//    fun test6() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test6")
//        doStuff()
//        println("UI:thread-id:${threadId} end test6")
//    }
//
//    @Test
//    fun test7() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test7")
//        doStuff()
//        println("UI:thread-id:${threadId} end test7")
//    }
//
//    @Test
//    fun test8() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test8")
//        doStuff()
//        println("UI:thread-id:${threadId} end test8")
//    }
//
//    @Test
//    fun test9() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test9")
//        doStuff()
//        println("UI:thread-id:${threadId} end test9")
//    }
//
//    @Test
//    fun test10() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test10")
//        doStuff()
//        println("UI:thread-id:${threadId} end test10")
//    }
//
//    @Test
//    fun test11() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test11")
//        doStuff()
//        println("UI:thread-id:${threadId} end test11")
//    }
//
//    @Test
//    fun test12() {
//        val threadId = Thread.currentThread().id
//        println("UI:thread-id:${threadId} start test12")
//        doStuff()
//        println("UI:thread-id:${threadId} end test12")
//    }

    private fun doStuff() {
        open("https://transport.tallinn.ee/")
        `$`("#tallinna-linn_trol").click()
        `$`(".search-stop input").value = "keemia"
        `$`(".search-results .stop").shouldHave(Condition.text("Akadeemia tee"))
    }


}
