package com.smurzik.domain

interface Repository {

    suspend fun loadQuote(): LoadQuoteResult
}