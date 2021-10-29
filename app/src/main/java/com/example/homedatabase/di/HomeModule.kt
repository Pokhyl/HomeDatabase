package com.example.homedatabase.di

import android.content.Context
import androidx.room.Room
import com.example.homedatabase.HomeDatabase
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

@Provides
    fun getDatabase(context: Context): HomeDatabase {

        return Room.databaseBuilder(
                context.applicationContext,
                HomeDatabase::class.java,
                "home_database"
            )

                .fallbackToDestructiveMigration()
                .build()

    }
}