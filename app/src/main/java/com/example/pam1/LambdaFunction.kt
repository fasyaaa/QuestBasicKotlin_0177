package com.example.pam1

// Lambda Function
// Lambda Function adalah fungsi yang tidak memiliki nama
// Lambda Function biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Function menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun upperCaseString(string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    upperCaseString("hello")
    println({
        string: String -> string.uppercase()
    }("hello"))
//    HELLO
}