const val exitKey = "exit"

fun main() {
    //var input: String?
    //println("Введите числа. Для выхода введите exit")
    //Запрашиваем ввод от пользователя
    //do {
        //input=readLine()
        //val number = input?.toIntOrNull()
        //number?.let{
            //println("Вы ввели число: $number")
        //}?:run{
            //if (input != exitKey) {
                //println("Ошибка: введите корректное число или exit!")
            //}
        //}
    //} while (input != exitKey)
    //println("Вы вышли из программы")

    //val name = "value" //- для не изменяемых значений
    //var name = variable // - для изменяемых значений
    //get() = field - геттер для получения значения

    //class Person {
    //    var name: String = "Ivan" // Kotlin автоматически создал get() и set()
    //}
    //val p = Person()
    //println(p.name) // Вызывается get() -> выводит "Ivan"
    //p.name = "Petr" // Вызывается set() -> меняет значение на "Petr"

    //class User {
        //var login: String = "user123"

        // Геттер для email: он не хранится отдельно, а собирается из логина
        //var email: String
            //get() = "$login@mail.ru"
    //}

    //class Example {
    //    var x: Int = 0
    //        get() {
    //            // Мы явно обращаемся к полю field
    //            return field * 2
    //        }
    //}

    // set(value) {
    // field = value
    // } - сеттер для изменения значения
    //class Account {
    //    private var _balance: Double = 0.0
    //
    //    var balance: Double
    //        get() = _balance
    //        set(value) {
    //            // Логика сеттера: проверяем, чтобы баланс не был отрицательным
    //            if (value >= 0) {
    //                _balance = value // Записываем значение во "внутреннее поле"
    //            } else {
    //                println("Баланс не может быть отрицательным!")
    //            }
    //        }
    //}

    //const val PI: Double = 3.14 - для констант
    //println($name) - для вывода значения
    //val name: String = readLine() - для ввода значения
}