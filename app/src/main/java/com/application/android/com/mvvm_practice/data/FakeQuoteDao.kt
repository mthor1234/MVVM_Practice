package com.application.android.com.mvvm_practice.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao(){

    // Support Adding and Getting Quotes
    // Live Data
    var quoteList = mutableListOf<Quote>()
    var quotes = MutableLiveData<List<Quote>>()

    init{
        quotes.value = quoteList
    }

    fun addQuote(quote : Quote){
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>


}