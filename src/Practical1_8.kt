import java.util.Arrays
fun main(){
    println("-:Array Operations:-")
    val a=intArrayOf(10,20,30,40)
    println("1D Array with joinToString(): ${a.joinToString()}")
    val b=arrayOf(
        intArrayOf(1,2),
        intArrayOf(3,4),
        intArrayOf(5,6)
    )
    println("2D Array with Arrays.deepToString(): ${Arrays.deepToString(b)}")
    println("2D Array with contentDeepToString(): ${b.contentDeepToString()}")
    println("-:Loop Types:-")
    println("Using range (1..5):")
    for(i in 1..5){
        print("$i ")
    }
    println("\nUsing downTo (5 downTo 1):")
    for(i in 5 downTo 1){
        print("$i ")
    }
    println("\nUsing until (0 until size):")
    for(i in 0 until a.size){
        print("${a[i]} ")
    }
    println("\nUsing step (0..10 step 2):")
    for(i in 0..10 step 2){
        print("$i ")
    }
    println("\n-:Sorting Arrays:-")
    val original=intArrayOf(42,12,89,33,7)
    println("Original Array: ${original.joinToString()}")
    val sortedManual=bubbleSort(original.copyOf())
    println("Sorted Without Built-in: ${sortedManual.joinToString()}")
    val sortedBuiltIn=builtInSort(original.copyOf())
    println("Sorted With Built-in: ${sortedBuiltIn.joinToString()}")
}
fun bubbleSort(arr: IntArray): IntArray{
    val n=arr.size
    for(i in 0 until n){
        for(j in 0 until n-i-1){
            if(arr[j]>arr[j+1]){
                val temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
            }
        }
    }
    return arr
}
fun builtInSort(arr: IntArray): IntArray{
    return arr.sortedArray()
}