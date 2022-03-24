package com.example.zadnaoceneradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kobieta = findViewById<RadioButton>(R.id.kobietarb)
        val mezczyzna = findViewById<RadioButton>(R.id.mezczyznarb)
        val niewiadomo = findViewById<RadioButton>(R.id.ncprb)
        val liczba = findViewById<EditText>(R.id.wiek)
        val sport = findViewById<CheckBox>(R.id.sport)
        val muzyka = findViewById<CheckBox>(R.id.muzyka)
        val turystyka = findViewById<CheckBox>(R.id.turystyka)
        val gry = findViewById<CheckBox>(R.id.gry)
        val send = findViewById<Button>(R.id.wyslij)
        val zamien = findViewById<Button>(R.id.zamien)
        var podsumowanie = ""

        send.setOnClickListener {
            kobieta.isEnabled = false
            mezczyzna.isEnabled = false
            niewiadomo.isEnabled = false
            liczba.isEnabled = false
            sport.isEnabled = false
            muzyka.isEnabled = false
            turystyka.isEnabled = false
            gry.isEnabled = false

            podsumowanie += "Informacje, które podałeś\n\n"

            if(kobieta.isChecked){
                podsumowanie += "Płeć Kobieta\n\n"
            }
            if(mezczyzna.isChecked){
                podsumowanie += "Płeć Mężczyzna\n\n"
            }
            if(niewiadomo.isChecked){
                podsumowanie += "Nie chciałeś/aś podać płci\n\n"
            }
            val wiek = liczba.text.toString().toInt()
            if(wiek < 1){
                error("Nie możesz mieć ujemnego wieku")
            }
            if(wiek > 120){
                error("Bez Przesady")
            }
            if(wiek == 1){
                podsumowanie = podsumowanie + " Wiek " + wiek.toString() + "rok\n\nZainteresowania:\n\n"
            }
            if(wiek == 2 || wiek == 3|| wiek == 4){
                podsumowanie = podsumowanie + " Wiek " + wiek.toString() + "lata\n\nZainteresowania:\n\n"
            }
            if(wiek>4){
                podsumowanie = podsumowanie + " Wiek " + wiek.toString() + "lat\n\nZainteresowania:\n"
            }
            if(sport.isChecked){
                podsumowanie += "Sport, "
            }
            if(muzyka.isChecked){
                podsumowanie += "Muzyka, "
            }
            if(turystyka.isChecked){
                podsumowanie += "Turystyka, "
            }
            if(gry.isChecked){
                podsumowanie += "Gry"
            }
            Toast.makeText(applicationContext, podsumowanie,Toast.LENGTH_LONG).show()
            podsumowanie = ""
        }
        zamien.setOnClickListener {
            kobieta.isEnabled = true
            mezczyzna.isEnabled = true
            niewiadomo.isEnabled = true
            liczba.isEnabled = true
            sport.isEnabled = true
            muzyka.isEnabled = true
            turystyka.isEnabled = true
            gry.isEnabled = true
        }
    }
}