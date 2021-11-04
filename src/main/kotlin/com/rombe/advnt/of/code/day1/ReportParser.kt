package com.rombe.advnt.of.code.day1

import java.io.FileNotFoundException
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.notExists

fun findTwoEntriesForSum(fileName: String, sumResult: Int = 2020): Pair<Int, Int> {
    val pathToData = Path.of(fileName)

    if (pathToData.notExists()) {
        throw FileNotFoundException("File by $pathToData not found")
    }

    Files.newBufferedReader(pathToData)?.use { reader ->
        var number = reader.readLine()?.toInt()
        val numbers = mutableMapOf<Int, Int>()

        while (number != null) {
            val temp = numbers[number]

            if (temp == null) {
                numbers[sumResult - number] = number
            } else {
                return number to temp
            }

            number = reader.readLine()?.toInt()
        }
    }

    throw Exception("Can't found numbers for sum $sumResult in file $pathToData")
}

fun main() {
    val result = findTwoEntriesForSum(fileName = "./src/main/resources/input/day1.txt").let { it.first * it.second }

    println(result)
}