package com.example.summy.simpledagger2

import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))

interface AppComponent {

     fun plus(loginModule: LoginModule)

}
