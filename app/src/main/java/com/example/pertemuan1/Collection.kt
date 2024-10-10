package com.example.pertemuan1

import android.graphics.drawable.shapes.Shape

//List adalah Kumpulan data yang disusun secara berurutan dari
//List bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
//List bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
//List Read-Only menggunakan listof
//List Mutable menggunakan mutablelistof

 fun ContohList(){
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Lingkaran", "Persegi", "Segitiga")
    println(shape)

    //Menambahkan data ke dalam list Mutable
    shape.add("Lingkaran")
    println(shape)

    //Menghapus data daru List Mutable
    shape.remove("Segitiga")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi/Tidak sama)
//Set bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
//Set bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
//Set Read-Only menggunakan setOf
//Set Mutable menggunakan mutableSetOf



fun main(){
    ContohList()
}