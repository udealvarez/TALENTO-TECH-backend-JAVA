package com.ejercicio.ejercicioDosClaseDiez;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoService {

    public List<Producto> obtenerProductos() {
        return Arrays.asList(
                new Producto(1, "Notebook", 1500.0),
                new Producto(2, "Mouse", 25.0),
                new Producto(3, "Teclado", 45.0)
        );
    }
}
