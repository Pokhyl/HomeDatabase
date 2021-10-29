package com.example.homedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homedatabase.di.HomeComponent

class MainActivity : AppCompatActivity() {
lateinit var homeComponent: HomeComponent
    override fun onCreate(savedInstanceState: Bundle?) {
       homeComponent = (applicationContext as App).homeComponent
           homeComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}