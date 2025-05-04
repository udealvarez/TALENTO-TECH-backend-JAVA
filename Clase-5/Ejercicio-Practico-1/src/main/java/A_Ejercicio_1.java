import java.util.ArrayList;

public class A_Ejercicio_1 {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente primerCliente = new Cliente();
        primerCliente.nombre = "Eduardo";
        primerCliente.email = "ude@java.com";

        Cliente segundoCliente = new Cliente();
        segundoCliente.nombre = "Juan";
        segundoCliente.email = "polaco@php.com";

        clientes.add(primerCliente);
        clientes.add(segundoCliente);

        Producto nuevoProducto = new Producto();
        nuevoProducto.mostrarInformacion("PC", 1023, 1507);

        for (Cliente item : clientes){
            System.out.println(item);
        }
    }
}
