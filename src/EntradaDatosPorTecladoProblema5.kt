fun main(args:Array<String>){
    println("Ingrese el primer valor")
    val valor1:Int = readLine()!!.toInt()
    println("Ingrese el segundo valor")
    val valor2:Int = readLine()!!.toInt()
    println("Ingrese el tercer valor")
    val valor3:Int = readLine()!!.toInt()
    println("Ingrese el cuarto valor")
    val valor4:Int = readLine()!!.toInt()
    val suma:Int = valor1+valor2+valor3+valor4
    val promedio = suma/4
    println("La suma es: $suma y el promedio es: $promedio")

}