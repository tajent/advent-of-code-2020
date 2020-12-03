class DayOne {

    fun sumTo(values: List<Int>, sumTarget: Int): Int {
        if (values.size <=1) {
            return 0
        }
        val value = values.first()
        val newList = values.drop(1)

        newList.forEach { nextValue ->
            if (value + nextValue == sumTarget) {
                return value * nextValue
            }
        }
        return sumTo(newList, sumTarget)
    }
}