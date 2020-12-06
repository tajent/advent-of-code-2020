import java.io.File

fun main(args: Array<String>) {
    val dayOneInput = transformTestInputToList("src/main/resources/day_one_input.txt")
    val dayOnePartOneSolution = DayOne().getProductOfNumbers(DayOne().sumTwoNumbers(dayOneInput, 2020))
    println(dayOnePartOneSolution)
    val dayOnePartTwoSolution = DayOne().getProductOfNumbers(DayOne().sumThreeNumbers(dayOneInput, 2020))
    println(dayOnePartTwoSolution)
}

private fun transformTestInputToList(fileName: String): Set<Int>{
    val intInput = mutableSetOf<Int>()
    File(fileName).forEachLine { intInput.add(it.toInt()) }
    return intInput
}
