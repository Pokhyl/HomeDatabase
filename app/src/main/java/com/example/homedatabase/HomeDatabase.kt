package com.example.homedatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Home::class],version = 1, exportSchema = false)
abstract class HomeDatabase: RoomDatabase() {

    abstract fun f1(): HomeDao


}