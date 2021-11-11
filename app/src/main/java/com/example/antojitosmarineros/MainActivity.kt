package com.example.antojitosmarineros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inicio =findViewById<Button>(R.id.inicio)
        inicio.setOnClickListener {
            val intento1 = Intent(this, comanda::class.java)
            startActivity(intento1)
        }
    }
    fun inicio(view :View)
    {
        //val intent abrir =  new intent(this, Display::com)
    }

}