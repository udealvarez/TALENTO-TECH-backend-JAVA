import java.security.ProtectionDomain;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // array lists
        ArrayList<Producto> catalogo = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        // esta es una manera de crear un objeto
        Producto cafe = new Producto();
        cafe.nombre = "Café Premium Molido";
        cafe.precio = 250;
        cafe.cantidadEnStock = 100;

        Producto teVerde = new Producto();
        teVerde.nombre = "Té Verde Orgánico";
        teVerde.precio = 180;
        teVerde.cantidadEnStock = 50;

        catalogo.add(cafe);
        catalogo.add(teVerde);


        // esta es una manera mas simple de crear objetos
        Cliente polaco = new Cliente("Juan", "polaco@php.com");
        Cliente ude = new Cliente("Eduardo", "ude@java.com");
        Cliente meli = new Cliente("Melina", "meli@frontend.com");

        clientes.add(polaco);
        clientes.add(ude);
        clientes.add(meli);





    }
}
