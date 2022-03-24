package com.example.zadnaoceneradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kobieta = findViewById<RadioButton>(R.id.kobietarb)
        val mezczyzna = findViewById<RadioButton>(R.id.mezczyznarb)
        val ncp = findViewById<RadioButton>(R.id.ncprb)
        val wiek = findViewById<EditText>(R.id.wiek)
        val sport = findViewById<CheckBox>(R.id.sport)
        val muzyka = findViewById<CheckBox>(R.id.muzyka)
        val turystyka = findViewById<CheckBox>(R.id.turystyka)
        val gry = findViewById<CheckBox>(R.id.gry)

    }
}