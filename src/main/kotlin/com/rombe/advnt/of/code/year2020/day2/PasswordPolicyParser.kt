package com.rombe.advnt.of.code.year2020.day2

fun String.toPasswordPolicy(dataSeparator: String, rangeSeparator: String): PasswordPolicy {
    val data = split(dataSeparator)
    val numbers = data[0].split(rangeSeparator)

    return PasswordPolicy(
        firstNumber = numbers[0].toInt(),
        secondNumber = numbers[1].toInt(),
        letter = data[1][0],
        password = data[2]
    )
}
