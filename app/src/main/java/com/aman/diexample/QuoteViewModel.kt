package com.aman.diexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel: ViewModel(){
    /*
This QuoteViewModel is creating dependency for QuoteRepository
This creates tight coupling between the ViewModel and the repository implementation.
Imagine tomorrow you want to replace QuoteRepository with FakeQuoteRepository for testing.
You'll have to modify the QuoteViewModel, that introduces Tight-Coupling
     */
    private val repository = QuoteRepository()
    val quote = MutableLiveData("Honesty is the best policy")

    fun updateQuote(){
        quote.value = repository.getQuote()
    }
}