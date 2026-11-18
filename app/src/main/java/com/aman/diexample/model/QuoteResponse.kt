package com.aman.diexample.model

import com.google.gson.annotations.SerializedName

data class QuoteResponse(
    @SerializedName("quotes")
    private val quoteResponse: List<Quote>)
