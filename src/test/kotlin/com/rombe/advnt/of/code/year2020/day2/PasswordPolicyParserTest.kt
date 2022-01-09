package com.rombe.advnt.of.code.year2020.day2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.nio.file.Path

class PasswordPolicyParserTest : StringSpec({
    val pathToData = Path.of("./src/test/resources/year2020/day2/input.txt")

    "Correct passwords count" {
        val expectedCorrectPasswordsAmount = 434
        val actualCorrectPasswordsAmount = getPasswordPolicies(pathToData).count(PasswordPolicy::isValid)

        actualCorrectPasswordsAmount shouldBe expectedCorrectPasswordsAmount
    }

})
