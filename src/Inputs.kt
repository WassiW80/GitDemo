fun main() {
    print("Enter name")
    val name:String = readLine()!!.toString()
    print("Enter age")
    val age = readLine()!!.toInt()
    print("Enter gpa")
    val gpa = readLine()!!.toDouble()
    println("Your name is $name")
    println("Your age is $age")
    println("Your gpa is $gpa")
}