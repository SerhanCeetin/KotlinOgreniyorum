package Degiskenler

fun main() {
    //Operatörler
    //Aritmetik operatörler
    /*

    + Toplama
    - Çıkarma
    * Çarpma
    / Bölme
    % Mod

     */

    //Atama
    /*

    = Atama operatörü

    += Topla ve ata
    // sayi += 5 --->   sayi = sayi + 5

    -= Çıkar ve ata

    *= Çarp ve ata
    // sayi*=3 ---> sayi = sayi * 3

    /= Böl ve ata

    %= Modunu al ve ata

     */

    //Karşılaştırma
    /*
    <, >, ==, <=, >=, !=
     */

    //Mantıksal
    /*

    && ve
    || veya
    ! değil  --->  myBool=true ---> !myBool=false

     */

    //Artırma ve azaltma
    /*

    ++ 1 arttırır
    -- 1 azaltır
    */

    var sayi = 16

    println(sayi++) //Önce sayıyı yazdırır, sonra arttırır. Yani 16 yazdırır.
    println(sayi) //17 yazdırır.
    println()
    println(++sayi) //Önce sayıyı arttırır, sonra yazdırır. Yani 18 yazdırır
    println(sayi) //18
    println()

    //İşlem Önceliği
    /*

    () parantez içi önce yapılır.
    ++ ve -- değişkenden önce ise, parantezden hemen sonra
    ^
    * ve /
    + ve -
    = atama
    ++ ve -- değişkenden sonra ise

     */
}