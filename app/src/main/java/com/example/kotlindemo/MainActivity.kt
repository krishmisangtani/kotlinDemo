package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlindemo.databinding.ActivityMainBinding


lateinit var binding :ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var src=binding.et1.text.toString()
        binding.submit.setOnClickListener{
            Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()
            Log.d("name",binding.et1.text.toString())
            Toast.makeText("Hello", Toast.LENGTH_SHORT).show()
        }
    }
}