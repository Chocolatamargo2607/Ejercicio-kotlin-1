println("¿Cuantos años tienes?")
var edad = readLine()!!.toInt();
if (edad >= 18) {
    println("Puedes pasar")
} else {
    println("Lo siento, vuelve dentro de " + (18 - edad) + " años")
}

// Lo mismo usando solo ifs
println("¿Cuantos años tienes?")
var edad = readLine()!!.toInt();
if (edad >= 18) {
    println("Puedes pasar")
}

if (edad < 18) {
    println("Lo siento, vuelve dentro de " + (18 - edad) + " años")
}