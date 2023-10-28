package com.example.mad_practical11_21012011059

class PersonTable {
    companion object{
        val TABLE_NAME="PERSON"
        val COLUMN_ID="ID"
        val COLUMN_NAME="NAME"
        val COLUMN_EMAILID="emailid"
        val COLUMN_PHONENO="phoneno"
        val COLUMN_ADDRESS="address"
        val COLUMN_LATITUDE="latitude"
        val COLUMN_LONGITUDE="longitude"
    }
    val CREATE_TABLE=("CREATE TABLE"+ TABLE_NAME + "("
            + COLUMN_ID +"TEXT PRIMARY KEY,"
            + COLUMN_NAME+ "TEXT,"
            + COLUMN_EMAILID+"TEXT,"
            + COLUMN_PHONENO+"TEXT,"
            + COLUMN_ADDRESS+"TEXT,"
            + COLUMN_LATITUDE+"REAL,"
            + COLUMN_LONGITUDE+"REAL"
            +")")
}