package Do.zero.a.stuartup

fun main() {
    val age: Int = 25
    // Adicionar

    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12
    // println(monthPercent)
    // para corrigir o erro: Val cannot be reassigned (Val não pode ser reatribuído) Deve-se reasinar o valor de ageDouble de val para var
    ageDouble += 6 * monthPercent // ageDouble = ageDouble + 2 => ageDoube += 2
     //println(ageDouble)

    val ageText: String = "A idade é ${ageDouble.toString()} anos"
    println(ageText.lowercase())
    println(ageText.uppercase())
}