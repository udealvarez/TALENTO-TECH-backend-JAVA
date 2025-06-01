package com.techlab.materialClase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping
    public List<Producto> listarProductos() {
        // Retorna lista de productos (ejemplo)
        return Arrays.asList(
                new Producto("Café", 250.0, 107),
                new Producto("Té", 50.0, 123),
                new Producto("Mate", 150.0, 57),
                new Producto("Matecocido", 25.0, 90)
        );
    }
}
