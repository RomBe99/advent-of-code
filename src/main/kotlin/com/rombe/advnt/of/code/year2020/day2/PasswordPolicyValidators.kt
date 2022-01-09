package com.rombe.advnt.of.code.year2020.day2

/**
 * Checks the number of occurrences of an interval from firstNumber to secondNumber (inclusive)
 */
val PasswordPolicy.isLetterInRange get() = password.count(letter::equals) in firstNumber..secondNumber

/**
 * Checks if a letter is at firstNumber xor secondNumber positions
 */
val PasswordPolicy.isLetterOnPositions
    get() = (password[firstNumber - 1] == letter) xor (password[secondNumber - 1] == letter)
