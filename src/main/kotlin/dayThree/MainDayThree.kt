import dayThree.DayThree

fun main(args: Array<String>) {
    val dayThreePartOneSolution = DayThree().countTreesEncountered("src/main/resources/day_three_input.txt", arrayOf(3,1))
    println(dayThreePartOneSolution)

    val slopes = listOf(arrayOf(1,1), arrayOf(3,1), arrayOf(5,1), arrayOf(7,1), arrayOf(1,2))
    val dayThreePartTwoSolution = DayThree().getProductOfTreesFromAllTraversals("src/main/resources/day_three_input.txt",slopes)
    println(dayThreePartTwoSolution)
}
