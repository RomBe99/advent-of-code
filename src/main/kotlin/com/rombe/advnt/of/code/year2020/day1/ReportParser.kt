package com.rombe.advnt.of.code.year2020.day1

import java.nio.file.Path
import kotlin.io.path.bufferedReader

fun findTwoEntriesForSum(pathToData: Path, sumResult: Int): Pair<Int, Int> {

    pathToData.bufferedReader().use { reader ->
        var number = reader.readLine()?.toInt()
        val numbers = HashMap<Int, Int>()

        while (number != null) {
            val temp = numbers[number]

            if (temp != null) {
                return number to temp
            }

            numbers[sumResult - number] = number

            number = reader.readLine()?.toInt()
        }
    }

    throw Exception("Can't found numbers for sum $sumResult in file $pathToData")
}