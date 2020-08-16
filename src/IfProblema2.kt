fun main (args:Array<String>){
    println("Ingrese valor 1:")
    val valor1 = readLine()!!.toInt()
    println("Ingrese valor 2:")
    val valor2 = readLine()!!.toInt()
    if (valor1 > valor2){
        println("$valor1 es mayor a $valor2")
    } else {
        println("$valor2 es mayor a $valor1")
    }
}