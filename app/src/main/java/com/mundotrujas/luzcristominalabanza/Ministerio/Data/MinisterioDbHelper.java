package com.mundotrujas.luzcristominalabanza.Ministerio.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Trujas on 4/5/2017.
 */

public class MinisterioDbHelper extends SQLiteOpenHelper {
    // Variables para la Base de Datos
    private static final String DB_NAME = "ministerio.sqlite";
    private static final int DB_VERSION = 1;

    public MinisterioDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Creacion de la Tabla Persona
        db.execSQL(MinisterioContract.CREATE_TABLE_PERSONA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
