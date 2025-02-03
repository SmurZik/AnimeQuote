package com.smurzik.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smurzik.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val viewModel = (application as ProvideViewModel).viewModel()

        viewModel.liveData.observe(this) {
            binding.mainTextView.text = it
        }

        viewModel.load()
    }
}