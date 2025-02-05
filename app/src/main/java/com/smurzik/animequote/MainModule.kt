package com.smurzik.animequote

import com.smurzik.data.RepositoryImplementation
import com.smurzik.domain.LoadQuoteResult
import com.smurzik.domain.Repository
import com.smurzik.presentation.QuoteUiMapper
import com.smurzik.presentation.QuoteUiState
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MainModule {

    @Binds
    abstract fun provideRepository(implementation: RepositoryImplementation): Repository

    @Binds
    abstract fun provideMapper(mapper: QuoteUiMapper): LoadQuoteResult.Mapper<QuoteUiState>
}