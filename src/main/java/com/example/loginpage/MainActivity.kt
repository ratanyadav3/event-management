package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener {
            val email = etemail.text.toString().trim()
            val password = etpassword.text.toString().trim()
            if (email.isEmpty())//return true if email is empty
            {
                etemail.error = "Enter email"
                etemail.requestFocus()
            } else if (password.isEmpty()) {
                etpassword.error = "Enter password"
                etpassword.requestFocus()
            } else //validating is successful
            {
                //open home dashboard
                val intent = Intent(this, homeActivity2::class.java)
                startActivity(intent)
            }
        }

        register.setOnClickListener {
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}

