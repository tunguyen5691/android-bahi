package com.example.bahi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonDev = findViewById<Button>(R.id.developer)
        buttonDev.setOnClickListener {
            val intent = Intent(this, activityHomeDeveloper::class.java)
            startActivity(intent)
        }
    }
}

