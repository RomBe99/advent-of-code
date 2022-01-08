package com.rombe.advnt.of.code.year2020.day3

import java.io.FileNotFoundException
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.notExists

fun findTreesAmount(fileName: String, navigationData: NavigationData): Int {
    val pathToData = Path.of(fileName)

    if (pathToData.notExists()) {
        throw FileNotFoundException("File by $pathToData not found")
    }

    var treesAmount = 0

    Files.newBufferedReader(pathToData)?.use { reader ->
        var currentLine = reader.readLine()
        var currentX = 0

        while (currentLine != null) {
            val isTree = navigationData.treeSymbol == currentLine[currentX]

            if (isTree) {
                treesAmount++
            }

            currentX = (navigationData.stepX + currentX) % currentLine.length

            for (i in 0 until navigationData.stepY) {
                currentLine = reader.readLine()
            }
        }
    }

    return treesAmount
}
