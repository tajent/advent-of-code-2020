package dayTwo

import java.io.File

class DayTwo {

    fun countValidPasswordsInInput(fileName: String): Int{
        var countValidPasswords = 0
        File(fileName).forEachLine {
            if (checkPasswordValid(it.split(" "))) {
                countValidPasswords += 1
            }
        }
        return countValidPasswords
    }

    fun checkPasswordValid(passwordData: List<String>): Boolean {
        val rangeStart = passwordData[0].split("-").first().toInt()
        val rangeEnd = passwordData[0].split("-").last().toInt()
        val letter = passwordData[1].first()
        val password = passwordData[2]

        return (password.count { it == letter } in rangeStart..rangeEnd)
    }
}