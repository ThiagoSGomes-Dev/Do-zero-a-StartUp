class MinhaFun() {
    var cor = "Vermelho";

    fun button() {

    }
}
fun main() {

    val nomes = arrayOf(
        "Thiago", "Jessica", "Joel"
    )
    print(nomes[1])

    val opcao = 9;

    when (opcao) {
        1 -> println("Cartão de credito")
        2 -> println("Debito")
        3 -> println("Dinheiro")
        else -> println("Opção não existe")
    }
}