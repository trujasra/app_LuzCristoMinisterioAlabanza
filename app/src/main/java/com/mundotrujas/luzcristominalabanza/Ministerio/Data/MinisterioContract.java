package com.mundotrujas.luzcristominalabanza.Ministerio.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Trujas on 4/5/2017.
 */

public class MinisterioContract {

    // Variable para el nombre de la Tabla Persona
    public static final String TABLE_NAME = "persona";

    // Variables y atributos para la Tabla Persona
    private static final String FIELD_ID = "_id";
    private static final String FIELD_NOMBRES = "nombres";
    private static final String FIELD_APELLIDOS = "apellidos";
    private static final String FIELD_ID_INSTRUMENTO = "id_instrumento";
    private static final String FIELD_ESTADO = "estado";

    // Variable y Script para la creacion de la tabla persona
    public static final String CREATE_TABLE_PERSONA = "CREATE TABLE " + TABLE_NAME + "("+
                                                    FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                                                    FIELD_NOMBRES + " TEXT NOT NULL," +
                                                    FIELD_APELLIDOS + " TEXT NOT NULL," +
                                                    FIELD_ID_INSTRUMENTO + " INTEGER NOT NULL," +
                                                    FIELD_ESTADO + " INTEGER NOT NULL" +
                                                    ");";

    SQLiteDatabase SqLiteData;
    public MinisterioContract(Context context) {
         // Instanciamos una objeto de Tipo creacion de Tabla y la Base de Datos.
        MinisterioDbHelper DbHelper = new MinisterioDbHelper(context);
         // Ponemos la base de datos modo escritura.
        SqLiteData  = DbHelper.getWritableDatabase();
    }
}
