package dayOne

import DayOne
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class DayOneTest {

    private val dayOne = DayOne()

    @Test
    fun shouldReturnSetOfTwoValuesThatSumTo2020() {
        val values = mutableSetOf(1721, 979, 366, 299, 675, 1456)

        val result = dayOne.sumNumbersTo(values, 2020, 0, 2)
        assertEquals(setOf(1721,299), result)
    }

    @Test
    fun shouldReturnSetOfThreeValuesThatSumTo2020() {
        val values = mutableSetOf(1721, 979, 366, 299, 675, 1456)
        val result = dayOne.sumNumbersTo(values, 2020, 0, 3)
        assertEquals(setOf(979,366,675), result)
    }

    @Test
    fun shouldReturnProductOfThreeNumbers() {
        val values = mutableSetOf(2, 3, 4)
        val result = dayOne.getProductOfNumbers(values)
        assertEquals(24, result)
    }

    @Test
    fun inputTest() {
        val dayOneInput = transformTestInputToList("src/main/resources/day_one_input.txt")
    }

    private fun transformTestInputToList(fileName: String): Set<Int>{
        val intInput = mutableSetOf<Int>()
        File(fileName).forEachLine { intInput.add(it.toInt()) }
        return intInput
    }


    @Test
    fun testKotlin() {
        val pass = "abcdce"
        val result = pass.count { it == 'c' }
        assertEquals(2, result)
        val inRange = 0 in 1..10
        assertEquals(true, inRange)
    }
}