import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        Te nuevoTe = new Te("Te negro", 1000, "Argentina");
        Cafe nuevoCafe = new Cafe("Cafe Colombiano", 1200, "Arabica");

        productos.add(nuevoTe);
        productos.add(nuevoCafe);

        for(Producto item : productos){
            System.out.println("Producto: " + item.getNombre());
            System.out.println("Precio total: $ " + item.calcularPrecioFinal());
            System.out.println("--------");
        }
    }
}
