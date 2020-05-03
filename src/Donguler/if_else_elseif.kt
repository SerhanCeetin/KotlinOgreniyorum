package Donguler

fun main() {
    //Aynı if else else if. Değişen bir şey yok
    //if sonucu bir değer döndürebilir, fonksiyon gibi
    var sayiGiris : Int = readLine()!!.toInt()
    var sonuc = if(sayiGiris in 0..100){
        println("Sayı 0-100 arasında")
        "0-100"
    }else if(sayiGiris in -100..0){
        println("Sayı -100-0 arasında")
        1345.3456
    }else if(sayiGiris in 100..Int.MAX_VALUE){
        println("Sayı baya büyük")
        true
    }else{
        println("Bu ne ya böyle")
        0
    }
    println(sonuc)

}