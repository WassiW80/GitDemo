fun main(){
    val message= " Welcome to Kotlin"
    val name="Wassi"
    val allmessage= "$name,$message"
    println(allmessage)
    println("Lower case: $allmessage".toLowerCase())
    println("Upper case: $allmessage".toUpperCase())
    println(message.trim())
    println(message)
    val listOfToken=message.trim().split(" ")
    for (tokens in listOfToken){
        if (!tokens.contains("to"))
        println("Tokens: $tokens")
    }
}