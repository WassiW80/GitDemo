fun main(){
    println("For Loop")
    for (i in 0..10)
    {
        println("Counter $i")
    }
    println("While Loop")
    var i=1
    while (i<=10) {
        println("Counter $i")
        i+=1
    }
    i=1
    println("Do While Loop")
    do
    {
        println("Counter $i")
        i+=1
    }while (i<=10)
}