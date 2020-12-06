import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayOneTest {

    private val dayOne = DayOne()

    @Test
    fun shouldReturnSetOfTwoValuesThatSumTo2020() {
        val values = mutableSetOf(1721, 979, 366, 299, 675, 1456)

        val result = dayOne.sumTwoNumbers(values, 2020)
        assertEquals(setOf(1721,299), result)
    }

    @Test
    fun shouldReturnSetOfThreeValuesThatSumTo2020() {
        val values = mutableSetOf(1721, 979, 366, 299, 675, 1456)
        val result = dayOne.sumThreeNumbers(values, 2020)
        assertEquals(setOf(979,366,675), result)
    }

    @Test
    fun shouldReturnProductOfThreeNumbers() {
        val values = mutableSetOf(2, 3, 4)
        val result = dayOne.getProductOfNumbers(values)
        assertEquals(24, result)
    }
}