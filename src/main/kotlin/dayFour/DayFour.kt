package dayFour

import java.io.File

class DayFour {

    val allPassports = mutableListOf<List<String>>()
    var passport = mutableListOf<String>()


    fun getAllPassports(fileName: String): List<List<String>> {
        File(fileName).forEachLine {  addPassportToList(it) }
        return allPassports
    }

    fun getCountOfValidPassports(fileName: String): Int {
        var countValidPassports = 0
        getAllPassports(fileName).forEach {if (isValid(it)) { countValidPassports += 1 }}
        return countValidPassports
    }

    private fun addPassportToList(it: String) {
        if (passport.isEmpty()) {
            allPassports.add(passport)
        }
        if (it.isBlank()) {
            passport = mutableListOf()
        } else {
            passport.addAll(it.split(" "))
        }
    }

    fun isValid(passport: List<String>): Boolean {
        val fields = mutableListOf<String>()
        val validFields = mutableListOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")

        for (field in passport) {
            fields.add(field.split(":")[0])
        }

        if (fields.contains("cid")) {
            fields.remove("cid")
        }
        fields.sort()
        validFields.sort()

        return fields == validFields
    }
}