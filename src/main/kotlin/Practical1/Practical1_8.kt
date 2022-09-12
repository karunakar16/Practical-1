fun main() {
    val myArray1 = arrayOf(12, 13, 15, 16)
    println("Using arrayOf method: ")
    println(myArray1.contentToString())
    val myArray2 = Array<Int>(5){0}
    println("Using Array<>() method: ")
    println(myArray2.contentToString())
    val myArray3 = Array(5, { i -> i * 2 })
    println("Using Array<>() and lambda function: ")
    println(myArray3.contentToString())
    val myArray4 = intArrayOf(5,10,20,12,15)
    println("Using intArrayOf() : ")
    println(myArray4.contentToString())
    val myArray5 = arrayOf(intArrayOf(2, 3), intArrayOf(5, 6))
    println("2D array :")
    println(myArray5.contentDeepToString())
    println("Array Sorting...")
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
    println("***** With In-Built Function *****")
    println("Before Sorting : ")
    println(arr.contentToString())
    arr.sort()
    println("After Sorting : ")
    println(arr.contentToString())
    not()
}
fun not(){
    var arr1 = Array<Int>(5){0}
    var x:Int = 0
    var a:Int
    var b:Int
    println("Enter the values: ")
    while (x < arr1.size)
    {
        print("arr[$x] : ")
        arr1[x] = Integer.valueOf(readLine())
        x++
    }
    println(arr1.contentToString())
    println("***** Without In-Built Function *****")
    println("Before Sorting : ")
    println(arr1.contentToString())
    println("After Sorting : ")
    var temp: Int
    for(a in arr1.indices){
        for(b in (a+1) until arr1.size){
            if (arr1[a] > arr1[b]){
                temp = arr1[a]
                arr1[a] = arr1[b]
                arr1[b] = temp
            }
        }
    }
    println(arr1.contentToString())
}