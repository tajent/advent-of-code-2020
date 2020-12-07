package dayTwo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

internal class DayTwoTest {

    @Test
    fun shouldSplitStringInputToList() {
        val output = mutableSetOf<List<String>>()
        File("src/test/resources/day_two_test_input.txt").forEachLine {
            output.add(it.split(" "))
        }
        println(output)
    }

    @Test
    fun shouldTransformData() {
        val passwordData = listOf("15-19", "k:", "kkkkkkkkkkkkzkkkkkkk")
        val rangeStart = passwordData[0].split("-").first().toInt()
        val rangeEnd = passwordData[0].split("-").last().toInt()
        val letter = passwordData[1].first()
        val password = passwordData[2]
        assertEquals(15, rangeStart)
        assertEquals(19, rangeEnd)
        assertEquals('k', letter)
        assertEquals("kkkkkkkkkkkkzkkkkkkk", password)
    }

    @Test
    fun shouldReturnTrueForValidPassword() {
        val passwordData = listOf("15-19", "k:", "kkkkkkkkkkkkzkkkkkkk")
        val result = DayTwo().checkPasswordValidForOldPolicy(passwordData)
        assertTrue(result)
    }

    @Test
    fun shouldReturnFalseForInvalidPassword() {
        val passwordData = listOf("10-12", "k:", "kkkkkkkkkkkkzkkkkkkk")
        val result = DayTwo().checkPasswordValidForOldPolicy(passwordData)
        assertFalse(result)
    }
}