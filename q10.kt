

fun factorial(n: Int): Int {
    var fact = 1

    for (i in 1..n) {
        fact *= i
    }

    return fact
}

fun main() {
    println("Factorial: ${factorial(5)}")
}