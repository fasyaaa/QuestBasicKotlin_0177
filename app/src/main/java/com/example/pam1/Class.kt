package com.example.pam1

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

//    Prints the value of the properties: email
    println(contact.email)

}