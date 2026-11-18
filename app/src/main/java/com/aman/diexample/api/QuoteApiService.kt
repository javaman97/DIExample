package com.aman.diexample.api

import com.aman.diexample.model.Quote
import com.aman.diexample.model.QuoteResponse
import retrofit2.http.GET

interface QuoteApiService {

    @GET("quotes")
    suspend fun getQuotes(): QuoteResponse
}