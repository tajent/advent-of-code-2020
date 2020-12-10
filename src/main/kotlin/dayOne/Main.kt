package dayOne

import java.io.File

fun main(args: Array<String>) {
    val dayOneInput = transformTestInputToList("src/main/resources/day_one_input.txt")
    val dayOnePartOneSolution = DayOne().getProductOfNumbers(DayOne().sumNumbersTo(dayOneInput, 2020, 0, 2))
    println(dayOnePartOneSolution)
    val dayOnePartTwoSolution = DayOne().getProductOfNumbers(DayOne().sumNumbersTo(dayOneInput, 2020, 0, 3))
    println(dayOnePartTwoSolution)
}

private fun transformTestInputToList(fileName: String): Set<Int>{
    val intInput = mutableSetOf<Int>()
    File(fileName).forEachLine { intInput.add(it.toInt()) }
    return intInput
}
