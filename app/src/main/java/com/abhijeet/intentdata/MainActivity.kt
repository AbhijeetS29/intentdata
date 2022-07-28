package com.abhijeet.intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.abhijeet.intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnsubmit.setOnClickListener {
            var intent=Intent(this,saveddata::class.java)
            intent.putExtra("string",binding.etstring.text.toString())
            intent.putExtra("integer",binding.etinteger.text.toString().toInt())
            intent.putExtra("character",binding.etcharacter.text.toString().toCharArray())
            intent.putExtra("long",binding.etlong.text.toString().toLong())
            intent.putExtra("short",binding.etshort.text.toString().toShort())
            intent.putExtra("boolean",binding.etboolean.text.toString().toBoolean())
            startActivity(intent)
        }

    }
}