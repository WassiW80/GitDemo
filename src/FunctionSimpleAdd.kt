fun addNumber(x:Double,y:Double){
    val temp=x+y
    println("Add = $temp")
}
fun subNumber(x:Int,y:Int):Int{
    val temp=x-y
    return temp
}

fun defaultValue(x:Int=0,y:Int=0):Int{
    val temp=x+y
    return temp
}
//multiple argument
fun displayInfo( vararg name:String){
    for (names in name)
        println(names)
}
fun main(){
    addNumber(3.6,3.6)
    val sub = subNumber(3,4)
    println("Sub= $sub")
    val defaulty=defaultValue(y=5)
    val defaultx=defaultValue(4)
    println("DefaultX = $defaultx")
    println("DefaultY = $defaulty")
    displayInfo(name = *arrayOf("Wassi","Ayaan"))

}
