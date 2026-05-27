
fun main() {
    val list = listOf(1, 2, 2, 3, 3, 3, 4)

    val frequency = list.groupingBy { it }.eachCount()

    println(frequency)
}