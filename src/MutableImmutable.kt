/*
mutable: you can update,add more
im-mutable: you cannot update,you cannot add more
 */

fun  main()
{
    //1-list
    //im-mutable
    var list= listOf("wassi","amaan")
       for (name in list)
        println(name)
    //mutable
    var listMutable= mutableListOf("Wassi","Ayaan")
    listMutable.add("Amaan")
    listMutable[0]="Azlaan"
    for (name in listMutable)
        println(name)
    var listOfUserI= mapOf(1 to "Wassi",2 to "Amaan")
    var listOfUserM= mutableMapOf(1 to "Wassi",2 to "Ayaan")
}