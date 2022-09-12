fun main(){
    print("Enter the number: ")
    val number:Int=Integer.valueOf(readLine())
    val f=fact(number)
    println("Factorial of the $number is: $f")
}
tailrec fun fact(n:Int,temp:Int=1):Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}
