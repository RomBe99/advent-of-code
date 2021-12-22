package com.rombe.advnt.of.code.year2020.day1

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.FileNotFoundException

class ReportParserTest : StringSpec ({

    "Find two numbers which in sum gives 2020" {
        val firstNumber = 1939
        val secondNumber = 81

        val twoNumbers = findTwoEntriesForSum(
            fileName = "./src/test/resources/year2020/day1/input.txt",
            sumResult = firstNumber + secondNumber
        )

        twoNumbers.first shouldBe firstNumber
        twoNumbers.second shouldBe secondNumber
    }

    "If file not exist" {
        shouldThrow<FileNotFoundException> {
            findTwoEntriesForSum(
                fileName = "random path",
                sumResult = 21
            )
        }
    }

})