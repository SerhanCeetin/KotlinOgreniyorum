package Degiskenler

import kotlin.reflect.typeOf

fun main() {
    //Değişkenler

    //Number veri türleri
    //küçükten büyüğe
    //byte,short,int,long,float,double
    //byte 8 bit, short 16 bit, integer 32 bit, long 64 bit, float 32 bit, double 64 bit yer kaplar
    println("Number değişkenleri başlangıcı.")
    println()
    var byteMin : Byte = Byte.MIN_VALUE
    //veri tipi belirtmesek de olur.
    //var byteMin = Byte.MIN_VALUE
    println("Byte en küçük değeri " +  byteMin)
    var byteMax : Byte = Byte.MAX_VALUE
    println("Byte en büyük değeri " + byteMax)

    var shortMin : Short = Short.MIN_VALUE
    println("Short en küçük değeri " +  shortMin)
    var shortMax : Short = Short.MAX_VALUE
    println("Short en büyük değeri " + shortMax)

    var intMin : Int = Int.MIN_VALUE
    println("Int en küçük değeri " +  intMin)
    var intMax : Int = Int.MAX_VALUE
    println("Int en büyük değeri " + intMax)

    var longMin : Long = Long.MIN_VALUE
    println("Long en küçük değeri " +  longMin)
    var longMax : Long = Long.MAX_VALUE
    println("Long en büyük değeri " + longMax)

    var floatMin : Float = Float.MIN_VALUE
    println("Float en küçük değeri " +  floatMin)
    var floatMax : Float = Float.MAX_VALUE
    println("Float en büyük değeri " + floatMax)

    var doubleMin : Double = Double.MIN_VALUE
    println("Double en küçük değeri " +  doubleMin)
    var doubleMax : Double = Double.MAX_VALUE
    println("Double en büyük değeri " + doubleMax)
    println()
    println("Number değişkenleri sona erdi.")
    println()
    println("Global piSayim = $piSayim")

}