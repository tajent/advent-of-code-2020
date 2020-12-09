package dayThree

import java.io.File

class DayThree {

    fun countTreesEncountered(fileName: String, slope: Array<Int>): Int {
        var countTrees = 0
        val terrainMap = transformInputToMapOfTreeRows(fileName)
        var positionOnRow = 0

        for (row in 0..terrainMap.count() step slope[1]) {
            if (isPositionATree(positionOnRow, terrainMap[row])) {
                countTrees += 1
            }
            positionOnRow += slope[0]
        }
        return countTrees
    }

    fun isPositionATree(positionOnRow: Int, terrainRow: CharArray?): Boolean {
            terrainRow ?: return false
            val repeatablePosition = positionOnRow.rem(terrainRow.size)
            return terrainRow[repeatablePosition] == '#'
    }

    fun getProductOfTreesFromAllTraversals(fileName: String, slopes: List<Array<Int>>): Long {
        var treeCounts = mutableListOf<Long>()
        for (slope in slopes) {
            treeCounts.add(countTreesEncountered(fileName, slope)*1L)
        }
        return treeCounts.reduce { acc, i ->  acc * i }
    }

    fun transformInputToMapOfTreeRows(fileName: String): Map<Int, CharArray> {
        val terrainMap = mutableMapOf<Int, CharArray>()
        var row = 0
        File(fileName).forEachLine { terrainMap[row] = it.toCharArray(); row+= 1}
        return terrainMap
    }
}
