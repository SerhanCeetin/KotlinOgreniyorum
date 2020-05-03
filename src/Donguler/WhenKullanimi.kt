package Donguler

fun main() {

    //when ama bi tık farklı
    //bir değer döndürebilir fonksiyon gibi

    var giris = readLine()!!.toInt()

    var sonuc = when(giris){
        in 0..44 ->{
            println("0-44 arası")
            0.44
        }
        in 45..100->{
            println("45,100")
            "45,100"
        }
        in 101..500->true
        else -> {
            println("giriş hatalı")
            -1
        }
    }
    println(sonuc)
}