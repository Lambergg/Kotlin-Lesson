//Урок №7

//Создания консольного калькулятора

fun main() {
    println("Добро пожаловать в консольный калькулятор!")

    while (true) { // Бесконечный цикл
        print("Введите операцию ( + , - , * , / ) или 'exit' для выхода:")
            val operation = readLine()

// Проверка на выход​
        if (operation == "exit") {
            println("Программа завершена!")
            break // Выход из цикла​
        }

        print("Введите первое число: ")
        val firstNumber = readLine()?.toDoubleOrNull()
        if (firstNumber == null) {
            println("Ошибка: введите корректное число.")
            continue // Возвращаемся к началу цикла
        }

        print("Введите второе число: ")
        val secondNumber = readLine()?.toDoubleOrNull()
        if (secondNumber == null) {
            println("Ошибка: введите корректное число.")
            continue // Возвращаемся к началу цикла
        }

// Выполнение операции в зависимости от ввода
        val result = when (operation) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> {
            if (secondNumber != 0.0) {
                firstNumber / secondNumber
            } else {
                println("Ошибка: деление на ноль!")
                continue // Возвращаемся к началу цикла
            }
        }
            else -> {
                println("Ошибка: неверная операция!")
                continue // Возвращаемся к началу цикла
            }
        }
// Вывод результата
        println("Результат: $result")
    }
}