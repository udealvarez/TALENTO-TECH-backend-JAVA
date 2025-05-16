package com.techlab.pedidos;

import com.techlab.clientes.Cliente;
import com.techlab.productos.Producto;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
