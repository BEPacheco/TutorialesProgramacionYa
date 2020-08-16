fun main(args:Array<String>){
    println("Ingrese el valor del lado del cuadrado:")
    val ladoCuadrado:Int = readLine()!!.toInt()
    val perimetroCuadrado = ladoCuadrado*4
    println("El valor del perimetro es: $perimetroCuadrado")
}