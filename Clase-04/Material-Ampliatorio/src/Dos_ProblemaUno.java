import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Dos_ProblemaUno {
    public static void main(String[] args) {

        double precioIngresado, porcentajeIngresado, precioFinal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        precioIngresado = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentajeIngresado = entrada.nextDouble();

        precioFinal = aplicarDescuento(precioIngresado, porcentajeIngresado);

        System.out.println("El resultado final es: " + precioFinal);
    }

    public static double aplicarDescuento(double precio, double porcentaje){

        return precio - (precio * (porcentaje/100));
    }
}
