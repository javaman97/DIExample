package com.aman.diexample

/*

class QuoteRepository {
    fun getQuote():String {
        return "Believe in yourself"
    }
}

Our QuoteViewModel Directly depends on Concreate QuoteRepository class.
What if we want to switch between
Api-based Repository
Local DB based Repository
Fake Repository for Testing

We should depend on an abstraction instead of a concrete implementation.
 */

interface QuoteRepository {
    fun getQuote():String
}