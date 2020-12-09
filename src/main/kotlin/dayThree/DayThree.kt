package dayThree

import java.io.File

class DayThree {

    fun countTreesEncountered(fileName: String): Int {
        var lineNumber = 0
        var countTrees = 0
        val terrainMap = transformInputToMapOfTreeRowsAndPositions(fileName)
        var positionOnLine = 0

        for (i in 0..terrainMap.count()) {
            if (terrainMap[i]?.contains(positionOnLine.rem(31)) == true) {
                countTrees += 1
            }
            positionOnLine += 3
        }
        return countTrees
    }

    fun transformInputToMapOfTreeRowsAndPositions(fileName: String): Map<Int, List<Int>> {
        val terrainMap = mutableMapOf<Int, List<Int>>()
        var row = 0
        File(fileName).forEachLine { terrainMap[row] = getTreePositionsOnRow(it); row+= 1}
        return terrainMap
    }

    fun getTreePositionsOnRow(inputLine: String): List<Int> {
        val treePositions = mutableListOf<Int>()
        inputLine.forEachIndexed{index, character -> if (character == '#') {treePositions.add(index)} }
        return treePositions
    }
}
