import kotlin.math.abs

fun main(){
    print("Enter first number")
    val number1= readLine()!!.toDouble()
    print("Enter second number")
    val number2= readLine()!!.toDouble()
    var sum=number1+number2
    println("Addition of 2 number is $sum")
    val sub= abs(number2-number1)
    println("Subtraction of 2 number is $sub")
    var mul=number2*number1
    println("multiplication of 2 number is $mul")
    var div=number1/number2
    println("division of 2 number is $div")
}