fun main(){
    print("Enter the number: ")
    val number:Int=Integer.valueOf(readLine())
    val f:Long = factorial(number)
    println("By Tailrec keyword,Factorial of the $number is: $f")
}
tailrec fun factorial(n:Int,temp:Int=1):Long {
    return if (n == 1){
        temp.toLong()
    } else {
        factorial(n-1, temp*n)
    }
}
