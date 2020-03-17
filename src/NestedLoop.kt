import java.util.*
import kotlin.collections.HashMap

fun main(){

    var listOfUsers=HashMap<String,LinkedList<String>>()

    while (true) {
        println("Enter your name or quit")
        var name = readLine()!!.toString()
        if (name=="quit"){
            break
        }
        println("Enter your place")
        var place = readLine()!!.toString()


        var listOfUserPets = LinkedList<String>()
        do {
            print("Enter pet name or type next: ")
            var petName = readLine()!!.toString()
            if (petName != "next")
                listOfUserPets.add(petName)
        } while (petName != "next")
        listOfUsers["$name:$place"]=listOfUserPets
    }
    println("++++++++++User Info++++++++++")
    for (key in listOfUsers.keys){


        println("Name and Place live:-      $key")
      //  println("Place:-      $place")
            var listOfPets=listOfUsers[key]!!
        for (petName in listOfPets)
        println("Pet Name:-      $petName")
        if (listOfPets!!.contains("cat")){
            println("You are rich")
        }

    }
}