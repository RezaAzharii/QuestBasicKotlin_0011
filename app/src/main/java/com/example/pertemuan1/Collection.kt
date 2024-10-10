package com.example.pertemuan1

//List adalah Kumpulan data yang disusun secara berurutan dari
//List bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
//List bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
//List Read-Only menggunakan listof
//List Mutable menggunakan mutablelistof

fun main(){
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Lingkaran", "Persegi", "Segitiga")
    println(shape)
}