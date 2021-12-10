package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.databinding.Activity2Binding
import com.example.materialdesign.databinding.Activity2Binding.inflate
import com.example.materialdesign.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerificarCheck.setOnClickListener { verificarCheck() }
    }

    fun verificarCheck(){
        var texto:String
        texto=""

        if (binding.checkCSharp.isChecked){
            texto="C#\n"
        }
        if (binding.checkKotlin.isChecked){
            texto="${texto}Kotlin\n"
        }
        if (binding.checkJava.isChecked){
            texto="${texto}Java"
        }
        Toast.makeText(this@Activity2,texto, Toast.LENGTH_SHORT).show()
    }
}