fun main() {
    print("Введите число: ")
    val input = readlnOrNull() ?: ""



    var evenCount = 0
    var oddCount = 0

    for (char in input) {
        val digit = char.toString().toInt()
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }

    println("Четных цифр: $evenCount, нечетных цифр: $oddCount")
}