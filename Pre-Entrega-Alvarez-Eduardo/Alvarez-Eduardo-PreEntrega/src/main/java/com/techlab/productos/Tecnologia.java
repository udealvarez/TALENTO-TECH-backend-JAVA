package com.techlab.productos;

public class Tecnologia extends Producto{

    private String marca;
    private String modelo;

    public Tecnologia(String nombre, double precio, int cantidadEnStock, String marca, String modelo) {
        super(nombre, precio, cantidadEnStock);
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = formatearNombre(marca.trim());
        } else {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo.trim(); // Modelo puede tener letras y números, lo dejamos tal cual
        } else {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Marca: " + marca + " | Modelo: " + modelo;
    }
}
