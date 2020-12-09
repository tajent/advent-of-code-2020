package dayThree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayThreeTest {

    @Test
    fun shouldReturnPositionIsATree() {
        val terrainRow = charArrayOf('.','.','#','#','.')
        assertTrue(DayThree().isPositionATree(2, terrainRow))
        assertTrue(DayThree().isPositionATree(8, terrainRow))
        assertFalse(DayThree().isPositionATree(0, terrainRow))
        assertFalse(DayThree().isPositionATree(5, terrainRow))
    }

    @Test
    fun shouldTransformInputToMap() {
        val result = DayThree().transformInputToMapOfTreeRows("src/test/resources/day_three_small_test_input.txt")
        assertTrue(charArrayOf('.','.','#','#','.') contentEquals result[0])
        assertTrue(charArrayOf('#','.','.','.','#') contentEquals result[1])
    }

    @Test
    fun shouldReturn7TreesWithSampleInput() {
        val result = DayThree().countTreesEncountered("src/test/resources/day_three_test_input.txt", arrayOf(3,1))
        assertEquals(7, result)
    }

    @Test
    fun shouldReturn366ForProductOfTreesWithSampleInput() {
        val slopes = listOf(arrayOf(1,1), arrayOf(3,1), arrayOf(5,1), arrayOf(7,1), arrayOf(1,2))
        val result = DayThree().getProductOfTreesFromAllTraversals("src/test/resources/day_three_test_input.txt", slopes)
        assertEquals(336, result)
    }
}
