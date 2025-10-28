package com.example.a3131_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
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
        val rg_kelamin: RadioGroup = findViewById(R.id.kelamin)
        val cb_setuju: CheckBox = findViewById(R.id.setuju)

        bt_regis.setOnClickListener {
            val username = et_user.text.toString()
            var jKelamin = ""
            val setuju=cb_setuju.isChecked
            if (!cb_setuju.isChecked){
                Toast.makeText(this,"Anda harus menyetujui syarat dan ketentuan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val pKelamin: Int=rg_kelamin.checkedRadioButtonId
            if (pKelamin==-1){
                Toast.makeText(this,"Silahkan Pilih Kelamin Anda", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            jKelamin = when (pKelamin){
                R.id.pria->"Pria"
                R.id.wanita->"wanita"
                else -> ""
            }

            Toast.makeText(this,"Jenis Kelamin: $jKelamin, Setuju: $setuju", Toast.LENGTH_SHORT).show()

            val pindah: Intent = Intent(this, Dashboard::class.java)
            pindah.putExtra("nama", username)
            pindah.putExtra("jKelamin", jKelamin)
            startActivity(pindah)
        }


    }
}