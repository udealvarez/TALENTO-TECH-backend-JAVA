package com.techlab.pedidos;

import com.techlab.productos.Producto;

public class ItemPedido {

    private Producto producto;
    private int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        setProducto(producto);
        setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() + " | Cantidad: " + cantidad + " | Subtotal: $" + calcularSubtotal();
    }
}
