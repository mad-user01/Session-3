package com.example.session_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity_forYou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_for_you)
    }
    fun click3(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }
    fun click2(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }
    fun click1(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }
    fun click4(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }

    fun click10(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }
    fun clicked(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }





    fun click222(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun click333(view: View) {
        val intent = Intent(this, MainActivity_New::class.java)
        startActivity(intent)
    }


}