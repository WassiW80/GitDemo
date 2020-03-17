fun sum(num1:Int,num2:Int): Int {
    return num1+num2
}
val sum ={num1:Int,num2:Int ->
    num1+num2
}
fun main() {
    val addnumber = sum(3,4)
    println("AddNumber= $addnumber")

    println("List of Number")
    val listOfNumbers= listOf(10,20,30,40)
    //normal for loop
    for (number in listOfNumbers)
        println(number)

    //lamda function
    println("Lamda for loop")
    listOfNumbers.forEach { number->
        println(number)
    }
}