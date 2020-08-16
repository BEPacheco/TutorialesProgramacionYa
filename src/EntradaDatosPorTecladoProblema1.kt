fun main(args: Array<String>){
    println("Ingrese primer valor:")
    val valor1:Int = readLine()!!.toInt()
    println("Ingrese segundo valor:")
    val valor2:Int = readLine()!!.toInt()
    val suma:Int = valor1 + valor2
    val producto:Int = valor1*valor2
    println("La suma es: $suma")
    println("El producto es: $producto")
}