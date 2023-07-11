package com.example.project2_todolistapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

// 1.Entity -> Table Structure -> Now Your data is Stored

@Entity(tableName = "notes_table")
data class Todo (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val isDone:Boolean,

    val desc:String,

    val title:String,

    val date: Date

)
// Integer
// Text
// Char
//Boolean -> Integer(0,1)

// To Store a Custom object - we need to convert that object into one of the accepted types of Db