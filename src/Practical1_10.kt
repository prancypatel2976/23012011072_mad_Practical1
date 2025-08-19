fun main(){
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("Aman", "BMW", 2018, 105.00, price=100000.0)
    println("----------")
    car1.displayInfo()
    println()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("Karan", "BMW", 2019, drive=20.00, price=400000.00)
    println("----------")
    car2.displayInfo()
    println()
    println("******* ArrayList of Car *************")

    val carList = arrayListOf<Car>()

    val car3 = Car("KJS", "Toyota", 2017, 100.00, price=1080000.0)
    val car4 = Car("NPP", "Maruti", 2020, 200.00, price=3998000.0)

    carList.add(car3)
    carList.add(car4)
    println()
    for (car in carList) {
        println("----------")
        println("----------")
        car.displayInfo()
        println()
    }

}
class Car(val owner: String, val brand: String, val year: Int, val drive: Double, val price:Double){
    init {
        println("Object of class is created and init is called.")
    }
    fun getOriCar(price: Double):Double{
        return price
    }
    fun getCurrentPrice(): Double {
        val depreciation = (drive/1000.0) * 0.05 * price
        return price - depreciation
    }
    fun displayInfo() {
        println("Car Information : $brand, $year")
        println("Owner Name     : $owner")
        println("Miles Driven   : $drive")
        println("Original Price : $price")
        println("Current Price  : " + String.format("%.2f", getCurrentPrice()))
        println("----------")
    }
}