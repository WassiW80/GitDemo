package com.car.maintain

interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}
class MasterCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if (age>50)
            println("Negative")
        else
            println("Positive")
    }
    fun info(){
        println("Hello MasterCard")
    }

}
class Visa(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if (age>60)
            println("Negative")
        else
            println("Positive")
    }

}

class PayPal(client:CreditCard):CreditCard by client{

    fun print(){
        println("Hello")
    }
}
fun main(){
    val visa=Visa("5749246")
    println("Card number: ${visa.cardNumber}")
    visa.score(40)
    val masterCard=MasterCard("45567516")
    println("Card number: ${masterCard.cardNumber}")
    masterCard.score(61)

    val payPal=PayPal(masterCard)
    println("Card Number PayPal: ${payPal.cardNumber}")
    payPal.print()
}