package ${package}

import org.junit.Test as test
import kotlin.test.assertEquals

/**
 *
 * @author me
 *
 */
class GreetingTest {
    test fun sayHiWithParameter() {
        assertEquals("Hello Kotlin!", sayHi("Kotlin"))
    }

    test fun sayHiWithoutParameter() {
        assertEquals("Hello World!", sayHi())
    }
}