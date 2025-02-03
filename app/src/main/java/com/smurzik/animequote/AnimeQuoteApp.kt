package com.smurzik.animequote

import android.app.Application
import com.smurzik.data.RepositoryImplementation
import com.smurzik.domain.Repository
import com.smurzik.presentation.MainViewModel
import com.smurzik.presentation.ProvideViewModel

class AnimeQuoteApp : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val repository: Repository = RepositoryImplementation()
        viewModel = MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }
}