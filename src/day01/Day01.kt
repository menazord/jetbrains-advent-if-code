package day01

import readInput

fun main() {

    // how many readings so far
    // what's the last reading
    var lastReading = 0;
    // and how many of them where increases (from the previous reading)
    var increases = 0;
    // The list of readings (input)
    val readings = readInput("day01/input")

    for ((count, reading) in readings.withIndex()) {
        // Ignore the first reading as increment, just store it
        if (count > 0) {
            if (lastReading < reading.toInt()) {
                increases++;
            }
        }
        lastReading = reading.toInt()
    }
    print("Got".plus(" ").plus(increases).plus(" increases"))
}
