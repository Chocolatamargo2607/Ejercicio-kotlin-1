fun main() {
    var num: Int = 11

    while (num <= 10) {
       
       println("$num * 2 = ${num*2}")
       num++

    }
   println("Fin del bucle while")
    
    do{
       
       println("$num * 2 = ${num*2}")
       num++

    }while (num <= 10)

   println("Fin del bucle do while")
}