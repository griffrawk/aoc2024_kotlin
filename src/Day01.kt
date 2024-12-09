import kotlin.math.absoluteValue

fun main() {
    fun part1(input: List<String>): Int {
        val s1 = mutableListOf<Int>()
        val s2 = mutableListOf<Int>()
        input.forEach { line ->
            line.split(Regex("\\s+"))                   // Split the line by whitespace
                .map(String::toInt)                     // Convert strings to integers
                .let { (a, b) -> s1.add(a); s2.add(b) } // Add to respective lists
        }

        s1.sort() // Sort the first list
        s2.sort() // Sort the second list
//        return (s1 zip s2).fold(0) { sum, (a, b) -> sum + (a - b).absoluteValue }
        return (s1 zip s2).sumOf { (a, b) -> (a - b).absoluteValue }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Read a test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    part1(testInput).let {
        println(it)
        check(it == 11)
    }

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).let {
        println(it)
        check(it == 1651298)
    }

//    part2(input).println()
}
