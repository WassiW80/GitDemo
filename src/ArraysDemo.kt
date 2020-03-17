fun main(){
    println("Pets App")
    println("Enter the number of Pets you have")
    val num = readLine()!!.toInt()
    var listOf:Array<String> = Array(num){""}
    for (i in 0 until num){
        println("Enter pets name ")
        listOf[i]= readLine()!!.toString()
    }
    println("Your pets are ")
    for(i in 0 until num)
    {
        println("Pets $i ${listOf[i]}")
    }
}