fun main(){
    print("Enter your age:")
    var age = readLine()!!.toInt()
    if(age>=60){
        println("You can take retirement ")
    }
    else if(age in 18..59) {
        println("You have to work ")
    }
    else{
        println("You cannot work")
    }
}
