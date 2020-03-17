fun main()
{
    print("Enter your choice")
    val foodId= readLine()!!.toInt()
    when(foodId){
        1 ->{
            println("Veg")
        }
        2 ->{
            println("Non- veg")
        }
        8->{
            println("Egg")
        }
        else->{
            println("Wrong choice")
        }
    }
}