package com.example.homedatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Home (
@PrimaryKey(autoGenerate = true)
val id:Int = 0,
var name:String
        )
