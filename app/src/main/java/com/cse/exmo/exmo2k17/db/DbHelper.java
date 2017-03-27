package com.cse.exmo.exmo2k17.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sineth on 3/25/2017. ExmoAndroid
 */

public class DbHelper extends SQLiteOpenHelper {

    private final String CREATE_TABLE = "";
    public final String DATABASE_NAME = "exmo.db";

    private final int VERSION = 1;


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

}
