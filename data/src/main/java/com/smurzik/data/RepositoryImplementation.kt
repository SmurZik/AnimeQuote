package com.smurzik.data

import com.smurzik.domain.LoadQuoteResult
import com.smurzik.domain.Repository
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(
    private val service: AnimeQuoteService
) : Repository {

    override suspend fun loadQuote(): LoadQuoteResult {
        return try {
            val quote = service.animeQuote().data.quote
            LoadQuoteResult.Success(quote)
        } catch (e: Exception) {
            LoadQuoteResult.Error(e.message ?: "error")
        }
    }
}