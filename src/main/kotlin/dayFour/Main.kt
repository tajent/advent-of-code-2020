package dayFour

fun main(args: Array<String>) {
    val dayFourPartOneSolution = DayFour().getCountOfValidPassportsByFields("src/main/resources/day_four_input.txt")
    println(dayFourPartOneSolution)

    val dayFourPartTwoSolution = DayFour().getCountOfValidPassportsByFieldsAndValues("src/main/resources/day_four_input.txt")
    println(dayFourPartTwoSolution)
}
