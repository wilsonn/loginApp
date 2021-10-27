package com.nttdata.loginappeveris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.nttdata.loginappeveris.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  txtEmail : TextInputLayout
    private lateinit var  txtPassword : TextInputLayout
    private lateinit var  btnLogin : Button
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        //getViews()
        setViews()
        Log.d("Lifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy")
    }

    /*private fun getViews(){
        txtEmail = findViewById(R.id.txt_Email)
        txtPassword = findViewById(R.id.txt_password)
        btnLogin = findViewById(R.id.btn_login)
    }*/

    private fun setViews(){
        /*btnLogin.setOnClickListener {
            val email = txtEmail.editText?.text.toString()
            val password = txtPassword.editText?.text.toString()

            val message : String = if(email == "everis@nttdata.com" && password=="12345") {
                "Login valido"
            } else {
                "Login no valido"
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }*/

        binding.btnLogin.setOnClickListener {
            val email = binding.txtEmail.editText?.text.toString()
            val password = binding.txtPassword.editText?.text.toString()

            val message : String = if(email == "everis@nttdata.com" && password=="12345") {
                "Login valido"
            } else {
                "Login no valido"
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }


    }
}