fun main (){

    var num: Int = 0
    var soma: Int = 0
    var valor: Int = 0

    while(num >= 0){
        print("Digite um número: ")
        num = readln().toInt()

        valor++


        if(num >= 0){
            soma += num
        }
    }

    println("A soma dos valores é: $soma")
    println("A média dos valores é: ${soma/(valor - 1)}")
    println("O total é: $valor")

}