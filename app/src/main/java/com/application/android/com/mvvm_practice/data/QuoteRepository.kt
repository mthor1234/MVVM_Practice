package com.application.android.com.mvvm_practice.data

// Takes in a Dao in the constructor
class QuoteRepository private constructor(val quoteDao: FakeQuoteDao){

    // Calls the Dao to add / get quotes
    fun addQuote(quote : Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile private var instance : QuoteRepository? = null

        fun getInstance(quoteDao : FakeQuoteDao) =
                instance ?: synchronized(this){
                    instance ?: QuoteRepository(quoteDao).also { instance = it }
                }
    }

}


