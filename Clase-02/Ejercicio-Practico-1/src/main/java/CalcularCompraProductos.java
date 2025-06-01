import java.sql.SQLOutput;
import java.util.Scanner;

public class CalcularCompraProductos {

    public static void main(String[] args) {

        /*
            Variables y Operadores:
                Creá variables para representar el precio de un producto y la cantidad deseada por el cliente. Calculá y mostrale en pantalla el costo total.
                Modificá el precio o la cantidad y verificá el resultado.

            Entrada y Salida de Datos:
                Pedile al usuario que ingrese su nombre y la cantidad de productos que quiere comprar.
                Mostrá un mensaje personalizado con el monto total (asignando un precio fijo por unidad).
         */

        double precioUnitario = 123.5;
        int cantidad;
        double costoTotal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda FA FA FA");

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Bienvenido " + nombre + "!!");

        System.out.println("Por favor ingrese la cantidad de MANZANAS en kilos: ");
        cantidad = entrada.nextInt();

        System.out.println("El precio unitario del kilo de manzana es " + precioUnitario);

        costoTotal = cantidad * precioUnitario;

        System.out.println("El costo total es: $ " + costoTotal);
    }
}
