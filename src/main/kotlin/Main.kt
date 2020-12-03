import java.io.File

fun main(args: Array<String>) {
    val dayOnePartOne = DayOne().sumTo(transformTestInputToList("src/main/resources/day_one_input.txt"), 2020)
    println(dayOnePartOne)
}

private fun transformTestInputToList(fileName: String): List<Int>{
    val intInput = mutableListOf<Int>()
    File(fileName).forEachLine { intInput.add(it.toInt()) }
    return intInput
}
