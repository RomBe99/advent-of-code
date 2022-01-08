package com.rombe.advnt.of.code.year2020.day3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class NavigationTest : FreeSpec({
    val fileName = "./src/test/resources/year2020/day3/input.txt"
    val treeSymbol = '#'

    "Find trees amount" - {
        listOf(
            NavigationData(stepX = 1, stepY = 1, treeSymbol = treeSymbol) to 79,
            NavigationData(stepX = 3, stepY = 1, treeSymbol = treeSymbol) to 216,
            NavigationData(stepX = 5, stepY = 1, treeSymbol = treeSymbol) to 91,
            NavigationData(stepX = 7, stepY = 1, treeSymbol = treeSymbol) to 96,
            NavigationData(stepX = 1, stepY = 2, treeSymbol = treeSymbol) to 45,
        ).forEach { (navigationData, expectedAmount) ->
            "Where for data = $navigationData expected amount $expectedAmount" {
                findTreesAmount(fileName, navigationData) shouldBe expectedAmount
            }
        }
    }
})
