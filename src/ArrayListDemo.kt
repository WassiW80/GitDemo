fun main(){
    println("Pets App")

    var listOfPets= ArrayList<String>()
    do{
        print("Enter pets name or quit to exit")
        val petName= readLine()!!.toString()
        if (petName!="quit"){
            listOfPets.add(petName)
        }
    }while (petName !="quit")

    for (pets in listOfPets){
        println("Pets:  ${pets}")
    }
}