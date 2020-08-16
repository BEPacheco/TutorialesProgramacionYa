fun main(args:Array<String>){
    println("Ingrese el valor:")
    var valor = readLine()!!.toInt()
    val resultado = if (valor % 2 == 0){
        print("Cuadrado: ")
        valor * valor
    } else {
        print("Cubo: ")
        valor*valor*valor
    }
    print(resultado)
}