fun main(){

    for(nameId in 1..3){
        println("$nameId Enter your name")
        var name= readLine()!!.toString()
        println("Enter your place")
        var place= readLine()!!.toString()
        var petName:String?=""
        println("Enter number of pet")
        var petCount= readLine()!!.toInt()
        for(petId in 1..petCount)
        {
            println("Enter pet $petId")
            petName= petName + readLine()!!.toString()+"\n"
        }
        println("++++++++++User Info++++++++++")
        println("Name:-      $name")
        println("Place:-      $place")
        println("Pet Name:-      $petName")
        if (petName!!.contains("cat")){
            println("You are rich")
        }

    }
}