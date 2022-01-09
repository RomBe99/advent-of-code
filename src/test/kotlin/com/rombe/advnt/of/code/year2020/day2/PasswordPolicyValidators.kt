package com.rombe.advnt.of.code.year2020.day2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import java.nio.file.Path
import kotlin.io.path.useLines

class PasswordPolicyValidators : FreeSpec({
    fun countValidPasswordsByFilter(filter: PasswordPolicy.() -> Boolean) =
        Path.of("./src/test/resources/year2020/day2/input.txt").useLines { lines ->
            lines
                .map { line ->
                    line.toPasswordPolicy(dataSeparator = " ", rangeSeparator = "-")
                }
                .filter(filter)
                .count()
        }

    "Counting passwords by validator which checks" - {
        listOf(
            Triple(PasswordPolicy::isLetterInRange, 434, "Number of occurrences letter in range"),
            Triple(PasswordPolicy::isLetterOnPositions, 509, "Letter position in password")
        ).forEach { (validator, expectedValidPasswordsAmount, testName) ->
            testName {
                val actualValidPasswordsAmount = countValidPasswordsByFilter(validator)

                actualValidPasswordsAmount shouldBe expectedValidPasswordsAmount
            }
        }
    }
})
