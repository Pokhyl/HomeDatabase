package com.example.homedatabase.di

import android.content.Context
import com.example.homedatabase.BlankFragment1
import com.example.homedatabase.BlankFragment2
import com.example.homedatabase.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [HomeModule::class])
interface HomeComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun context(context: Context): Builder
        fun build(): HomeComponent

    }
    fun inject(mainActivity: MainActivity)//куда будем делать иньекцию
    fun inject(blankFragment1: BlankFragment1)
    fun inject(blankFragment2: BlankFragment2)
}