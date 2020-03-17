
class Person(val firstName:String,var lastName:String) {
    fun printName() {
         print(firstName+""+lastName)
    }

}
class PersonDemo{
    var p = Person("","")

}