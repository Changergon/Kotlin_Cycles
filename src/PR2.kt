fun main() {
    val secretNumber = (1..9).random()
    var guess: Int?

    do {
        print("Угадайте число от 1 до 9: ")
        guess = readlnOrNull()?.toIntOrNull()

        when {
            guess == null -> println("Ошибка! Введите число.")
            guess !in 1..9 -> println("Число должно быть от 1 до 9!")
            guess < secretNumber -> println("Загаданное число больше!")
            guess > secretNumber -> println("Загаданное число меньше!")
        }
    } while (guess != secretNumber)

    println("Поздравляю! Вы угадали число $secretNumber")
}