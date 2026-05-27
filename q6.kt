
fun main() {
    val marks = 85

    val grade = when {
        marks >= 90 -> "A+"
        marks >= 80 -> "A"
        marks >= 70 -> "B"
        marks >= 60 -> "C"
        marks >= 50 -> "D"
        else -> "F"
    }

    println("Grade: $grade")
}