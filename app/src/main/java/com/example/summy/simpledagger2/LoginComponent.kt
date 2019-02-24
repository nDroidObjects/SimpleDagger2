package com.example.summy.simpledagger2

import dagger.Subcomponent

@LoginScope
@Subcomponent(modules = arrayOf(LoginModule::class))
interface LoginComponent {

    fun inject(loginActivity: LoginActivity)
}
