package com.aman.diexample.repository

import com.aman.diexample.model.QuoteResponse

class FakeRepository: QuoteRepository {

    override suspend fun getQuotes(): QuoteResponse {
        TODO("Not yet implemented")
    }
}