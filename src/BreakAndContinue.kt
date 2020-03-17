fun main(){

    println("Continue Example")
    for(number in 0..10){
        if (number==5)
            continue
        println(number)
    }

    println("Break example")
    for(number in 1..10)
    {
        if (number==6)
            break
        println(number)
    }
    println("Inner Loop example")
    loop@ for (number in 1..10){
        println("Number : $number")
        for (innerLoop in 1..10){
            println("InnerLoop : $innerLoop")
            if (innerLoop==6)
                break@loop
        }
    }
    return

}