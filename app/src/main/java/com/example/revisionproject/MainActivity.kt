package com.example.revisionproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this , "Welcome",Toast.LENGTH_SHORT).show()
        
        but_Login.setOnClickListener { 
            var intent = Intent(this , LoginScreen::class.java)
            startActivity(intent)
        }

        but_Register.setOnClickListener {
            var intent2 = Intent(this , RegisterScreen::class.java)
            startActivity(intent2)
        }


    }
}