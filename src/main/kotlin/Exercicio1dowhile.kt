fun main(){
    var num = 233

    do{
        println("$num")
        if(num < 300){
            num++
        } else if(num >= 300 && num <= 400) {
            num += 3
        } else {
            num += 5
        }
    } while (num <= 456)

}