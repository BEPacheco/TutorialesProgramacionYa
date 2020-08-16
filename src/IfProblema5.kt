fun main (args:Array<String>){
    println("Ingrese el número:")
    var numero = readLine()!!.toInt()
    if (numero > 99){
        println("El número tiene que ser menor a 100")
    } else{
        if(numero >= 10){
            println("El número tiene 2 digitos")
        } else if (numero < 10){
            println("El número tiene 1 digito")
        }
    }
}