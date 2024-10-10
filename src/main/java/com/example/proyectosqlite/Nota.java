package com.example.proyectosqlite;

public class Nota {
    private String titulo;
    private String descripcion;

    private String imagen;  // O usa otro tipo de datos como Bitmap si trabajas con imágenes directamente.

    // Constructor
    public Nota(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
