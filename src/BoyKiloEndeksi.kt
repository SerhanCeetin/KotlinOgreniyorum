fun main() {
    var kullaniciBoy : Double = 1.75
    var kullaniciKilo : Double = 47.65
    var boyCarpimi = kullaniciBoy*kullaniciBoy
    var endeksDegeri : Double = kullaniciKilo/boyCarpimi
    if(endeksDegeri>25){
        println("kilolu")
    }else if(endeksDegeri<18.5){
        println("zayıf")
    }else{
        println("normal")
    }

}