package com.car.maintain

fun ArrayList<Int>.findMax(){
    var maxNumber=0
    for(item in this)
        if(item>maxNumber) {
            maxNumber=item
            println(maxNumber)
        }
}
fun main() {
    val listOfElements=ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(4)
    listOfElements.add(6)
    listOfElements.add(9)
    for (item in listOfElements)
    println(item)

    println("MaxApp")
    listOfElements.findMax()
}