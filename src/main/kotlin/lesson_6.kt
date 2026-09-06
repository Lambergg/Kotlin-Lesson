//Урок №6

//Операции с примитивными типами
fun main() {
        val firstName = "Alice"
        val lastName = "Smith"
        val stringBuilder = kotlin.text.StringBuilder()
        stringBuilder.append(firstName)
        .append(" ")
        .append(lastName)
        val fullName = stringBuilder.toString()
        println(fullName) // Вывод: Alice Smith
}

//fun main() {
//val greeting = "Hello"
//val name: String = "Alice"
//val message = "$greeting," + " дорогая" + " $name!" //
//Форматирование строк
//println(message) // Вывод: Hello, дорогая Alice!!
//}

//fun main() {
//val greeting = "Hello Alice!"
//val message = greeting.substring(0,5) // извлечение
//println(message) // Вывод: Hello
//}

//fun main() {
//val greeting = "Hello"
//val name: String = "Alice"
//val message = "$greeting, $name!" // Форматирование строк
//println(message) // Вывод: Hello, Alice!
//}

//fun main() {
//val firstName = "Alice"
//val lastName = "Smith"
//val stringBuilder = kotlin.text.StringBuilder()
//stringBuilder.append(firstName)
//.append(" ")
//.append(lastName)
//val fullName = stringBuilder.toString()
//println(fullName) // Вывод: Alice Smith
//}

//fun main() {
//val sum = 10 + 5 // 15
//}

//Операторы ==, !=, >, <, >=, <= позволяют сравнивать числовые значения.
//fun main() {
//val isEqual = (10 == 10) // true
//}

//Преобразование типов
//Методы toInt(), toDouble(), toString() позволяют преобразовывать значения между
//разными типами.
//fun main() {
//val number: Double = 3.14
//val intValue: Int = number.toInt() // 3
//}

//Округление
//Функции:
//— kotlin.math.round() позволяет округлять числа до ближайшего целого;
//— kotlin.math.floor() позволяет округлять числа вниз до ближайшего целого;
//— kotlin.math.ceil() позволяет округлять числа вверх до ближайшего целого.

//fun main() {
//val number1 = 3.2
//val number2 = 3.5
//val number3 = 3.8
//println(kotlin.math.round(number1)) // Вывод: 3.0
//println(kotlin.math.round(number2)) // Вывод: 4.0
//println(kotlin.math.round(number3)) // Вывод: 4.0
//}

//fun main() {
//val number1 = 3.2
//val number2 = 3.5
//val number3 = 3.8
//val number4 = -2.3
//val number5 = -3.8
//println(kotlin.math.floor(number1)) // Вывод: 3.0
//println(kotlin.math.floor(number2)) // Вывод: 3.0
//println(kotlin.math.floor(number3)) // Вывод: 3.0
//println(kotlin.math.floor(number4)) // Вывод: -3.0
//println(kotlin.math.floor(number5)) // Вывод: -4.0
//}

//fun main() {
//val number1 = 3.2
//val number2 = 3.5
//val number3 = 3.8
//println(kotlin.math.ceil(number1)) // Вывод: 4.0
//println(kotlin.math.ceil(number2)) // Вывод: 4.0
//println(kotlin.math.ceil(number3)) // Вывод: 4.0
//}

//import kotlin.math.pow
//fun main() {
//val power = 2.0.pow(3) // 8.0
//println(power) // Вывод: 8.0
//}

//import kotlin.math.sqrt
//fun main() {
// Нахождение квадратного корня из 16.0
//val squareRoot = sqrt(16.0) // 4.0
//println("Квадратный корень из 16 равен: $squareRoot") // Вывод:
//Квадратный корень из 16 равен: 4.0
//}

//import kotlin.math.abs
//fun main() {
// Нахождение абсолютного значения
//val negativeValue = -5.0
//val absoluteValue = abs(negativeValue) // 5.0
//println("Абсолютное значение $negativeValue равно: $absoluteValue")
// Вывод: Абсолютное значение -5.0 равно: 5.0
//}

//import kotlin.math.sin // Импортируем функцию sin
//import kotlin.math.PI // Импортируем константу PI
//fun main() {
// Нахождение синуса угла 90 градусов (PI/2 радиан)
//val angleInRadians = PI / 2
// Угол в радианах
//val sineValue = sin(angleInRadians) // Вычисление синуса
//println("Синус угла 90 градусов (PI/2): $sineValue") // Вывод: 1.0
//}

//import kotlin.math.cos // Импортируем функцию cos
//import kotlin.math.PI // Импортируем константу PI
//fun main() {
// Нахождение косинуса угла 0 радиан (или 0 градусов)
//val angleInRadians = 0.0 // Угол в радианах
//val cosineValue = cos(angleInRadians) // Вычисление косинуса
//println("Косинус угла 0 радиан: $cosineValue") // Вывод: 1.0
//}

//import kotlin.math.tan // Импортируем функцию tan
//import kotlin.math.PI // Импортируем константу PI
//fun main() {
// Нахождение тангенса угла 45 градусов (PI/4 радиан)
//val angleInRadians = PI / 4 // Угол в радианах
//val tangentValue = tan(angleInRadians) // Вычисление тангенса
//println("Тангенс угла 45 градусов (PI/4): $tangentValue") // Вывод:
//1.0
//}

//import kotlin.math.log10 // Импортируем функцию log10
//fun main() {
//Нахождение десятичного логарифма числа 100.0
//val log10Value = log10(100.0) // 2.0
//println("Десятичный логарифм числа 100: $log10Value") // Вывод:
//Десятичный логарифм числа 100: 2.0
//}