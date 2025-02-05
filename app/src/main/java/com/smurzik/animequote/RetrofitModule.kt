package com.smurzik.animequote

import com.smurzik.mock.AnimeQuoteService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    fun provideService(): AnimeQuoteService =
        Retrofit.Builder().baseUrl("https://animechan.io/api/v1/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(AnimeQuoteService::class.java)
}