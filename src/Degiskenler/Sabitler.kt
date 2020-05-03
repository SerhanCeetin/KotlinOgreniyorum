package Degiskenler

import PackageImportDeneme.adim
import PackageImportDeneme.yasim

val piSayim : Double = 3.14 //bu sabite diğer dosyalardan erişebilirim. -> NumberDegiskenleri
fun main() {
    //Sabitler

    val piSayisi : Double
    piSayisi = Math.PI
    println(piSayisi)
    // Yeniden tanımlanamaz. val sabitine tek bir kez değer atanabilir.
    // piSayisi = 3.14 kodu hata verir
    println()
    println("Ben $adim, $yasim yaşındayım.")
}