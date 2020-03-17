package com.car.maintain

data class Person(val name:String,val age:Int,val gender:String)

fun main() {
    val person = Person("Wassi",22,"Male")
    println("Name= ${person.name}\nAge= ${person.age}\nGender= ${person.gender}")
}