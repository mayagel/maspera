package com.miara.yagel.maspera;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Yagel on 23/01/2018.
 * the class that represent the pattern of SQLite table for manager
 */

public class Manager extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="babari.db";//the name of the database that the SQLite get into
    public static final String TABLE_NAME="manager_table";//the name of the SQLite table
    public static final String COL_1="ID";//the ID of each manager (fill automatically)
    public static final String COL_2="NAME";//the name of the manager (userName)
    public static final String COL_3="PASSWORD";//the password of the manager
    public static final String COL_4="BAR_ID";//the bar the manager own

    public Manager(Context context){
        super(context, DATABASE_NAME,null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
