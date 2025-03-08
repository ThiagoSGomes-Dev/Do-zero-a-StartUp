package Do.zero.a.stuartup

fun main() {
    val num1 = 9
    val num2 = 5
    val res = 2.13

    // Operdores matematicos

    println(num1 - num2)
    println(num1 + num2)
    println(num1 * num2)
    println(num1 / num2)
    println(res % num2)

    // incremento e decremento

    var num3 = 200
    var num4 = 200

    num3++
    num3++
    num4--

    println(num3)
    println(num4)

    // Atribuição commposta
    println("Atribuição commposta")
    var numI = 5
    var numII = 3

    numI -= numII  // numI = 5 - 3
    println(numI)  // Resultado: 2

    numI += numII  // numI = 2 + 3
    println(numI)  // Resultado: 5

    numI *= numII  // numI = 5 * 3
    println(numI)  // Resultado: 15

    numI /= numII  // numI = 15 / 3
    println(numI)  // Resultado: 5

    numI %= numII  // numI = 5 % 3
    println(numI)  // Resultado: 2

    // Lib math
    println("Lib math")

    // Usa o valor após a virgula para determinar se o valor passado será aredondado para - ou para +
    // 0.5 +
    // 0.4 -
    val value = 2.91
    val valueRounded = Math.round(value)
    val valueRounded1 = Math.floor(value)

    println(valueRounded1)
}


