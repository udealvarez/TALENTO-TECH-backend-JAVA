package com.techlab.ui;

import com.techlab.productos.Producto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola desde el módulo UI");

        Producto prod = new Producto("Ejemplo") {
        };
        System.out.println("Producto creado: " + prod.getNombre());
    }
}
