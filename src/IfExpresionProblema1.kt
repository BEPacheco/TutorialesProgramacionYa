fun main(args:Array<String>){
    println("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
}