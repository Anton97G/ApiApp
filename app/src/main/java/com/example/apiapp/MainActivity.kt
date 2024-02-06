package com.example.apiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.apiapp.data.RetrofitService
import com.example.apiapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val data = RetrofitService.apiService.getQuote()
                    binding.textQuote.text = data.quote
                    binding.textAuthor.text = data.author
                }
                catch (e: Exception){
                    Log.d("ERROR", e.message.toString())
                }
            }
        }


    }
}