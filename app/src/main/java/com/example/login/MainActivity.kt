package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnregLogin.setOnClickListener()
        {
        startActivity(Intent(this,Register :: class.java))
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)

        }
    }
}