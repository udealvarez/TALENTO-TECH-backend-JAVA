import java.util.Scanner;

public class Cuatro_ProblemaDos {
    public static void main(String[] args) {

        String producto;
        double precioIngresado, porcentajeIngresado, precioFinal;
        int cantidad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el producto: ");
        producto = entrada.nextLine();

        System.out.println("Ingrese la cantidad: ");
        cantidad = entrada.nextInt();

        System.out.println("Ingrese el precio: ");
        precioIngresado = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentajeIngresado = entrada.nextDouble();

        precioFinal = aplicarDescuentoConCantidad(precioIngresado, porcentajeIngresado, cantidad);

        System.out.println("El resultado final es: " + precioFinal);

        imprimirRecibo(producto, cantidad, precioIngresado, precioFinal);
    }

    public  static double aplicarDescuento(double precio, double porcentaje){

        double precioFinal;
        return precioFinal =  precio - (precio * (porcentaje / 100));
    }

    public static void imprimirRecibo(String producto, int cantidad, double precioOriginal, double precioFinal){

        System.out.println("Recibo de compras!");
        System.out.println("Producto: " + producto);
        System.out.println("Precio Original: $ " + precioOriginal);
        System.out.println("Precio final con descuento: $ " + precioFinal);
    }

    public static double aplicarDescuentoConCantidad(double precio, double porcentajeBase, int cantidad){

        if (cantidad > 50){

            porcentajeBase += 5; // Aumentamos el descuento si compra más de 50 unidades
        }

        return aplicarDescuento(precio, porcentajeBase);
    }
}
