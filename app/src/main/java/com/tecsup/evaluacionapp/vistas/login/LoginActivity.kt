package com.tecsup.evaluacionapp.vistas.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.evaluacionapp.R
import com.tecsup.evaluacionapp.vistas.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val actionBar = supportActionBar
        actionBar?.hide()

        btnIngresar.setOnClickListener {
            val correo = edtCorreo.text.toString()
            val clave = edtClave.text.toString()

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email",correo)
            startActivity(intent)
            finish()
        }
    }
}