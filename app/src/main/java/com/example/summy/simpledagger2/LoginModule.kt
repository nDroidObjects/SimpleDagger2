package com.example.summy.simpledagger2

import dagger.Module
import dagger.Provides

@Module
class LoginModule {

    @Provides
    fun providesSomeBigObject(): SomeBigObject {
        return SomeBigObject()
    }
}
