fun main() {
    print("Enter the first  number: ")
    var n1:Int=Integer.valueOf(readLine())
    print("Enter the second number: ")
    var n2:Int=Integer.valueOf(readLine())
    println("1.Addition")
    println("2.subtraction")
    println("3.multiplication")
    println("4.division")
    println("Enter the operation you want to perform")
    var r:Int=Integer.valueOf(readLine())
    when(r) {
        1-> addition(n1,n2)
        2-> subtraction(n1,n2)
        3-> multiplication(n1,n2)
        4-> division(n1,n2)
    }
}
fun addition(n1:Int,n2:Int){
    var a:Int=n1.plus(n2)
    println("Addition answer is:$a")
}
fun subtraction(n1:Int,n2:Int){
    var b:Int=n1.minus(n2)
    println("Subtraction is:$b")
}
fun multiplication(n1:Int,n2:Int){
    var c:Int=n1.times(n2)
    println("Multiplication is: $c")
}
fun division(n1:Int,n2:Int){
    var d:Int = n1.div(n2)
    val e:Float=d.toFloat()
    println("Division is:$e")
}