package Do.zero.a.stuartup

fun main() {
    val nome: String? = null
    val age: Int? = null

    nome?.let {
        println("Olá $it")
    }

    // Dentro do let, it representa o próprio valor da variável nome ("Thiago").
    age?.let {
        println("Execute! $it")
    }

    val passos: String? = "Passos"
    passos?.let {
        println("A palavra passos tem ${it.length}, caracteres")
    }
}