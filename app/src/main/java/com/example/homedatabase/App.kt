package com.example.homedatabase

import android.app.Application
import com.example.homedatabase.di.DaggerHomeComponent
import com.example.homedatabase.di.HomeComponent

class App : Application(){
    lateinit var homeComponent:HomeComponent
    override fun onCreate() {
        super.onCreate()
         homeComponent = DaggerHomeComponent.builder()
             .context(this)
             .build()

    }
}