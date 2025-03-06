fun main(args: Array<String>) {
    val pessoa = Pessoa("Thiago")
    println(pessoa.nome);


    var sum3: String = "";
    val sum1: Long = 1000;

    val `caixa um` = 20.multplay(4);
    println(sum3);

}

fun meuTest(Inteiro : Int): Unit {
    val sum: Int = Inteiro + 10;
    println(sum);
}

fun Int.multplay(x: Int) = this * x;

infix fun Int.meuNumero(x: Int): Int {
    return this * x;
}