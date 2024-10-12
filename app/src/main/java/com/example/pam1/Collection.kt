package com.example.pam1

// List adalah Kumpulan data yang disusun secara berurutan
// List bersifat ordered, artinya data yang dimasukkan akan memilki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList() {
    println("====== List ======")
//    List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

//    List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

//    Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

//    Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

//    Mengubah data di dalaam List Mutable
    shape[0] = "Oval"
    println(shape)

//    List Read-Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}

// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat undordered, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map bersifat Mutable dan Read Only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {
    println("====== Map ======")
//    Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

// Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

//    Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println()

//    Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

//    Mengubah data dari Map Mutable
    shape["Square"] = 5
    println(shape)

//    Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {

}

fun main(){
    ContohList()
    ContohMap()
}