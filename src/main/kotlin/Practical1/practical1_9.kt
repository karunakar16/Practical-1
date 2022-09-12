fun main(){
    var arr = Array<Int>(5){0}
    var x:Int = 0
    println("Enter the values: ")
    while (x < arr.size)
    {
        print("arr[$x] : ")
        arr[x] = Integer.valueOf(readLine())
        x++
    }
    println(arr.contentToString())
    arr.sort()
    val y: Int = arr[4]
    println("The largest Number is : $y")
}
