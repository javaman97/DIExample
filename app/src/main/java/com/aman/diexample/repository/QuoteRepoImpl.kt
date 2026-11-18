package com.aman.diexample.repository

import com.aman.diexample.api.QuoteApiService
import com.aman.diexample.model.QuoteResponse

class QuoteRepoImpl(private  val apiService: QuoteApiService): QuoteRepository {
    override suspend fun getQuotes(): QuoteResponse {
        return apiService.getQuotes()
    }

}