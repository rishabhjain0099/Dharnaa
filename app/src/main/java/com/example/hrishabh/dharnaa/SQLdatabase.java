package com.example.rj.dharnaa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RJ on 10/25/2017.
 */

class SQLite_Database extends SQLiteOpenHelper {
    public static final String Database_Name = "Databas.db";
    public static final String Table_Name = "Data_table";
    public SQLite_Database(Context context) {
        super(context,Database_Name,null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+Table_Name +"(USERNAME TEXT PRIMARY KEY , PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Table_Name );
        onCreate(db);
    }
}
