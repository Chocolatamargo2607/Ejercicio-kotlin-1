println("Ingresa un numero: ")
var numero = readLine()!!.toInt();
if (numero > 0) {
    println("Es un número positivo")
} else if (numero < 0) {
    println("Es un número negativo")
} else {
    println("Es 0")
}