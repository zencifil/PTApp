package com.ipsos.savascilve.ptapp.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by savas.cilve on 24.10.2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 22;
    private static final String DATABASE_NAME = "IPSOSDB";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
