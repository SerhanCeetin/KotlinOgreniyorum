package Diziler

fun main() {
    println("Adınızı girin: ")
    var isim:String?=readLine()
    println(isim)

    //  "" ve null değeri eşit değildir.
    /*
    Burada readLine dan gelen verinin null olabilme ihtimali boş değer girildiğinde gerçekleşmez.
    readLine fonksiyonu dosya okuma amacıyla kullanıldığı zaman null değeri döndürebilir.
     */

    //var yas : Int = readLine().toInt()
    //Kod Int? olmasını isteycektir çünkü readLine() fonksiyonu null değer döndürebileceğini ifade eder.
    var yas : Int = readLine()!!.toInt()

}