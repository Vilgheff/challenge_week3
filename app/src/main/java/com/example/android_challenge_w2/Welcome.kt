package com.example.android_challenge_w2

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android_challenge_w2.databinding.ActivityProfileBinding
import com.example.android_challenge_w2.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private  lateinit var  bindingWelcome: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        bindingWelcome= DataBindingUtil.setContentView(this,R.layout.activity_welcome)
        supportActionBar?.hide();

        bindingWelcome.textView28.setOnClickListener{
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        bindingWelcome.btnSignUp.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}