fun main() {
    var P : Int
    var E : Int
    var M = 0

    print("Digite o peso dos tomates: ")
    P = readLine()!!.toInt()

    E =  P - 50

    if (E > 0){
        M = 4 * E
    } else {
        E = 0
    }

    println("Peso: $P kg")
    println("Excesso: $E kg")
    println("Multa: $M R$")

}