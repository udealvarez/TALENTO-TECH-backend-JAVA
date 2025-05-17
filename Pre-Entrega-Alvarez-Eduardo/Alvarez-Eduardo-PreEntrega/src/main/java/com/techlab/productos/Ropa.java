package com.techlab.productos;

public class Ropa extends Producto{

    private String talla;
    private String color;

    public Ropa(String nombre, double precio, int cantidadEnStock, String color, String talla) {
        super(nombre, precio, cantidadEnStock);
        this.color = color;
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = formatearNombre(color.trim());
        } else {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        if (talla != null && !talla.trim().isEmpty()) {
            this.talla = talla.trim().toUpperCase();
        } else {
            throw new IllegalArgumentException("La talla no puede estar vacía.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Talla: " + talla + " | Color: " + color;
    }
}
