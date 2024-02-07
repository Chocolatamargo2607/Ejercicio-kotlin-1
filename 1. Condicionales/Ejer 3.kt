fun main(){

    print("Ingrese los años que lleva trabajando: ")
    val anios = readLine()!!.toInt()
    print("Ingrese los meses que lleva trabajando")
    val meses  = readLine()!!.toInt()
    print ("Tipo de contrato: " +
        "\n1. Full Time (48 horas)" +
        "\n2. Part Time (24 horas)" +
        "\n Ingrese su respuesta: " 
    )
    val indicador  = readLine()!!.toInt()
    val sueldoPagado = calcularSueldoTotal(anios,meses,indicador)
    val sueldoFinal = when(anios){
        in 0 .. 5 -> sueldoPagado * 0.6
        in 6 .. 10 -> sueldoPagado *0.8
        else -> sueldoPagado
    }
    print("La cantidad a pagar sera de $sueldoFinal$")
}

fun calcularSueldoTotal(anio : Int, meses : Int, indicador : Int) : Int {
    return when(indicador){
        1 -> (anio * 48 * 12 * 30) + (meses * 48 * 30)
        else -> (anio * 24 * 12 * 30) + (meses * 12 * 30)
    }
}