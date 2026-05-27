

fun main() {
    val list = listOf(10, 50, 20, 80, 30)

    val secondLargest = list.distinct().sortedDescending()[1]

    println("Second Largest = $secondLargest")
}