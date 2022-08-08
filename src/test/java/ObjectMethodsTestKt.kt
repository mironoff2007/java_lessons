
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import java.sql.DriverManager.println

class ObjectMethodsTestKt {

    private data class MyObject(var number: Int)

    @Test
    fun testHashCode(testInfo: TestInfo) {
        println(testInfo.testMethod.toString())

        val code1 = MyObject(1).hashCode()
        val code2 = MyObject(1).hashCode()
        assertEquals(code1, code2)
    }

    @Test
    fun testEquals(testInfo: TestInfo) {
        println(testInfo.testMethod.toString())
        val object1 = MyObject(1)
        val object2 = MyObject(1)
        assertEquals(object1 == object2, true)
    }
}