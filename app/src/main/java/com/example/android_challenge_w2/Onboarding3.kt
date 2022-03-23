package com.example.android_challenge_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
        supportActionBar?.hide();

        val button = findViewById<ImageButton>(R.id.button3)

        button.setOnClickListener{
            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
        }
    }
}