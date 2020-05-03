package Diziler

fun main() {

    //Değişken tipimizi Array ile belirttik.
    //<Int> ile, depolanan veri türünü belirttik.
    var sayilar : Array<Int> = arrayOf(1,2,3,4,5,6)
    println("İlk eleman ${sayilar[0]}")
    println("İlk eleman ${sayilar.get(0)}")
    println("${sayilar.size} eleman var")
    println()
    //<Any> Her tür veriyi depolamak için
    var karisik : Array<Any> = arrayOf("Serhan","Çetin",20)
    var gunler = arrayOf("Pazartesi","Salı")
}