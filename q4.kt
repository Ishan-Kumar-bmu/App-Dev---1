
fun main() {
    val str = "Kotlin Programming"
    var count = 0

    for (ch in str.lowercase()) {
        if (ch in "aeiou") {
            count++
        }
    }

    println("Number of vowels: $count")
}