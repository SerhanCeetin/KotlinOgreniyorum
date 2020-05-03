package Donguler

fun main() {
    //method overloading örneği
    //giriş değerlerine göre uygun methodu (fonksiyonu) seçiyor

    toplaminiBul(1,2)
    toplaminiBul(2.5,3.7)

    var sayiDizisi = arrayOf(345,678654,3,3,4567,8,3456)
    toplaminiBul(sayiDizisi)


    //varargs örneği
    toplaminiBul(1,2,3,58,8,6,84,86,14)
}

fun toplaminiBul(sayilar: Array<Int>) {
    var toplam : Int = 0
    for (i in sayilar){
        toplam+=i
    }
    println("Array toplam $toplam")
}


fun toplaminiBul(sayi1:Int,sayi2:Int){
    println("Int "+(sayi1+sayi2))
}

fun toplaminiBul(sayi1:Double, sayi2:Double){
    println("Double "+(sayi1+sayi2))
}

fun toplaminiBul(vararg sayilar:Int){
    var toplam=0
    for (i in sayilar){
        toplam+=i
    }
    println(toplam)
}