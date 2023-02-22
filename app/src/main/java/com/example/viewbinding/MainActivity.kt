package com.example.viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {

            val username = binding.etUser.text.toString()
            val password = binding.etPassword.text.toString()

            if(username.isEmpty()){
                Toast.makeText(this,"Please Enter Username",Toast.LENGTH_SHORT).show()
            }
            else if (password.isEmpty()){
                Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show()
            }

            else if (!binding.checkBox.isChecked){
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Please Agree to our T&C",Toast.LENGTH_SHORT).show()
            }

            else{
                Toast.makeText(this,"Login Successful!",Toast.LENGTH_SHORT).show()
            }

        }

    }
}