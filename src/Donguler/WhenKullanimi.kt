package Donguler

fun main() {

    //when
    //bir değer döndürebilir fonksiyon gibi

    var giris = readLine()!!.toInt()

    var sonuc = when(giris){//giris değeri
        in 0..44 ->{//bu aralıktayken
            println("0-44 arası")//bunu yap
            0.44//sonuc olarak bunu döndür
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