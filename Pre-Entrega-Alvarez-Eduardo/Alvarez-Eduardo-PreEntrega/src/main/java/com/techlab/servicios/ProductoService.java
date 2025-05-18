package com.techlab.servicios;

import com.techlab.productos.Producto;
import com.techlab.productos.Libro;
import com.techlab.productos.Ropa;
import com.techlab.productos.Tecnologia;
import java.util.ArrayList;
import java.util.List;

public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para mostrar.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public Producto buscarPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre.trim())) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String nombre) {
        Producto producto = buscarPorNombre(nombre);
        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }

    public void cargarProductosIniciales() {
        agregarProducto(new Libro("El Principito", 1500.0, 10, "Antoine", "Infantil"));
        agregarProducto(new Tecnologia("Auriculares Bluetooth", 9500.0, 5, "Sony", "Mod 25"));
        agregarProducto(new Ropa("Campera de cuero", 12000.0, 3, "L", "Negro"));
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
