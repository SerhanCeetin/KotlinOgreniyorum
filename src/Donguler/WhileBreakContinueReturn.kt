package Donguler

fun main() {
    //Bildiğimiz while
    /*

    var i = 1
    while(i<=10){ //Önce şartı kontrol eder.
        //Sonra içerideki kodu çalıştırır.
        i++
    }

    do{
    //Önce işlemi yapar
    }while(i<=10) //Sonra şartı kontrol eder. Hala sağlıyorsa do komutuna döner


     */


    //break, continue ve return
    /*

    for(i in 1..10){
        println("bu sayı $i")
        if(i==7){
            break //eğer i 7 ise for döngüsünden çıkar, 8,9,10 için işlem yapmaz.
        }
    }


    for(i in 1..10){
        if(i==7){
            continue //eğer i 7 ise sonraki kodları çalıştırmaz ve for döngüsünü devam ettirir.
            //yani 7 için işlem yapılmaz 8le devam edilir.
        }
        if(i==3){
            return //sadece bulunduğu döngüden değil metoddan-fonksiyondan çıkar
        }
        println("bu sayi $i")
    }

     */

    //ÖNEMLİ!!!!
    //Döngü isimlendirme

    distakiDongu@ for (i in 4..6){
        for(j in 1..3){
            if(i*j == 12){
                break@distakiDongu
                //isimlendirme bu şekilde.
                //eğer isimlendirmeden sadece break yazılırsa içteki döngü durur.
                //dıştaki i döngüsü devam eder.
            }

            println("$i * $j : " + (i*j))
        }
    }
}