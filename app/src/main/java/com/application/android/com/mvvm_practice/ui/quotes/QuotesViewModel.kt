package com.application.android.com.mvvm_practice.ui.quotes

import androidx.lifecycle.ViewModel
import com.application.android.com.mvvm_practice.data.Quote
import com.application.android.com.mvvm_practice.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
: ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}