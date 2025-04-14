fun main() {
    print("Введите число: ")
    val number = readlnOrNull()?.toLongOrNull() ?: run {
        println("Ошибка ввода! Должно быть целое число.")
        return
    }

    if (number <= 0) {
        println("Число должно быть положительным!")
        return
    }

    print("Делители числа $number: ")
    for (i in 1..number) {
        if (number % i == 0L) {
            print("$i ")
        }
    }
}