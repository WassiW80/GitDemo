package com.car.maintain

class Car(val type:String,val model:Int,val price:Double
          ,val milesDrive:Int,val owner:String){
    init {
        println("Object class is created")
    }
    fun getCarPrice():Double{
        return this.price-(this.milesDrive*10)
    }
}
fun main(){
    val car1=Car("BMW",2015,
        10000.50,150,"Wassi")
    println(car1.owner)
    println(car1.model)
    println(car1.getCarPrice())

    val car2=Car("Mercedes",2017,
        15000.50,100,"Amaan")
    println(car2.owner)
    println(car2.model)
    println(car2.getCarPrice())

    var listOfCar= arrayListOf<Car>()
    listOfCar.add(Car("Scorpio",2007,
        12000.50,130,"Ayaan"))
    listOfCar.add(Car("Honda",2005,
        15500.50,90,"Azlaan"))
    for (list in listOfCar)
        println(list.model)
}
