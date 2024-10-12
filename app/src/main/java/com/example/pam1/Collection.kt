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

fun main(){
    ContohList()
}