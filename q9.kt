

fun main() {
    val choice = 1
    val a = 10
    val b = 5

    when (choice) {
        1 -> println("Addition: ${a + b}")
        2 -> println("Subtraction: ${a - b}")
        3 -> println("Multiplication: ${a * b}")
        4 -> println("Division: ${a / b}")
        else -> println("Invalid Choice")
    }
}