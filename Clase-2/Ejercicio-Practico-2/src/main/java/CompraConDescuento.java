import java.util.Scanner;

public class CompraConDescuento {

    public static void main(String[] args) {

        /*
                Condicionales
                    Suponé que si el cliente quiere más de 100 unidades, le ofrecemos un descuento.
                    Implementá un if que verifique si cantidad > 100. Si es así, mostrá un mensaje indicando que aplica un descuento especial.
         */


        double precioUnitario = 123.5, costoTotal, costoConDescuento;
        int cantidad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda FA FA FA");

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Bienvenido " + nombre + "!!");

        System.out.println("Por favor ingrese la cantidad de MANZANAS en kilos: ");
        cantidad = entrada.nextInt();

        if (cantidad >= 100) {
            System.out.println("Por su compra por mas de 100 kg va a obtener un 10% de descuento");
            System.out.println("El precio unitario del kilo de manzana es " + precioUnitario);

            costoConDescuento = (cantidad * precioUnitario) * 0.9;

            System.out.println("El costo total con el 10% de DESCUENTO es: $ " + costoConDescuento);

        }else{
            costoTotal = cantidad * precioUnitario;
            System.out.println("El costo total es: $ " + costoTotal);
        }
    }
}
