package day01

import readInput

fun main() {
    // how many of them where increases (from the previous reading)
    var increases = 0;
    // The list of readings (input)
    val readings = readInput("day01/input")
    val allReadings = ArrayList<Int>()
    for (reading in readings) {
        allReadings.add(reading.toInt())
    }

    // Challenge #1
    // Single measure increases
    increases = allReadings
        .zipWithNext()
        .count { (prev, next) -> next > prev }
    println("Got".plus(" ").plus(increases).plus(" increases"))

    // Challenge #2
    // 3 measurement window increases
    increases = allReadings.windowed(3) { it.sum() }
        .zipWithNext()
        .count { (prev, next) -> next > prev }
    println("Got".plus(" ").plus(increases).plus(" 3-reading increases"))
}
