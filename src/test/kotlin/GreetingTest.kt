package greeting

import org.junit.Test as test
import kotlin.test.assertEquals

/**
 * Greeting test case.
 */
class GreetingTest {

    /**
     * Given the user name is "Kotlin"
     * When we call "sayHai" with user name.
     * Then it should return "Hello Kotlin!"
     */
    test fun sayHiWithParameter() {
        assertEquals("Hello Kotlin!", sayHi("Kotlin"))
    }

    /**
     * Given the user name is not specified
     * When we call "sayHai" without any parameter.
     * Then it should return "Hello World!"
     */
    test fun sayHiWithoutParameter() {
        assertEquals("Hello World!", sayHi())
    }
}