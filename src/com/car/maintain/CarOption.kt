package com.car.maintain

open class CarOption{
    var type:String?=null
    var model:Int?=null
    private var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
    }
    constructor(type:String,model:Int,price:Double,milesDrive:Int){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
    }
    init {
        println("Object class is created")
    }
    open fun getCarPrice():Double{
        return this.price!!-(this.milesDrive!!*10)
    }
    fun getPrice():Double{
        return this.price!!
    }
}
fun main(){
    val car1=CarOption("BMW",2015,
        10000.50,150,"Wassi")
    println(car1.owner)
    println(car1.model)
    println(car1.getCarPrice())

    val car2=CarOption("Mercedes",2017,
        15000.50,100)
    println(car2.owner)
    println(car2.model)
    println(car2.getCarPrice())


}
