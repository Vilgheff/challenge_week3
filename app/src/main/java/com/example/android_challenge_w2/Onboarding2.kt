package com.example.android_challenge_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
        supportActionBar?.hide();

        val button = findViewById<ImageButton>(R.id.button2)

        button.setOnClickListener{
            val intent = Intent(this, Onboarding3::class.java)
            startActivity(intent)
        }
    }
}