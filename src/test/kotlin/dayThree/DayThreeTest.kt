package dayThree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayThreeTest {

    @Test
    fun shouldAddTreePositionsOnLineToList() {
        val trees = "#..##.##.#.##.......#.......#.."
        val result = DayThree().getTreePositionsOnRow(trees)

        assertEquals(listOf(0, 3, 4, 6, 7, 9, 11, 12, 20, 28), result)
    }

    @Test
    fun shouldTransformInputToMap() {
        val result = DayThree().transformInputToMapOfTreeRowsAndPositions("src/test/resources/day_three_test_input.txt")
        assertEquals(listOf(2, 3, 13, 14, 24, 25, 35, 36, 46, 47, 57, 58), result.get(0))
        assertEquals(listOf(0, 4, 8, 11, 15, 19, 22, 26, 30, 33, 37, 41, 44, 48, 52, 55, 59, 63), result.get(1))
    }

    @Test
    fun shouldReturn7TreesWithSampleInput() {
        val result = DayThree().countTreesEncountered("src/test/resources/day_three_test_input.txt")
        assertEquals(7, result)
    }
}
