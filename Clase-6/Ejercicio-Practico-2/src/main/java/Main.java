public class Main {
    public static void main(String[] args) {

        double total;

        Cliente nuevoCliente = new Cliente("Juan Rios", "polaco@php.com");

        Producto primerProducto = new Producto("Macbook Pro M4", 2500, 7);
        Producto segundoProducto = new Producto("Mouse Logitech Mx Master 3", 129.54, 7);
        Producto tercerProducto = new Producto("Teclado Keychron k7", 188.79, 7);

        Carrito nuevoCarrito = new Carrito();

        nuevoCarrito.sumarProductos(primerProducto);
        nuevoCarrito.sumarProductos(segundoProducto);
        nuevoCarrito.sumarProductos(tercerProducto);

        total = nuevoCarrito.calcularTotal();

        System.out.println("El cliente " + nuevoCliente.getNombre() + " tiene " + Producto.getContadorProductos() + " productos. Precio Total a Pagar es: $ " + total);
    }
}
