package com.rombe.advnt.of.code.year2020.day2

import java.nio.file.Path
import kotlin.io.path.useLines

fun getPasswordPolicies(filePath: Path) = filePath.useLines { lines ->
    lines
        .map { line -> line.toPasswordPolicy(dataSeparator = " ", rangeSeparator = "-") }
        .toList()
}

fun String.toPasswordPolicy(dataSeparator: String, rangeSeparator: String): PasswordPolicy {
    val data = split(dataSeparator)
    val range = data[0].split(rangeSeparator).let {
        it[0].toInt()..it[1].toInt()
    }

    return PasswordPolicy(occurrencesRange = range, letter = data[1][0], password = data[2])
}
