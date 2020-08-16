fun main(args:Array<String>){
    println("Ingrese el sueldo del empleado:")
    val sueldo = readLine()!!.toInt()
    if (sueldo > 3000){
        println("Debe pagar impuestos")
    }
    //Tambien se puede usar esta otra
    /*
    if (sueldo > 3000)
        println("Debe pagar impuestos")
    * */
}