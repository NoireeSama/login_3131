package com.example.a3131_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val et_user: EditText = findViewById(R.id.et_user)
        val bt_regis: Button = findViewById(R.id.btn_regis)

        bt_regis.setOnClickListener {
            val username = et_user.text.toString()
            val pindah: Intent = Intent(this, Dashboard::class.java)
            pindah.putExtra("nama", username)
            startActivity(pindah)
        }


    }
}