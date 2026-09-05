//Урок №5

//Null safety

data class Person(private val name: String, private val age: Int)

fun main() {
val person1 = Person("Alice", 30)
val person2 = Person("Alice", 30)
val person3 = Person("Bob", 25)
// Сравнение содержимого
if (person1 == person2) {
println("person1 и person2 равны по содержимому.") // Этот блок будет выполнен.
} else {
println("person1 и person2 не равны.")
}
// Сравнение ссылок
if (person1 === person2) {
println("person1 и person2 равны по ссылке.")
} else {
println("person1 и person2 не равны по ссылке.") // Этот блок
//будет выполнен.
}
// Сравнение с другим объектом
if (person1 == person3) {
println("person1 и person3 равны по содержимому.")
} else {
println("person1 и person3 не равны.") // Этот блок будет выполнен.
}
}

//fun main() {
//var name: String? = null
//}

//fun main() {
//val name: String? = null
//val length = name?.length // Если name равно null, length будет
//также равно null.
//}

//fun main() {
//val name: String? = null
// Если name равно null, length будет также равно null
// Это аналогично следующему коду с использованием if:
//val length = if (name != null) name.length else null
//Или можно использовать безопасный вызов (?.)
//val safeLength = name?.length // length будет равен null, если name
//равно null
//println("Длина имени: $length")
//println("Безопасная длина имени: $safeLength")
//}

//fun main() {
//val name: String? = null
//val displayName = name ?: "Гость" // Если name равно null, будет
//использовано значение "Гость".
//}

//fun main() {
//val name: String? = null
//name?.let {
//println("Длина вашего имени: ${it.length}")
//} ?: println("Имя не было задано.")
//}

//fun main() {
//val name: String? = "Alice"
//val length = name!!.length // Если name не равно null, length будет
//равно 5.
//println("Длина имени: $length")
//val anotherName: String? = null
//// val anotherLength = anotherName!!.length // Это вызовет
//исключение KotlinNullPointerException, если раскомментировать.
//}

//fun printType(value: Any) {
//if (value is String) {
//println("Это строка длиной: ${value.length}")
//} else {
//println("Это не строка.")
//}
//}
//fun main() {
//printType("Hello")
//printType(123)
// Вывод: Это строка длиной: 5
// Вывод: Это не строка.
//}

//fun castToString(value: Any): String {
//return value as String // Явное приведение
//}
//fun main() {
//val result = castToString("Hello, World!")
//println(result) // Вывод: Hello, World!
//// castToString(123) // Это вызовет ClassCastException, если
//раскомментировать
//}

//open class Animal(val name: String)
//class Dog(name: String) : Animal(name)
//class Cat(name: String) : Animal(name)
//fun main() {
//// Создаем список объектов типа Animal
//val animals: List<Animal> = listOf(Dog("Buddy"), Cat("Whiskers"),
//Dog("Max"), Cat("Mittens"))
//// Обрабатываем каждый объект в списке
//for (animal in animals) {
//// Используем безопасное приведение
//val dog = animal as? Dog
//if (dog != null) {
//println("Это собака с именем: ${dog.name}")
//} else {
//println("Это не собака: ${animal.name}")
//}
//}
//}

//fun main() {
//val a: Int = 5
//val b: Int = 10
//if (a == b) {
//println("a и b равны.")
//} else {
//println("a и b не равны.") // Вывод: a и b не равны.
//}
//}

//fun main() {
//val str1: String = "Hello"
//val str2: String = "Hello"
//// Сравнение содержимого
//if (str1 == str2) {
//println("str1 и str2 равны по содержимому.") // Вывод: str1 и
//str2 равны по содержимому.
//}
// Сравнение ссылок
//if (str1 === str2) {
//println("str1 и str2 равны по ссылке.")
//} else {
//println("str1 и str2 не равны по ссылке.") // Обычно эта строка
//выполняется.
//}
//}

//data class Person(private val name: String, private val age: Int)
//fun main() {
//val person1 = Person("Alice", 30)
//val person2 = Person("Alice", 30)
//val person3 = Person("Bob", 25)
//
// Сравнение содержимого
//if (person1 == person2) {
//println("person1 и person2 равны по содержимому.") // Этот блок
//будет выполнен.
//} else {
//println("person1 и person2 не равны.")
//}
// Сравнение ссылок
//if (person1 === person2) {
//println("person1 и person2 равны по ссылке.")
//} else {
//println("person1 и person2 не равны по ссылке.") // Этот блок
//будет выполнен.
//}
//// Сравнение с другим объектом
//if (person1 == person3) {
//println("person1 и person3 равны по содержимому.")
//} else {
//println("person1 и person3 не равны.") // Этот блок будет
//выполнен.
//}
//}

//data class Person(val name: String, val age: Int) {
// Переопределение метода equals()
//override fun equals(other: Any?): Boolean {
//if (this === other) return true
//if (other !is Person) return false
//return name == other.name && age == other.age
//}
// Переопределение метода hashCode()
//override fun hashCode(): Int {
//var result = name.hashCode()
//result = 31 * result + age
//return result
//}
//}