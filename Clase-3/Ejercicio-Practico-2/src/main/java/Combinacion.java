import java.util.ArrayList;

public class Combinacion {
    public static void main(String[] args) {

        // Tené una lista de productos con nombres desprolijos.
        // Creá un mét odo que recorra la lista y aplique el formateo a cada nombre, volviendo a imprimir la lista con nombres prolijos.

        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("   pinZa");
        listaProductos.add("ALICATE ");
        listaProductos.add(" cIntA  ");
        listaProductos.add("metrO");
        listaProductos.add("   rEgla");
        listaProductos.add(" ALAMBRE ");

        System.out.println("Lista sin formato: ");

        for (String producto : listaProductos){
            System.out.println("Producto: " + producto);
        }

        System.out.println(" ");
        System.out.println(" ");

        ArrayList<String> listaProductoFormateada = formatearLista(listaProductos); // le paso la lista original por parametro

        System.out.println("Lista CON formato: ");

        for (String productoFormateado : listaProductoFormateada){
            System.out.println("Producto formateado: " + productoFormateado);
        }
    }

    public static ArrayList<String> formatearLista(ArrayList<String> productos) {

        ArrayList<String> listaProductosActualizada = new ArrayList<>();

        for (String producto : productos){
            String primerFormato = producto.trim().toLowerCase();   // itero el producto de la lista -> minuscula y elimino espacios, pero sobre el PRODUCTO INDIVIDUAL
            String formatoFinal = primerFormato.substring(0,1).toUpperCase() + primerFormato.substring(1);       // concateno la primera letra mayuscula con el resto de las letras

            listaProductosActualizada.add(formatoFinal);
        }
        return listaProductosActualizada;
    }
}
