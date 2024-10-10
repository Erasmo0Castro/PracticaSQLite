package com.example.proyectosqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLNotaDBHelper extends SQLiteOpenHelper {

    // Nombre de la base de datos y versión
    private static final String DATABASE_NAME = "notas.db";
    private static final int DATABASE_VERSION = 1;

    // Nombre de la tabla
    public static final String TABLE_NOTAS = "notas";

    // Columnas de la tabla
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITULO = "titulo";
    public static final String COLUMN_DESCRIPCION = "descripcion";
    public static final String COLUMN_IMAGEN = "imagen";

    // Sentencia SQL para crear la tabla
    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NOTAS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_TITULO + " TEXT NOT NULL, " +
                    COLUMN_DESCRIPCION + " TEXT, " +
                    COLUMN_IMAGEN + " TEXT" +
                    ");";

    public SQLNotaDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    // Método para actualizar la base de datos en futuras versiones
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Por simplicidad, eliminamos la tabla y la recreamos
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTAS);
        onCreate(db);
    }
}
