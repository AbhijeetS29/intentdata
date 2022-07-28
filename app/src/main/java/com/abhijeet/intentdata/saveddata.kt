package com.abhijeet.intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.abhijeet.intentdata.databinding.ActivitySaveddataBinding

class saveddata : AppCompatActivity() {
    lateinit var binding : ActivitySaveddataBinding
    var strin : String =""
    var integr : Int = 0
    var cha : Char = 'a'
    var lon : Long =0
    var shor : Short =0
    var boolea  : Boolean= false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveddataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent?.let {
            (if (it.hasExtra("string"))
            strin = it.getStringExtra("string") as String)
            (if (it.hasExtra("integer"))
            integr = it.getIntExtra("integer", 0))
            (if (it.hasExtra("character"))
            cha=it.getCharExtra("character",'u'))
            (if(it.hasExtra("long"))
            lon=it.getLongExtra("long",0L))
            (if(it.hasExtra("short"))
            shor=it.getShortExtra("short",0))
            (if(it.hasExtra("boolean"))
            boolea=it.getBooleanExtra("boolean",false))
        }?:kotlin.run {  }
        binding.tvstring.setText(strin)
        binding.tvstring2.setText (integr.toString())
        binding.tvstring3.setText(cha.toString())
        binding.tvstring4.setText(lon.toString())
        binding.tvstring5.setText(shor.toString())
        binding.tvstring6.setText(boolea.toString())

    }
}