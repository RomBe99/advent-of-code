package com.rombe.advnt.of.code.year2020.day2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.nio.file.Path
import kotlin.io.path.useLines

class PasswordPolicyParserTest : StringSpec({
    val pathToData = Path.of("./src/test/resources/year2020/day2/input.txt")

    "Password policies amount" {
        val expectedPoliciesAmount = 1000
        val actualPoliciesAmount = pathToData.useLines { lines ->
            lines
                .map {
                    it.toPasswordPolicy(dataSeparator = " ", rangeSeparator = "-")
                }
                .count()
        }

        actualPoliciesAmount shouldBe expectedPoliciesAmount
    }

})
