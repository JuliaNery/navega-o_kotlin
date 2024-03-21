package com.julianery.navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.julianery.navigation.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var buttonNav = findViewById<Button>(R.id.button)
        var salgado = findViewById<EditText>(R.id.editTextNumber)
        var qtdSalgado = salgado.text.toString().toInt()
        var bebida = findViewById<EditText>(R.id.editTextNumber2)
        var qtdBebida = bebida.text.toString().toInt()
        buttonNav.setOnClickListener { view : View? ->
            var result = ((qtdSalgado * 10) + (qtdBebida * 15))*0.1
            var navegar = Intent(this,  SecondActivity::class.java)
            startActivity(navegar)
        }
    }
}

