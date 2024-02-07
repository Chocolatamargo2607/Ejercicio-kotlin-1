fun main(){
    val scanner = Scanner(System.`in`)
    println("Ingresa un numero entero mayor a 0 y obtener los numeros enteros existentes hasta ese numero")
    val n = scanner.nextInt()

    if(n <= 0){
        println("Debes insertar un numero positivo o mayor a cero !!!")
    } else{
        for (i in 1..n){
            if(i % 2 == 0){
                 println(i)
            }
        }
    }
}