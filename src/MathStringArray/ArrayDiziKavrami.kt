package MathStringArray

import java.util.*

//'
fun main() {
    //Array<T> ---> <T> herhangi bir tür gelebilir

    var myArray = Array<Int>(10){0}
    //10 elemanlı bir dizi.
    //bütün elemanları default olarak 0 yaptık

    var myStringArray = Array<String>(5){""}

    //intArrayOf, charArrayOf vs vs

    var degiskenlerim = arrayOf("Serhan", 20, !true, 1.75, 'A')
    for (i in 0..degiskenlerim.size-1)
        println(degiskenlerim[i])


    //Dizi kopyalama
    var dizi1 = arrayOf(95,4,7,1,9)
    var dizi2 = Array<Int>(5){0}
    System.arraycopy(dizi1,0,dizi2,0,dizi1.size)
    //(kaynak dizi, 1.dizinin kaçıncı elemanından başlanacağı
    // hedef dizi, 2. dizinin kaçıncı elemanından başlanacağı
    // kaynak dizinin kaç elemandan oluştuğu yani 0dan dizi1.size indexine kadar kopyala diyoruz)


    //Dizi sıralama
    Arrays.sort(dizi2)

    //Dizi karşılaştırma
    println(Arrays.equals(dizi1, dizi2))
    //Eğer birebir eşitse true döndürür.


    var myArrayList = arrayListOf("a","b","c")
    myArrayList.add("d")
    myArrayList.add(4,"e")
    myArrayList.remove("b")
    myArrayList.clear()
    myArrayList.size
    myArrayList.get(4)
    myArrayList.set(4,"yeni değer")
}