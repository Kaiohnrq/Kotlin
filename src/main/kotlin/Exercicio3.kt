fun main(){

    var n1 : Float
    var n2 : Float
    var n3 : Float
    var n4 : Float

    print("Digite o primeiro numero: ")
    n1 = readln().toFloat()

    print("Digite o segundo numero: ")
    n2 = readln().toFloat()

    print("Digite o terceiro numero: ")
    n3 = readln().toFloat()

    print("Digite o quarto numero: ")
    n4 = readln().toFloat()

    n1 *= n1
    n2 *= n2
    n3 *= n3
    n4 *= n4

    if(n3 >= 1000){
        print("O quadrado do terceiro numero digitado é $n3")
    } else {
        println("O quadrado dos numeros digitados é: ")
        println("$n1")
        println("$n2")
        println("$n3")
        println("$n4")
    }


}