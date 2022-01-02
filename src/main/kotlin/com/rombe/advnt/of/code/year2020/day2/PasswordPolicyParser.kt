package com.rombe.advnt.of.code.year2020.day2

import java.io.FileNotFoundException
import java.nio.file.Files
import java.nio.file.Path
import java.util.*
import kotlin.io.path.notExists

fun getPasswordPolicies(fileName: String): List<PasswordPolicy> {
    val pathToData = Path.of(fileName)

    if (pathToData.notExists()) {
        throw FileNotFoundException("File by $pathToData not found")
    }

    val result = LinkedList<PasswordPolicy>()

    Files.newBufferedReader(pathToData)?.use { reader ->
        var line = reader.readLine()

        while (line != null) {
            result.add(line.toPasswordPolicy(dataSeparator = " ", rangeSeparator = "-"))

            line = reader.readLine()
        }
    }

    return result
}

private fun String.toPasswordPolicy(dataSeparator: String, rangeSeparator: String): PasswordPolicy {
    val data = split(dataSeparator)
    val range = data[0].split(rangeSeparator).let {
        it[0].toInt()..it[1].toInt()
    }

    return PasswordPolicy(occurrencesRange = range, letter = data[1][0], password = data[2])
}
