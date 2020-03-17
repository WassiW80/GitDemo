fun add(num1:Int,num2:Int):Int{
    return num1+num2
}
fun add(num1:Int,num2:Int,num3:Int):Int{
    return num1+num2+num3
}
fun add(num1:Double,num2:Double):Double{
    return num1+num2
}

fun main()
{
    println("2 Int Para  ${add(4,5)}")
    println("3 Int Para  ${add(3,4,5)}")
    println("2 Double Para  ${add(3.123,4.0)}")
}