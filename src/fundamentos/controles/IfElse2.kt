package fundamentos.controles

fun main() {

    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1
    } else {
        println("processando...")
        num2
    }

    println(" O maior valor é $maiorValor.")

    val maiorValor2 = if (num1 > num2) num1 else num2

    println(" O maior valor2 é $maiorValor.")

}
