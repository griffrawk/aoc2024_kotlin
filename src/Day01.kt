import kotlin.math.absoluteValue

fun main() {
    fun part1(input: List<String>): Int {
        val s1 = mutableListOf<Int>()
        val s2 = mutableListOf<Int>()
        input.forEach { x ->
            x.split(Regex("\\s+")) // Split the line by whitespace
                .map(String::toInt) // Convert strings to integers
                .let { (e1, e2) -> s1.add(e1); s2.add(e2) } // Add to respective lists
        }

        s1.sort() // Sort the first list
        s2.sort() // Sort the second list
//        return (s1 zip s2).fold(0) { sum, (a, b) -> sum + (a - b).absoluteValue }
        return (s1 zip s2).sumOf { (a, b) -> (a - b).absoluteValue }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 11)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
//    part2(input).println()
}
