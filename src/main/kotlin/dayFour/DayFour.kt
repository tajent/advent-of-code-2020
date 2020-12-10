package dayFour

import java.io.File

class DayFour {

    val allPassports = mutableListOf<List<String>>()
    var passport = mutableListOf<String>()

    fun getCountOfValidPassportsByFields(fileName: String): Int {
        var countValidPassports = 0
        File(fileName).forEachLine { addPassportToList(it) }
        allPassports.forEach {if (isValidByFields(it)) { countValidPassports += 1 }}
        return countValidPassports
    }

    fun getCountOfValidPassportsByFieldsAndValues(fileName: String): Int {
        var countValidPassports = 0
        File(fileName).forEachLine { addPassportToList(it) }
        allPassports.forEach {if (isValidByFieldsAndValues(it)) { countValidPassports += 1 }}
        return countValidPassports
    }

    private fun addPassportToList(passportFields: String) {
        if (passport.isEmpty()) {
            allPassports.add(passport)
        }
        if (passportFields.isBlank()) {
            passport = mutableListOf()
        } else {
            passport.addAll(passportFields.split(" "))
        }
    }

    fun isValidHeight(value: String): Boolean {
        if (value.matches("[1][5-8][0-9][c][m]".toRegex()) || value.matches("[1][9][0-3][c][m]".toRegex())) {
            return true
        }
        if (value.matches("[5][9][i][n]".toRegex()) || value.matches("[6][0-9][i][n]".toRegex()) || value.matches("[7][0-6][i][n]".toRegex())) {
            return true
        }
        return false
    }

    fun isValidHairColour(value: String): Boolean {
        if (value.matches("^[#][0-9a-f]{6}$".toRegex())) {
            return true
        }
        return false
    }

    fun isValidEyeColour(value: String): Boolean {
        if (value.matches("amb".toRegex()) || value.matches("blu".toRegex()) || value.matches("brn".toRegex()) ||
                value.matches("grn".toRegex()) || value.matches("gry".toRegex()) || value.matches("hzl".toRegex()) ||
                value.matches("oth".toRegex())) {
            return true
        }
        return false
    }

    fun isValidPassportId(value: String): Boolean {
        return value.matches("^[0-9]{9}$".toRegex())
    }

    fun isValidValue(field: String, value: String): Boolean {
        val byrValidRange = 1920..2002
        val iyrValidRange = 2010..2020
        val eyrValidRange = 2020..2030
        if (field == "byr") {
            return value.matches("^[0-9]{4}$".toRegex()) && value.toInt() in byrValidRange
        }
        if (field == "iyr") {
            return value.toInt() in iyrValidRange
        }
        if (field == "eyr") {
            return value.toInt() in eyrValidRange
        }
        if (field == "hgt") {
            return isValidHeight(value)
        }
        if (field == "hcl") {
            return isValidHairColour(value)
        }
        if (field == "ecl") {
            return isValidEyeColour(value)
        }
        if (field == "pid") {
            return isValidPassportId(value)
        }
        return false
    }

    fun isValidByFieldsAndValues(passport: List<String>): Boolean {
        val fields = mutableListOf<String>()
        val validFields = mutableListOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")

        for (fieldValuePair in passport) {
            val pair = fieldValuePair.split(":")
            if (isValidValue(pair[0], pair[1])) {
                fields.add(pair[0])
            }
        }

        if (fields.contains("cid")) {
            fields.remove("cid")
        }
        fields.sort()
        validFields.sort()

        return fields == validFields
    }

    fun isValidByFields(passport: List<String>): Boolean {
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