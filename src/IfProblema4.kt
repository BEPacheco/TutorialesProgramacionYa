fun main (args:Array<String>){
    println("Ingrese la nota 1:")
    var nota1 = readLine()!!.toInt()
    println("Ingrese la nota 2:")
    var nota2 = readLine()!!.toInt()
    println("Ingrese la nota 3:")
    var nota3 = readLine()!!.toInt()
    var promedio = (nota1+nota2+nota3)/3
    if (promedio >= 7){
        println("Promocionado")
    } else{
        println("No promocionado")
    }
}