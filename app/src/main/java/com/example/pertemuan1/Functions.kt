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


fun main(){
    withoutParameter()
    withParameter("Bob")
    withNamedArgument(name = "Bob", age = 30)
}