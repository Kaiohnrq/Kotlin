fun main(){

    var somaF = 0
    var SomaS = 0
    var sal: Int
    var quantF: Int
    var mediaF: Int
    var mediaS: Int
    var maiorS = 0
    var percentual = 0.10
    var sal100 = 0.0

    for(i in 1..5){
        print("Digite o salario: ")
        sal = readln().toInt()

        print("Digite a quantidade de filhos: ")
        quantF = readln().toInt()

        if(sal <= 100){
            sal100 = sal100 + 1
        }

        maiorS = sal
        if(sal > maiorS){
            maiorS = sal
        }
        somaF += quantF
        SomaS += sal
    }

    mediaF = somaF/5
    mediaS = SomaS/5
    percentual = (sal100 * 100) / 5

    println("Média de salario: $mediaS")
    println("Média de filhos: $mediaF")
    println("Maior salario é de $maiorS")
    println("Porcentagem de pessoas que ganham ate R$100,00 é de $percentual %")


}