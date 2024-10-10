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

fun ContohSet(){
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Lingkaran", "Persegi", "Segitiga")
    println(shape)

    //Menambahkan data ke dalam Set Mutable
    shape.add("Persegi Panjang")
    println(shape)

    //Menghapus data dari Set Mutable
    shape.remove("Lingkaran")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

//Map adalah Kumpulan data yang disusun dalam pasangan key-value
//Map bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
//Map bersifat mutable, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
//Map Read-Only menggunakan mapOf
//Map Mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Lingkaran" to 1, "Persegi" to 2, "Segitiga" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Lingkaran" to 1, "Persegi" to 2, "Segitiga" to 3)
    println(shape)

    //Menambahkan data ke dalam Map Mutable
    shape["Persegi Panjang"] = 4
    println(shape)

    //Menghapus data dari Map Mutable
    shape.remove("Lingkaran")
    println(shape)

    //Mengubahkan data di dalam map Mutable
    shape["Persegi"] = 5
    println(shape)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}


fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}