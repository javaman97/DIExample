package com.aman.diexample.repository

import com.aman.diexample.api.QuoteApiService
import com.aman.diexample.model.QuoteResponse
import javax.inject.Inject

class QuoteRepoImpl @Inject constructor(private  val apiService: QuoteApiService): QuoteRepository {
    override suspend fun getQuotes(): QuoteResponse {
        return apiService.getQuotes()
    }

}