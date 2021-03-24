package com.example.ksorteiodenumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import androidx.core.widget.TextViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun playOnclick(view : View){
        val randomNumber = Random.nextInt(0, 10)
        val textView = findViewById<TextView>(R.id.numeroSorteado)
        textView.text = "$randomNumber"
        TextViewCompat.setTextAppearance(textView, R.style.numeroSorteado)
    }
}