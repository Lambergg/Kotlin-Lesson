//Урок №4


fun main() {

//Числовые типы данных: Byte, Short, Int, Long, Float, Double

//Логический тип данных: Boolean

//Символьный тип данных: Char

//Строковый тип данных: String

//Коллекции: List, Set, Map, Array, MutableList, MutableSet, MutableMap

//Пользовательские классы: Любые классы и интерфейсы создаваемые пользователем

//Enum: Специальный класс который предоставляет фиксированный набор констант

//Data class: Класс для хранения данных

// data class User(val name: String, val age: Int) - класс для хранения данных

//Nullable: Тип данных который может хранить значение null. string?, int?, boolean?

//Специальные типы данных: Any, Unit, Nothing

// fun printvalue(value: Any) {
    //println(value)
//}
//Any - любой тип данных

//fun printGreeting(name: String): Unit {
//println("Hello, $name!")
//}
//printGreeting("Ivan")
//Unit - тип данных который не возвращает значение

//Nothing - Специальный тип данных обозначающий что функция никогда не завершится.
// Используется для указания ненормальных ситуаций.

//String to Int
//val intString = "123"
//val intValue: Int? = intString.toIntOrNull()
// println(intValue)

//String to Double
//val doubleString = "123.45"
//val doubleValue: Double? = doubleString.toDoubleOrNull()
//println(doubleValue)

//String to Float
//val floatString = "123.45"
//val floatValue: Float? = floatString.toFloatOrNull()
//println(floatValue)

//Если преобразование не удалось
//val invalidString = "not a number"
//val invalidValue: Int? = invalidString.toIntOrNull()
//println("Преобразование некорректной строки в Int: $invalidValue")

//Int to String
//val number = 100
//val numberAsString: String = number.toString()
//println("$numberAsString")

//String to Boolean
//val stringValue = "true"
//val booleanValue: Boolean? = stringValue.toBooleanOrNull()
//println(booleanValue)

//Boolean to String
// val isValid: Boolean = true
// val isValidAsString: String = isValid.toString()
// println("Boolean как строка: $isValidAsString")

//println("Введите число:")
//val input = readLine() // Считываем ввод пользователя
// Пробуем преобразовать введенное значение в Int
//val number = input?.toIntOrNull()
//if (number != null) {
//println("Вы ввели число: $number")
//} else {
//println("Ошибка: введите корректное целое число!")
//}

}