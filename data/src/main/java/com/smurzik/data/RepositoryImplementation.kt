package com.smurzik.data

import com.smurzik.domain.Repository
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(
    private val service: AnimeQuoteService
) : Repository {

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = service.animeQuote().data.quote
            Pair(true, quote)
        } catch (e: Exception) {
            Pair(false, e.message ?: "error")
        }
    }
}