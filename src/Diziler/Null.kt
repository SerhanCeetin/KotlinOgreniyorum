package Diziler

fun main() {
    //var isim:String = null ---> bu kod hata verir
    var isim:String?=null //String? içerisinde null değer de alabilir.

    println(isim)

    //println(isim.length) ---> hata verir
    println(isim?.length) //? değer null olabilir anlamına geliyor.
    println(isim!!.length) //!! ben ne yaptığımı biliyorum, boşver null falan da kodu derle anlamına gelir.
    //!! null değer dönürebilecek kısımdan hemen sonra gelir. readLine()!! gibi.
    println()

    var sayi : Int? = null
    println(sayi)
    println(sayi.toString().length) //temel veri tiplerinde hata vermez. null u stringe çevirip uzunluğu döndürür.

    /*
    Null değer print içerisinde kullanılırken hata vermez.
    eğer null değer bir fonksiyon ile kullanılmaya çalışılırsa hata verir.
     */

}