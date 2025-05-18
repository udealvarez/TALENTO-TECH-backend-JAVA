package com.techlab.productos;

public class Libro extends Producto{

    private String autor;
    private String genero;

    public Libro(String nombre, double precio, int cantidadEnStock, String autor, String genero) {
        super(nombre, precio, cantidadEnStock);
        setAutor(autor);
        setGenero(genero);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = formatearNombre(autor.trim());
        } else {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.trim().isEmpty()) {
            this.genero = formatearNombre(genero.trim());
        } else {
            throw new IllegalArgumentException("El género no puede estar vacío.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor + " | Género: " + genero;
    }
}
