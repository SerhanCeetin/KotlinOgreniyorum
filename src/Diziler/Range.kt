package Diziler


fun main() {
    //1 ile 20 arasındaki sayılar
    var sayilar:IntRange=1..20
    var tersSayilar=20..1
    var birdenYirmiye = 1.rangeTo(20)
    var yirmidenBire=20.downTo(1)

    var aZ='a'..'z'
    var tersaZ='z'..'a'

    var beserSayilar = 1.rangeTo(100).step(5)
    var beserSayilarTers = 100.rangeTo(100).step(5)

    println(sayilar.first)
    println(sayilar.last)
    println(beserSayilar.first)
    println(beserSayilar.last)
    println(beserSayilar.step)






}