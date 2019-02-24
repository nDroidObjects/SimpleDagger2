package com.example.summy.simpledagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.SharedPreferences
import javax.inject.Inject



class LoginActivity : AppCompatActivity() {

    @Inject
   lateinit var someBigObject: SomeBigObject

    //@Inject
    //lateinit var sharedPreferences: SharedPreferences

    @set:Inject
    internal var mSharedPreferences: SharedPreferences? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (getApplication() as SampleApplication)
            .createLoginComponent()?.inject(this)
    }

    public override fun onDestroy() {
        (getApplication() as SampleApplication)
            .releaseLoginComponent()
        super.onDestroy()
    }
}
