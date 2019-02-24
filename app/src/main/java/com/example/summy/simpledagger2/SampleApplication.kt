package com.example.summy.simpledagger2

import android.app.Application

class SampleApplication : Application() {

    var appComponent: AppComponent? = null

    var loginComponent: LoginComponent? = null


    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    fun createLoginComponent(): LoginComponent? {
        loginComponent = appComponent?.plus(LoginModule()) as LoginComponent
        return loginComponent
    }

    fun releaseLoginComponent() {
        loginComponent = null
    }
}