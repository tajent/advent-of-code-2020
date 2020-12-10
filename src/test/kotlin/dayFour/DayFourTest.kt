package dayFour

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayFourTest {

    @Test
    fun shouldReturn2ValidPassportsWithSampleInput() {
        val result = DayFour().getCountOfValidPassports("src/test/resources/day_four_test_input.txt")
        assertEquals(2, result)
    }

    @Test
    fun shouldAddEachPassportFieldListToList() {
        val result = DayFour().getAllPassports("src/test/resources/day_four_small_test_input.txt")
        val passportOne = listOf("ecl:gry", "pid:860033327", "eyr:2020", "hcl:#fffffd", "byr:1937", "iyr:2017", "cid:147", "hgt:183cm")
        val passportTwo = listOf("hcl:#ae17e1", "iyr:2013", "eyr:2024", "ecl:brn", "pid:760753108", "byr:1931", "hgt:179cm")

        val expected = listOf(passportOne, passportTwo)
        assertEquals(expected, result)
    }

    @Test
    fun shouldReturnPassportIsValid() {
        val passport = listOf("ecl:gry", "pid:860033327", "eyr:2020", "hcl:#fffffd", "byr:1937", "iyr:2017", "cid:147", "hgt:183cm")
        assertTrue(DayFour().isValid(passport))
    }

    @Test
    fun shouldReturnPassportIsNotValid() {
        val passport = listOf("pid:860033327", "eyr:2020", "hcl:#fffffd", "byr:1937", "iyr:2017", "cid:147", "hgt:183cm")
        assertFalse(DayFour().isValid(passport))
    }
}

//ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
//byr:1937 iyr:2017 cid:147 hgt:183cm
//
//iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884
//hcl:#cfa07d byr:1929
//
//hcl:#ae17e1 iyr:2013
//eyr:2024
//ecl:brn pid:760753108 byr:1931
//hgt:179cm
//
//hcl:#cfa07d eyr:2025 pid:166559648
//iyr:2011 ecl:brn hgt:59in