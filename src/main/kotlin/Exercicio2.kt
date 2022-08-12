fun main() {
    var C : Int
    var N : Int
    var E : Int
    var S : Int

    print("Digite seu código de operador: ")
    C = readln().toInt()

    print("Quantas horas foram trabalhadas? ")
    N = readln().toInt()

    E = N - 50
    if(N > 50) {
        S = E * 20 +(50*10)
        print("Seu salario é: $S R$")
    } else {
        S = N * 10
        print("Seu salario é: $S R$")
    }





}