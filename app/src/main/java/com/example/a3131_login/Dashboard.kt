package com.example.a3131_login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val tv_ucap: TextView = findViewById(R.id.tv_ucap)
        val bt_link: Button = findViewById(R.id.btn_link)
        val url = "https://amikom.ac.id"
        val username = intent.getStringExtra("nama")

        bt_link.setOnClickListener {
            val url = "https://amikom.ac.id"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            intent.setPackage("com.android.chrome")
            startActivity(intent)
        }

        tv_ucap.text = "Selamat Datang $username"
    }
}