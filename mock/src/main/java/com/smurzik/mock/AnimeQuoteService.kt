package com.smurzik.mock

import retrofit2.http.GET

interface AnimeQuoteService {
    @GET("quotes/random")
    suspend fun animeQuote(): AnimeQuoteCloud
}