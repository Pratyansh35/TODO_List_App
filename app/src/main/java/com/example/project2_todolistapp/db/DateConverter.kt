package com.example.project2_todolistapp.db

import androidx.room.TypeConverter
import java.util.Date

/*
* TypeConverter -> used when you want to add some custom object in your db
* which is not supported by default */

class DateConverter {

    // To convert data to long -> push data into the db
    @TypeConverter
    fun fromDateToLong(date: Date):Long{
        return  date.time
    }

    // to convert long to date -> reading data from the db
    @TypeConverter
    fun fromLongToDate(timestamp: Long): Date{
        return Date(timestamp)
    }
}