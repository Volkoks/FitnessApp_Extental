package com.example.testforsoftdc


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testforsoftdc.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private var binding: MainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

    }

}