fun main(){
    val n=IntArray(5)
    var max=n[0]
    println("Please enter Array Value:")
    for(i in n.indices){
        print("a[$i]=")
        n[i]=readln().toInt()
    }
    for(j in 1..n.lastIndex){
        if(n[j]>max){
            max=n[j]
        }
    }
    println("Largest element=$max")
}