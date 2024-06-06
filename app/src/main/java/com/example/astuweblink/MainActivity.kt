package com.example.astuweblink

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openAstuWebButton: Button = findViewById(R.id.openAstuWebButton)
        openAstuWebButton.setOnClickListener {
            val githubUrl = "https://www.astu.edu.et/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
            startActivity(intent)
        }
    }
}
