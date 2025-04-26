package Dersler.FonksiyonlarOdev

class Fonksiyonlar
{
    fun toFahrenhiet(value: Double ): Double
    {
        val result=(value*1.8)+32
        return result
    }

    fun Calc(lSide: Double, sSide: Double )
    {
        if (sSide>lSide){
            println("Hatalı değer girişi yaptınız kısa kener uzun kenardan daha uzun olamaz")
        }
        else{
            val result=(lSide*sSide)*2
            println(result)
        }
    }
    fun Factorial(value: Int): Int
    {
        var result=1
        for (i in value downTo 1)
        {
            result*=i
        }
        return result
    }
    fun aCounter(txt: String)
    {
        var counter=0
        for (char in  txt){
            if (char=='a' || char=='A'){
                counter++
            }
        }
        println("Metnin içerisinde $counter tane a bulunyor")
    }
    fun DegreeCalc(edge: Int): Int?
    {
        if (edge<3){
            println("Çokgenler en az üç kenarlı olmalıdır")
            return null
        }

        val result: Int=(edge-2)*180
        return result
    }

    fun WageCounter(Days: Int)
    {
        var wage=0
        if (Days<=20 && Days>0)
        {
            wage=(Days*8)*10
            println("Bu ayki maasiniz=$wage TL")
        }
        else if (Days==0)
        {
            println("Bu ay calismadiniz")
        }
        else if(Days>20)
        {
            wage=1600+(((Days-20)*8)*20)
            println("Bu ayki maasiniz=$wage TL")
        }
        else
        {
            println("Hatali deger girdiniz")
        }
    }

    fun billCalc(usage: Int)
    {
        val fixedLimit=50
        var bill=0
        if (usage<=fixedLimit && usage>0)
        {
            bill=usage*2
            println("Bu ayki faturaniz $bill TL")
        }
        else if(usage<=0){
            println("Hatali girdi yaptiniz")
        }
        else
        {
            bill=100+((usage-fixedLimit)*4)
            println("Bu ayki faturaniz $bill TL")
        }
    }

}