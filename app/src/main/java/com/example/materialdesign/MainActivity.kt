package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener { abrirTela() }
        binding.fabAdicionar.setOnClickListener{exibirToast()}
    }
    fun abrirTela(){
        val minhaTela = Intent(this,Activity2::class.java)
        startActivity(minhaTela)
    }

    fun exibirToast(){
        Toast.makeText(this@MainActivity,"Você clicou no FAB", Toast.LENGTH_SHORT).show()
    }
}