package dayTwo

import java.io.File

class DayTwo {

    fun countOldPolicyValidPasswordsInInput(fileName: String): Int{
        var countValidPasswords = 0
        File(fileName).forEachLine {
            if (checkPasswordValidForOldPolicy(it.split(" "))) {
                countValidPasswords += 1
            }
        }
        return countValidPasswords
    }

    fun checkPasswordValidForOldPolicy(passwordData: List<String>): Boolean {
        val rangeStart = passwordData[0].split("-").first().toInt()
        val rangeEnd = passwordData[0].split("-").last().toInt()
        val letter = passwordData[1].first()
        val password = passwordData[2]

        return (password.count { it == letter } in rangeStart..rangeEnd)
    }

    fun countNewPolicyValidPasswordsInInput(fileName: String): Int{
        var countValidPasswords = 0
        File(fileName).forEachLine {
            if (checkPasswordValidForNewPolicy(it.split(" "))) {
                countValidPasswords += 1
            }
        }
        return countValidPasswords
    }

    fun checkPasswordValidForNewPolicy(passwordData: List<String>): Boolean {
        val firstLetterPosition = passwordData[0].split("-").first().toInt()-1
        val secondLetterPosition = passwordData[0].split("-").last().toInt()-1
        val letter = passwordData[1].first()
        val password = passwordData[2]
        val bothContainLetter = password[firstLetterPosition] == password[secondLetterPosition]
        val neitherContainLetter = password[firstLetterPosition] != letter && password[secondLetterPosition] != letter
        val eitherContainLetter = password[firstLetterPosition] == letter || password[secondLetterPosition] == letter

        return (!bothContainLetter && !neitherContainLetter && eitherContainLetter)
    }
}
