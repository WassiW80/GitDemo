var name:String?=null
fun showUserInfo(){
    name="Hii $name"
    println("name= $name")
}
fun main(){
    name="Wassi"
    println("name= $name")
    showUserInfo()
    println("name= $name")
}