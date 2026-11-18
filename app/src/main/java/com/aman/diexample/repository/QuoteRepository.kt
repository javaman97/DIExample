package com.aman.diexample.repository

import com.aman.diexample.model.QuoteResponse

interface QuoteRepository {
    suspend fun getQuotes(): QuoteResponse
}