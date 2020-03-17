fun main()
{
    for (i in 1..5)
    {
        println("Hello World $i")
    }
    for (i in 1..5 step 2){
        println("Odd number $i")
    }
    for (i in 0..5 step 2){
        println("Even number $i")
    }
    for (i in 5 downTo 0)
    {
        println("reverse number $i")
    }
}