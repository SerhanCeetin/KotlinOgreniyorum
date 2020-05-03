package Degiskenler

fun main() {
    //Boolean, Char ve String
    println()
    //Boolean
    var myBool : Boolean = true
    var myBool2 = false
    println("myBool değeri $myBool ve $myBool2")
    println()
    //Char
    //Char değeri için tek tırnak gerekir.
    var ilkHarf : Char = 'a'
    var ikinciHarf = 'b'
    println("İlk harf $ilkHarf, ikinci harf $ikinciHarf")
    println()
    //String
    var benimAdim="Serhan Çetin"
    println("Benim adim $benimAdim, ${benimAdim.length} harftir.")
    println("Adımın ikinci harfi ${benimAdim.get(1)}") //get 0 indeksinden başlar.

}