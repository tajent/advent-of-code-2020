import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayOneTest {

    private val dayOne = DayOne()

    @Test
    fun shouldReturnValuesThatSumTo2020() {
        val values = listOf(12, 10, 5, 9, 7)

        val result = dayOne.sumTo(values, 12)
        assertEquals(result, 35)
    }

    @Test
    fun shouldTestKotlin() {

    }

}