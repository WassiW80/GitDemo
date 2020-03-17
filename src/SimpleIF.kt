fun main(){

    print("Enter your grade ")
    var grade = readLine()!!.toInt()
    if (grade>=75)
        println("Distinction")
    if(grade in 60..74)
        println("First Class")
    if (grade in 50..60)
        println("Second Class")
    if(grade in 40..50)
        println("pass")
    if(grade < 40)
        println("Fail")
    println("End of Loop")
}