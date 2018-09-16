package com.application.android.com.mvvm_practice.utilities

import com.application.android.com.mvvm_practice.data.FakeDatabase
import com.application.android.com.mvvm_practice.data.QuoteRepository
import com.application.android.com.mvvm_practice.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuotesViewModelFactory {

        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}