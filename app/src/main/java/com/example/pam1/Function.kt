package com.example.pam1

fun withoutParameter() {
    println("== Without Parameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println("== With Parameter ==")
    println("Hello, $name!")
}

// Named argument
// Named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println("== With Named Argument ==")
    println("Hello, $name! You are $age years old.")
}

// Default parameter value
// Default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Adifa", age: Int) {
    println("== With Default Parameter")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang: Int, lebar: Int){
    return println(panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}