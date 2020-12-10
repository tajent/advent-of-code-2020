package dayFour

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayFourTest {

    @Test
    fun shouldReturn2ValidPassportsWithSampleInput() {
        val result = DayFour().getCountOfValidPassportsByFields("src/test/resources/day_four_test_input.txt")
        assertEquals(2, result)
    }

    @Test
    fun shouldReturn4ValidPassportsWithPartTwoSampleInput() {
        val result = DayFour().getCountOfValidPassportsByFieldsAndValues("src/test/resources/day_four_part_two_test_input.txt")
        assertEquals(4, result)
    }


    @Test
    fun shouldReturnPassportIsValidByField() {
        val passport = listOf("ecl:gry", "pid:860033327", "eyr:2020", "hcl:#fffffd", "byr:1937", "iyr:2017", "cid:147", "hgt:183cm")
        assertTrue(DayFour().isValidByFields(passport))
    }

    @Test
    fun shouldReturnPassportIsValidByFieldAndValue() {
        val passport = listOf("pid:087499704", "hgt:74in", "ecl:grn", "iyr:2012", "eyr:2030", "byr:1980", "hcl:#623a2f")
        assertTrue(DayFour().isValidByFieldsAndValues(passport))
    }

    @Test
    fun shouldReturnPassportIsNotValidByField() {
        val passport = listOf("pid:860033327", "eyr:2020", "hcl:#fffffd", "byr:1937", "iyr:2017", "cid:147", "hgt:183cm")
        assertFalse(DayFour().isValidByFields(passport))
    }

    @Test
    fun shouldReturnTrueForValidHeight() {
        assertTrue(DayFour().isValidHeight("163cm"))
        assertTrue(DayFour().isValidHeight("73in"))
        assertFalse(DayFour().isValidHeight("73cm"))
        assertFalse(DayFour().isValidHeight("163cmd"))
        assertFalse(DayFour().isValidHeight("194cm"))
        assertFalse(DayFour().isValidHeight("58in"))
        assertTrue(DayFour().isValidHeight("74in"))
    }

    @Test
    fun shouldReturnTrueForValidHairColour() {
        assertTrue(DayFour().isValidHairColour("#874012"))
        assertTrue(DayFour().isValidHairColour("#bdcffa"))
        assertTrue(DayFour().isValidHairColour("#12cffa"))
        assertFalse(DayFour().isValidHairColour("3bdcffa"))
        assertFalse(DayFour().isValidHairColour("#bdcffg"))
        assertFalse(DayFour().isValidHairColour("#87401233"))
        assertTrue(DayFour().isValidHairColour("#623a2f"))
    }

    @Test
    fun shouldReturnTrueForValidEyeColour() {
        assertTrue(DayFour().isValidEyeColour("amb"))
        assertTrue(DayFour().isValidEyeColour("gry"))
        assertFalse(DayFour().isValidEyeColour("afdasfadf"))
        assertFalse(DayFour().isValidEyeColour("ambamb"))
        assertFalse(DayFour().isValidEyeColour("01233"))
        assertTrue(DayFour().isValidEyeColour("grn"))
    }

    @Test
    fun shouldReturnTrueForValidPassportId() {
        assertTrue(DayFour().isValidPassportId("567345348"))
        assertTrue(DayFour().isValidPassportId("000000089"))
        assertFalse(DayFour().isValidPassportId("afdasfadf"))
        assertFalse(DayFour().isValidPassportId("45667"))
        assertTrue(DayFour().isValidPassportId("087499704"))
    }

    @Test
    fun shouldCheckValidByNumberRanges() {
        val byrValidRange = 1920..2002
        assertTrue("1930".toInt() in byrValidRange)
        assertFalse("2003".toInt() in byrValidRange)
    }

    @Test
    fun shouldCheckFieldAndValueValid() {
        assertTrue(DayFour().isValidValue("byr", "2002"))
        assertFalse(DayFour().isValidValue("byr", "2003"))
        assertTrue(DayFour().isValidValue("hgt", "60in"))
        assertTrue(DayFour().isValidValue("hgt", "190cm"))
        assertFalse(DayFour().isValidValue("hgt", "190in"))
        assertFalse(DayFour().isValidValue("hgt", "190"))
        assertTrue(DayFour().isValidValue("hcl", "#123abc"))
        assertFalse(DayFour().isValidValue("hcl", "#123abz"))
        assertTrue(DayFour().isValidValue("ecl", "brn"))
        assertFalse(DayFour().isValidValue("ecl", "wat"))
        assertTrue(DayFour().isValidValue("pid", "000000001"))
        assertFalse(DayFour().isValidValue("ecl", "0123456789"))
    }
}