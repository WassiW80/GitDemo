fun main()
{
    var listOfUsers=HashMap<Int,String>()
    listOfUsers[123]="wassi"
    listOfUsers[125]="ayaan"
    listOfUsers[124]="azlaan"
    println(listOfUsers)
    println("Print by id ${listOfUsers[123]}")
    for (key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }
}