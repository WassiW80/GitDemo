fun main(){
    print("Enter 1st number")
    var num1= readLine()!!.toInt()
    print("Enter 2nd number")
    var num2= readLine()!!.toInt()
    var temp:Int
    temp=num1
    num1=num2
    num2=temp
    println("First Number $num1")
    println("Second Number $num2")

}
