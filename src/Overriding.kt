open class Operation1() {
    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations1 : Operation1 {
    constructor() : super() {

    }

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 * 2
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }
}

fun main(args: Array<String>) {
    val opt1 = Operation1()
    println("Sum: ${opt1.sum(10, 15)}")
    println("Div: ${opt1.div(10, 5)}")

    val opt2 = MultiOperations1() as Operation1
    println("Sum: ${opt2.sum(10, 15)}")
    println("Div: ${opt1.div(10, 5)}")


}