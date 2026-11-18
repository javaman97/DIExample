package com.aman.diexample.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aman.diexample.model.Quote
import com.aman.diexample.model.QuoteResponse
import com.aman.diexample.repository.QuoteRepository
import kotlinx.coroutines.launch

class QuoteViewModel(
    private val quoteRepo: QuoteRepository
) : ViewModel() {

    private val _response = MutableLiveData<QuoteResponse>()
    val response: LiveData<QuoteResponse> = _response
    fun getQuotes() {
        viewModelScope.launch {
            try {
                val result = quoteRepo.getQuotes()
                _response.value = result

                Log.d("ViewModel Result", response.value.toString())

            } catch (e: Exception) {
                Log.d("ViewModel Error", e.toString())
            }
        }
    }
}