package com.application.android.com.mvvm_practice.data

class FakeDatabase private constructor(){


    // Creates a DAO inside here
    var quoteDao = FakeQuoteDao()
    private set

    // Static
    companion object {
        @Volatile private var instance : FakeDatabase? = null

                fun getInstance() =
                        instance ?: synchronized(this){
                            instance ?: FakeDatabase().also { instance = it }
                        }
    }

}