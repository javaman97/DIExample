package com.aman.diexample

class FakeRepository: QuoteRepository {
    override fun getQuote(): String {
        return "Fake Repository for Testing"
    }
}