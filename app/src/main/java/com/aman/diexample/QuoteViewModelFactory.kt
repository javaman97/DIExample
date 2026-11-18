package com.aman.diexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/*
The default ViewModel factory doesn't know how to create QuoteRepository and pass it into the constructor.
We need to create a viewmodel factory that will create the exact QuoteViewModel along with QuoteRepostiroy as constructor passed.
 */
class QuoteViewModelFactory(private  val repo: QuoteRepository)
    : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuoteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return QuoteViewModel(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}