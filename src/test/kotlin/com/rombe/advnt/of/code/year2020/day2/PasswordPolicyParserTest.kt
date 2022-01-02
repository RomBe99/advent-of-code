package com.rombe.advnt.of.code.year2020.day2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PasswordPolicyParserTest : StringSpec({

    "Correct passwords count" {
        val expectedCorrectPasswordsAmount = 434
        val actualCorrectPasswordsAmount = getPasswordPolicies("./src/test/resources/year2020/day2/input.txt")
            .count(PasswordPolicy::isValid)

        actualCorrectPasswordsAmount shouldBe expectedCorrectPasswordsAmount
    }

})
