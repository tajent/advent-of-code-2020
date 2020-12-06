import java.util.*

class DayOne {
    private val resultToPrint = mutableSetOf<Int>()

    private fun loopThroughNumbers(values: Set<Int>, sumTarget: Int, depth: Int, result: Stack<Int>, numbers: Int) {
        for (value in values) {
            result.add(value)
            if( depth < numbers-1 ) {
                loopThroughNumbers(values, sumTarget,depth+1, result, numbers)
            } else {
                if (result.sum() == sumTarget) {
                    resultToPrint.addAll(result.toHashSet())
                }
            }
            result.pop()
        }
    }

    fun sumNumbersTo(values: Set<Int>, sumTarget: Int, depth: Int, numbers: Int): Set<Int>{
        loopThroughNumbers(values, sumTarget, depth, Stack(), numbers)
        return resultToPrint
    }

    fun getProductOfNumbers(values: Set<Int>): Int {
        return values.reduce { acc, i ->  acc * i }
    }
}