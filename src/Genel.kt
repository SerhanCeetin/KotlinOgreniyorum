fun main() {
    //Print fonksiyonu
    var printDenemeDegiskeni : String = "Bu bir denemedir."
    println("Değişken birkaç şekilde konulabilir. Birincisi budur: $printDenemeDegiskeni")
    println("İkinci " + printDenemeDegiskeni)
    println("Üçüncü olarak ${printDenemeDegiskeni}")

    //Satırbaşı yapmak:
    print("Satırbaşı \nböyle yapılabilir.\n")

    // \t bir tab kadar boşluk bırak

    // \n yi print içinde yazdırmak
    print("""Escape karakteri \n böyle devre dışı bırakılır \n""")
}

