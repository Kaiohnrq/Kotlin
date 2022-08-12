fun main(){
    var num = DoubleArray(5)
    var maior: Double

    for(i in num.indices){
        print("Digite a pontuação: ")
        val pont = readln().toDouble()
        num[i] = pont
    }

    num.forEach { digitado -> println(digitado) }

    maior = num.maxOf { vet: Double -> vet }

    print("O maior valor digitado foi: $maior")

}