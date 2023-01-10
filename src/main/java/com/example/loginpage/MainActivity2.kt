package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        register_btn.setOnClickListener {
            val name = rname.text.toString().trim()
            val email = remail.text.toString().trim()
            val password=rpassword.text.toString().trim()
            if(name.isEmpty())
            {
                rname.error = "Enter your name"
                rname.requestFocus()
            }else if (email.isEmpty())
            {
                remail.error="Enter your email"
                remail.requestFocus()
            }else if(password.isEmpty())
            {
                rpassword.error="Enter your password"
                rpassword.requestFocus()
            }else
            {
                val intent= Intent(this,homeActivity2::class.java)
                startActivity(intent)
            }

        }
        signin_btn.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}

