import java.util.*

fun main(){

    println("Enter your birth year and month")
    var yearOfBirth = readLine()!!.toInt()
    var monthOfBirth = readLine()!!.toInt()
    var yearInDevice=Calendar.getInstance().get(Calendar.YEAR)
    var monthInDevice = Calendar.getInstance().get(Calendar.MONTH)
    yearInDevice -=yearOfBirth
    monthInDevice -=monthOfBirth
    print("You are $yearInDevice year and $monthInDevice month old")
}
