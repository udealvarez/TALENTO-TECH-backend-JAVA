package com.techlab.servicios;

import com.techlab.pedidos.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {

    private List<Pedido> pedidos;

    public PedidoService() {
        pedidos = new ArrayList<>();
    }

    // Este méto do quedará listo para completar en el siguiente paso
    public void crearPedido(Scanner scanner, ProductoService productoService) {
        if (productoService.obtenerProductos().isEmpty()) {
            System.out.println("No hay productos disponibles para realizar un pedido.");
            return;
        }

        Pedido pedido = new Pedido();
        boolean continuar = true;

        while (continuar) {
            // Mostrar productos disponibles
            productoService.listarProductos();

            System.out.print("Ingrese el ID del producto que desea agregar al pedido (o -1 para finalizar): ");
            int idProducto = scanner.nextInt();
            scanner.nextLine();

            if (idProducto == -1) {
                continuar = false;
                break;
            }

            var producto = productoService.buscarProductoPorId(idProducto);
            if (producto == null) {
                System.out.println("Producto no encontrado. Intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese la cantidad deseada: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            try {
                pedido.agregarItem(producto, cantidad);
                System.out.println("Producto agregado al pedido.");
            } catch (IllegalArgumentException | com.techlab.excepciones.StockInsuficienteException e) {
                System.out.println("Error al agregar producto: " + e.getMessage());
            }

            System.out.print("¿Desea agregar otro producto al pedido? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        if (pedido.getItems().isEmpty()) {
            System.out.println("No se agregó ningún producto. El pedido no se registrará.");
        } else {
            agregarPedido(pedido);
            System.out.println("Pedido creado exitosamente:");
            pedido.mostrarDetalle();
        }
    }

    public void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No se realizo ningun pedido.");
            return;
        }

        for (Pedido pedido : pedidos) {
            pedido.mostrarDetalle();
            System.out.println("------------------------");
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }

}
