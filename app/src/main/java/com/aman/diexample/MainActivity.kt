package com.aman.diexample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.aman.diexample.databinding.ActivityMainBinding
import com.aman.diexample.repository.QuoteRepoImpl
import com.aman.diexample.repository.QuoteRepository
import com.aman.diexample.viewmodels.QuoteViewModel
import com.aman.diexample.viewmodels.QuoteViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: QuoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val apiService = RetrofitClient.apiService

        val repo: QuoteRepository = QuoteRepoImpl(apiService)

        val factory  = QuoteViewModelFactory(repo)

        viewModel = ViewModelProvider(this, factory)[QuoteViewModel::class.java]

       viewModel.getQuotes()

            viewModel.response.observe(this){
                binding.txtQuote.text = it.toString()
                Log.d("MainActivity","quotes-response $it")
        }

    }
}