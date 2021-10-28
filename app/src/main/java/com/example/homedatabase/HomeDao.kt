package com.example.homedatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface HomeDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(home: Home)
    @Query("SELECT * FROM home")
    fun getAll(): Flow<List<Home>>
}