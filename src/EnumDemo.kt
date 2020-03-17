enum class Direction(){
    NORTH,SOUTH,EAST,WEST
}

fun main() {
    var userDirection=Direction.SOUTH
    if (userDirection==Direction.NORTH){
        println("He went to north")
    }
    else{
        println("I dont know where the user is!")
    }
}