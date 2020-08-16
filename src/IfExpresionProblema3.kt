fun main(args:Array<String>){
    println("Ingrese el valor")
    var valor = readLine()!!.toInt()
    if (valor >= 100){
        println("Ingrese un valor menor o igual a 99")
    } else{
        var cantidad = if (valor <10) 1 else 2
        println("El número $valor tiene $cantidad dígito/s")
    }
}