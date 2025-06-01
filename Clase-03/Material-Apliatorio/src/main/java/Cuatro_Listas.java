import java.util.ArrayList;

public class Cuatro_Listas {
    public static void main(String[] args) {

        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Televisor");
        listaProductos.add("Heladera");
        listaProductos.add("Mesa");
        listaProductos.add("Sillas");
        listaProductos.add("Lavarropas");

        System.out.println(listaProductos);     // muestra como un array

        for(String producto : listaProductos){  // en forma de lista de items
            System.out.println(producto);
        }
    }
}
