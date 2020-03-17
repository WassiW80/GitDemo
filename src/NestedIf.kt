fun main(){

    print("Enter your grade ")
    var grade = readLine()!!.toInt()
    if (grade>=75) {
        if (grade>80) {
            println("A+")
        }else
        {
            println("A-")
        }
    }
    else if(grade in 60..74) {
        if (grade>65) {
            println("B+")
        }else
        {
            println("B-")
        }
    }
    else if (grade in 50..60) {
        if (grade>55) {
            println("C+")
        }else
        {
            println("C-")
        }
    }
    else if(grade in 40..50) {
        if (grade>45) {
            println("D+")
        }else
        {
            println("D-")
        }
    }
    else {
        println("Fail")
    }
    println("End of Loop")
}