package com.car.maintain

class Truck:CarOption{

    var subType:String?=null
    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String,subType:String):
            super(type,model,price,milesDrive,owner){
      this.subType=subType
    }
    constructor(type:String,model:Int,price:Double,milesDrive:Int,subType:String):
    super(type,model,price,milesDrive){
       this.subType=subType
    }
    override fun getCarPrice():Double{
        return this.getPrice()-(this.milesDrive!!*20)
    }

}
fun  Truck.getPriceWrapper():Double{
    return this.getCarPrice()
}

fun main(){
    val truck1=Truck("BMW",2015,
        10000.50,150,"Wassi","Dump")
    println(truck1.owner)
    println(truck1.model)
    println(truck1.getCarPrice())
    println(truck1.getPriceWrapper())

    val truck2=Truck("Mercedes",2017,
        15000.50,100,"Garbage")
    println(truck2.owner)
    println(truck2.model)
    println(truck2.getCarPrice())


}
