package Do.zero.a.stuartup

class UserClass(val name: String,val age: Int)

data class UserDataClass(val name: String, val age: Int)

fun main() {
    val usuario1 = UserClass(name = "Thiago", age = 25)
    val usuario2 = UserDataClass(name = "Jéssica", age = 27)

    // toString
    println(usuario1) // classe retorna o nome da clase @ sua possição em memoria
    println(usuario2) // data class sempre vai retornar os dados

    val usuario3 = UserClass(name = "Jão", age = 25)
    val usuario6 = UserClass(name = "Jão", age = 25)

    val usuario4 = UserDataClass(name = "Maria", age = 27)
    val usuario5 = UserDataClass(name = "Maria", age = 27)
    // equals

    println(usuario3.name == usuario6.name)
}