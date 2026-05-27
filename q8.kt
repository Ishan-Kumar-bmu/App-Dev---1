
fun isPalindrome(num: Int): Boolean {
    var n = num
    var rev = 0
    val original = num

    while (n > 0) {
        val digit = n % 10
        rev = rev * 10 + digit
        n /= 10
    }

    return original == rev
}

fun main() {
    println(isPalindrome(121))
}