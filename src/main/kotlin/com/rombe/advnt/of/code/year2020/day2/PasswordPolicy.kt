package com.rombe.advnt.of.code.year2020.day2

data class PasswordPolicy(
    val occurrencesRange: IntRange,
    val letter: Char,
    val password: String
) {
    val isValid get() = password.count(letter::equals) in occurrencesRange
}
