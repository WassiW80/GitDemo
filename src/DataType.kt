import javax.print.DocFlavor

fun main()
{
    val name ="Wassi"     //first way
    val age=22              // if you want to update the value define var not val
    val gpa:Double          //second way
    gpa=6.7
    println("My name is "+name)     //not a nice way that kotlin recommend
    println("I am $age year old")   //nice way recommended by Kotlin
    println("And my gpa is "+gpa)

    var count= 1
    print("Old count $count")
    count=10
    println("New count $count")
     var department:String?
    department = "Computer Engineering"
    print("Department = ${department!!}")
}
