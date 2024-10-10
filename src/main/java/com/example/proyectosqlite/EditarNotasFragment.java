package com.example.proyectosqlite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;

public class EditarNotasFragment extends Fragment {

    private EditText editTituloNota, editDescripcionNota;
    private Button botonActualizar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View view = inflater.inflate(R.layout.fragment_editar_notas, container, false);

        // Inicializar los elementos de la interfaz
        editTituloNota = view.findViewById(R.id.editTituloNota);
        editDescripcionNota = view.findViewById(R.id.editDescripcionNota);
        botonActualizar = view.findViewById(R.id.botonActualizar);

        // Configurar la acción del botón
        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para actualizar la nota
            }
        });

        return view;
    }
}
