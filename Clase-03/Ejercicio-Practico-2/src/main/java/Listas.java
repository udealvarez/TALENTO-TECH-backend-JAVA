import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        // Creá un ArrayList<String> para productos.
        // Agregá varios productos, eliminá uno, verificá si otro existe y luego imprimí la lista final.

        ArrayList<String> listaProductos = new ArrayList<>();

        listaProductos.add("teclado");
        listaProductos.add("mouse");
        listaProductos.add("monitor");
        listaProductos.add("parlantes");
        listaProductos.add("cpu");

        // eliminando un producto
        listaProductos.remove("mouse");

        // existe cartuchera??
        boolean existencia = listaProductos.contains("cartuchera");
        System.out.println("Existe la cartuchera? " + existencia);

        // en forma de array
        System.out.println(listaProductos);

        // en forma de lista de productos
        for(String producto : listaProductos){
            System.out.println("Producto: " + producto);
        }

    }
}
