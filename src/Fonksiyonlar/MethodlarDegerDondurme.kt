package Fonksiyonlar

fun main() {
    /* 1. fonksiyon
    var toplam = topla(5,9)
    //Fonksiyon içerisindeki t değişkeni döndürülerek
    //toplam değişkenine atanır.

    println(toplam)

     */

    //2. fonksiyon
    println(selamVer("Serhan"))

    //3. fonksiyon
    println(faktoriyelHesapla(5))
    

}
//3. fonksiyon
fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc : Int = 1
    for (i in 1..sayi){
        sonuc = sonuc * i
    }
    println("$sayi sayısının faktöriyeli: $sonuc")
    return sonuc
    
}

//2. fonksiyon
fun selamVer(isim:String):String{
    return "Merhaba " + isim
}


//1. fonksiyon
fun topla(sayi1:Int,sayi2:Int):Int{
    //Int ile fonksiyonun döndüreceği değer türünü belirttik
    var t = sayi1 + sayi2
    println("Toplam: " + t)
    return t
    //t değişkenini fonksiyonun atandığı değişken için döndür
}