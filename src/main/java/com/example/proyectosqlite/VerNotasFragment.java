package com.example.proyectosqlite;

import android.database.Cursor;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class VerNotasFragment extends Fragment {

    private SQLNotaDBHelper dbHelper;
    private ListView notasListView;
    private void mostrarNotas() {
        // Lista para almacenar los títulos de las notas
        List<String> listaTitulos = new ArrayList<>();

        // Realizar una consulta en la base de datos
        Cursor cursor = dbHelper.getReadableDatabase().query(
                SQLNotaDBHelper.TABLE_NOTAS,
                null, null, null, null, null, null
        );

        // Recorrer el cursor para obtener los títulos de las notas
        if (cursor.moveToFirst()) {
            do {
                String titulo = cursor.getString(cursor.getColumnIndexOrThrow(SQLNotaDBHelper.COLUMN_TITULO));
                listaTitulos.add(titulo);
            } while (cursor.moveToNext());
        }

        // Cerrar el cursor
        cursor.close();

        // Configurar un ArrayAdapter para mostrar las notas en el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listaTitulos);
        notasListView.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        dbHelper.close(); // Cerrar la base de datos cuando el Fragment se destruya
    }
}
