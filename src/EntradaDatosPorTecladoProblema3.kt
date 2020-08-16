fun main(args:Array<String>){
    println("Ingrese el precio del producto")
    val precioProducto:Double = readLine()!!.toDouble()
    println("Ingrese la cantidad del producto")
    val cantProducto = readLine()!!.toInt()
    val cantAbonar = precioProducto*cantProducto
    println("La cantidad a abonar es: $cantAbonar")
}