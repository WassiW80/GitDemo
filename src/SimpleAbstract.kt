abstract class CreditCard(){
    fun creditId():String{
        return "24154521431"
    }
    abstract fun show()
}
class UserInfo(): CreditCard() {
    override fun show() {
        println("Hello")
    }

    fun getInfo():String{
        return creditId()
    }
}
fun main(){
    //var credit=Credit()
    //println(credit.creditId())
    var user=UserInfo()
    println(user.getInfo())
    user.show()
}