package com.example.telainicial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun editCafe(view: View){
        val intent = Intent(this, Refeicao :: class.java)
        startActivity(intent)
    }

    fun editPre(view: View){
        val intent = Intent(this, Refeicao :: class.java)
        startActivity(intent)
    }
    fun editAlmoco(view: View){
        val intent = Intent(this, Refeicao :: class.java)
        startActivity(intent)
    }
    fun editLanche(view: View){
        val intent = Intent(this, Refeicao :: class.java)
        startActivity(intent)
    }
    fun editJantar(view: View){
        val intent = Intent(this, Refeicao :: class.java)
        startActivity(intent)
    }
}
