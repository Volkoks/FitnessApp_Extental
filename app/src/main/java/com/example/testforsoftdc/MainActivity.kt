package com.example.testforsoftdc

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testforsoftdc.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private var binding: MainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.main_activity)

    }

}