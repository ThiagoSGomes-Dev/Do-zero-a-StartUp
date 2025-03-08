package Do.zero.a.stuartup

import java.time.LocalDate

fun main() {
    println("Qual seu nome?")

    val name: String = readln()

    println("Legal $name!")


    println("E qual a sua idade?")

    fun anoFracao(age: Int): Double {

        val ageConv = age
        var fracaoAno = 1.0 / 12

        var ageDouble = ageConv.toDouble()
        val currentMonth = LocalDate.now().monthValue
        var resultado = ageDouble + currentMonth * fracaoAno

        return resultado
    }

    val age = readln().toInt()

    println("Sejá bem vindo, $name e parabés pelos seus ${anoFracao(age)} anos")
}
