package com.techlab.productos;

import com.techlab.excepciones.ProductoNoEncontradoException;
import java.util.List;

public class ProductoService {

    private List<Producto> productos;

    // constructor
    public ProductoService(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto buscarProductoNombre(String nombre) throws ProductoNoEncontradoException{

        for (Producto item : productos){
            if (item.getNombre().equalsIgnoreCase(nombre)){
                return item;
            }
        }

        throw new ProductoNoEncontradoException("El producto '" + nombre + "' no existe");
    }
}
