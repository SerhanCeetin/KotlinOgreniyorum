package Fonksiyonlar

fun main() {
    /*FONKSİYON VE METHOD AYNI ŞEYDİR
    function kelimesinin Türkçeye çevrimi methoddur.
    fun --> function kısaltması
    f(x)=2x+1
     */
    kisiYazdir()
    kisiParametreIleYazdir("Serkan Çetin",49)
}

fun kisiYazdir(){
    println("Serhan Çetin")
    println("20")
}
fun kisiParametreIleYazdir(isim:String,yas:Int){
    println(isim)
    println(yas)
}