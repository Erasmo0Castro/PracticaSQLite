package com.example.proyectosqlite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NotasAdapter extends RecyclerView.Adapter<NotasAdapter.NotaViewHolder> {

    private List<Nota> listaDeNotas;

    public NotasAdapter(List<Nota> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    @NonNull
    @Override
    public NotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nota, parent, false);
        return new NotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotaViewHolder holder, int position) {
        Nota nota = listaDeNotas.get(position);
        holder.tituloNota.setText(nota.getTitulo());
        holder.descripcionNota.setText(nota.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaDeNotas.size();
    }

    public static class NotaViewHolder extends RecyclerView.ViewHolder {
        TextView tituloNota, descripcionNota;

        public NotaViewHolder(@NonNull View itemView) {
            super(itemView);
            tituloNota = itemView.findViewById(R.id.tituloNota);
            descripcionNota = itemView.findViewById(R.id.descripcionNota);
        }
    }
}
