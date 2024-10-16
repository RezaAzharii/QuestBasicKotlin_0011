package com.example.pertemuan1

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withDefaultArgument(name: String = "Wahyu", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang: Int, lebar : Int) : Int{
    return panjang * lebar
}

fun main(){
    withoutParameter()
    withParameter("Bob")
    withNamedArgument(name = "Bob", age = 30)
    withDefaultArgument(age = 25)
    println(withReturn(panjang = 6, lebar = 2))
}