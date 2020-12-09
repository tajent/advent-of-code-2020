import dayTwo.DayTwo

fun main(args: Array<String>) {
    val dayTwoPartOneSolution = DayTwo().countOldPolicyValidPasswordsInInput("src/main/resources/day_two_input.txt")
    println(dayTwoPartOneSolution)
    val dayTwoPartTwoSolution = DayTwo().countNewPolicyValidPasswordsInInput("src/main/resources/day_two_input.txt")
    println(dayTwoPartTwoSolution)
}
