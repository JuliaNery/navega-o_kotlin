package com.julianery.navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener { view : View? ->

            var navegarDeVolta = Intent( this, MainActivity::class.java)
            startActivity(navegarDeVolta)
        }
    }
}