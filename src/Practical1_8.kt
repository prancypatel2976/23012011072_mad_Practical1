fun main(){
    val a=arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arraOf() method:")
    println(a.joinToString())
    val b=Array<Int>(5) {0}
    println("Create Array-2 by using Array<>(): ")
    println(b.joinToString())
    val c=Array<Int>(8) { it }
    println("Create Array-3 by using Array<Int>() and lambda function: ")
    println(c.joinToString())
    val d= IntArray(5) {0}
    println("Create Array-4 by using IntArray(): ")
    println(d.joinToString())
    val e= intArrayOf(12,10,1,5,18,19)
    println("Create Array-5 by using intArrayOf(): ")
    println(e.joinToString())
    var f=arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("Create Array-6 by using arrayOf() and intArrayOf(): ")
    f.forEach { i ->
        println(i.joinToString())
    }
    val g = IntArray(5)
    println("Please enter Array Value:")
    for(i in g.indices)
    {
        print("a[$i]=")
        g[i] = readln().toInt()
    }
    println("Entered Array:")
    println(g.toList())

    println("With Built-in Function")
    println("After sorting by built-in function:")
    val h = intArrayOf(56, 23, 49, 12, 2)
    val sort = h.sortedArray()
    println(sort.joinToString())
    println()

    println("Without Built-in Function")
    println("Before Sorting:")
    val r = intArrayOf(56, 23, 49, 12, 2)
    println(r.joinToString())
    val n = r.size

    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (r[j] > r[j + 1]) {
                val temp = r[j]
                r[j] = r[j + 1]
                r[j + 1] = temp
            }
        }
    }
    println()
    println("After Sorting without built-in function:")
    for (element in r)
    {
        print("$element")
    }

}