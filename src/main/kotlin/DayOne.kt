class DayOne {

    fun sumTwoNumbers(values: Set<Int>, sumTarget: Int): Set<Int>{
        val result = mutableSetOf<Int>()

        for (valueOne in values) {
            for (valueTwo in values) {
                if (valueOne + valueTwo == sumTarget) {
                    return setOf(valueOne, valueTwo)
                }
            }
        }
        return result
    }

    fun sumThreeNumbers(values: Set<Int>, sumTarget: Int): Set<Int>{
        val result = mutableSetOf<Int>()

        for (valueOne in values) {
            for (valueTwo in values) {
                for (valueThree in values) {
                    if (valueOne + valueTwo + valueThree == sumTarget) {
                        return setOf(valueOne, valueThree, valueTwo)
                    }
                }
            }
        }
        return result
    }

    fun getProductOfNumbers(values: Set<Int>): Int {
        return values.reduce { acc, i ->  acc * i }
    }
}