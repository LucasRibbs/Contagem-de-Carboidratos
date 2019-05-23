package com.example.telainicial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Refeicao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refeicao)
    }
    fun scanner(view : View){
        val intent = Intent(this, Barcode :: class.java)
        startActivity(intent)
    }
}
