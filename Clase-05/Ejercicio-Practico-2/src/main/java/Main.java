import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> catalogo = new ArrayList<>();

        System.out.println("Clientes.....");

        Cliente primerCliente = new Cliente("eduardito", "ude@java.com");
        Cliente segundoCliente = new Cliente("melina", "meli@meli.com");
        Cliente tercerCliente = new Cliente("nico", "nico@seginfo.com");

        clientes.add(primerCliente);
        clientes.add(segundoCliente);
        clientes.add(tercerCliente);

        for (Cliente item : clientes){
            System.out.println(item);
        }

        System.out.println("Productos.....");

        Producto primerProducto = new Producto("PC", 1023, 1000);
        Producto segundoProducto = new Producto("Impresora", 650, 500);
        Producto tercerProducto = new Producto("Teclado", 1023, 700);

        catalogo.add(primerProducto);
        catalogo.add(segundoProducto);
        catalogo.add(tercerProducto);

        System.out.println("La lista FINAL de profuctos es.....");

        for (Producto item : catalogo) {
            System.out.println(item); // usa toString()
        }

        System.out.println("La lista con PRECIO CON DESCUENTO es.....");

        for (Producto item : catalogo) {
            System.out.println(item.toStringConDescuento());
        }

    }
}
