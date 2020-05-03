package Degiskenler

fun main() {
    var intSayi : Int
    var shortSayi : Short = 32767
    var byteSayi : Byte
    println()
    intSayi=shortSayi.toInt()
    byteSayi=shortSayi.toByte()
    println("Short değeri $shortSayi, Int $intSayi, Byte $byteSayi")
    var ondalikSayi=5485.56
    intSayi=ondalikSayi.toInt()
    println("Double $ondalikSayi, Int $intSayi")

    var longSayi=134546L //Sonuna L koyarak Long olmasını sağlıyoruz
    var floatSayi=8465.4356F //F --> Float


}