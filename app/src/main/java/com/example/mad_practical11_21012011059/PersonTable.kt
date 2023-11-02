package com.example.mad_practical11_21012011059

import android.database.sqlite.SQLiteDatabase

class PersonTable {
    companion object{
        val TABLE_NAME = "Person"
        val COLUMN_ID = "Id"
        val COLUMN_NAME = "Name"
        val COLUMN_ADDRESS = "Address"
        val COLUMN_EMAILID = "EmailId"
        val COLUMN_PHONENO = "PhoneNo"
        val COLUMN_GPS_LAT = "Person_lat"
        val COLUMN_GPS_LONG = "Person_Long"

        val CREATE_TABLE = ("CREATE TABLE" + TABLE_NAME + "("
                + COLUMN_ID + "TEXT PRIMARY KEY,"
                + COLUMN_NAME + "TEXT,"
                + COLUMN_EMAILID + "TEXT,"
                + COLUMN_PHONENO + "TEXT,"
                + COLUMN_ADDRESS + "TEXT,"
                + COLUMN_GPS_LAT + "REAL"
                + COLUMN_GPS_LONG + "REAL"
                + ")")
    }
}