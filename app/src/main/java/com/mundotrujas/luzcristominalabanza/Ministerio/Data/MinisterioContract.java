package com.mundotrujas.luzcristominalabanza.Ministerio.Data;

import android.content.ContentValues;
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

    private SQLiteDatabase db;
    private MinisterioDbHelper DbHelper;
    // Método y contructir parta crear la Bd y la tabla.
    public MinisterioContract(Context context) {
         // Instanciamos una objeto de Tipo creación de Tabla y la Base de Datos.
        DbHelper = new MinisterioDbHelper(context);
         // Ponemos la base de datos modo escritura.
        db  = DbHelper.getWritableDatabase();
    }

    // Método para insertar datoa a la tabla
    public void InsertarDatos(String pNombres, String pApellidos, int pIdInstrumento, int pEstado)
    {
        // envia para insertar datos al la tabla persona.
        db.insert(TABLE_NAME, null, AsignarValores(pNombres, pApellidos, pIdInstrumento, pEstado));
    }

    // Método para asignar valores
    private ContentValues AsignarValores(String pNombres, String pApellidos, int pIdInstrumento, int pEstado)
    {
        // Instanciar objeto
        ContentValues valores =  new ContentValues();
        // Asignar los valores al par ordenado.
        valores.put(FIELD_NOMBRES, pNombres);
        valores.put(FIELD_APELLIDOS, pApellidos);
        valores.put(FIELD_ID_INSTRUMENTO, pIdInstrumento);
        valores.put(FIELD_ESTADO, pEstado);

        return valores;
    }
}

