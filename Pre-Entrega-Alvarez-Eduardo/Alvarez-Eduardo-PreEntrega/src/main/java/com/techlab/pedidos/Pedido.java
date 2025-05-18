package com.techlab.pedidos;

import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static int contador = 1;
    private int id;
    private List<ItemPedido> items;

    public Pedido() {
        this.id = contador++;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void agregarItem(Producto producto, int cantidad) throws StockInsuficienteException {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }
        if (producto.getCantidadEnStock() < cantidad) {
            throw new StockInsuficienteException("No hay suficiente stock para el producto: " + producto.getNombre());
        }

        // descuento el stock al aceptar
        producto.setCantidadEnStock(producto.getCantidadEnStock() - cantidad);

        items.add(new ItemPedido(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("Pedido ID: " + id);
        if (items.isEmpty()) {
            System.out.println("El pedido no contiene productos.");
        } else {
            for (ItemPedido item : items) {
                System.out.println(item);
            }
            System.out.println("TOTAL: $" + calcularTotal());
        }
    }


}
