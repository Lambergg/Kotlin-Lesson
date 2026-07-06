package org.example

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
fun main() {
    val name = "Kotlin"
    //TIP Нажмите <shortcut actionId="ShowIntentionActions"/>, когда курсор находится на выделенном тексте
    // чтобы увидеть, как OpenIDE предлагает это исправить.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Нажмите <shortcut actionId="Debug"/>, чтобы начать отладку вашего кода. Мы установили одну <icon src="AllIcons.Debugger.Db_set_breakpoint"/> точку останова.
        // для вас, но вы всегда можете добавить больше, нажав <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}