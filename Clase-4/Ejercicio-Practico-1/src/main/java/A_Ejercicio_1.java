import java.util.Scanner;

public class A_Ejercicio_1 {
    public static void main(String[] args) {

        /*
             Creación de funciones

             Escribí un méto do calcularImpuesto que reciba un precio y un porcentaje de impuesto y devuelva el precio final.

             Llamá al méto do desde main con distintos valores.

         */

        double precioInicial, porcentajeInicial, precioFinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        precioInicial = input.nextDouble();

        System.out.println("Ingrese el porcentaje: ");
        porcentajeInicial = input.nextDouble();

        precioFinal = calcularImpuesto(precioInicial, porcentajeInicial);

        System.out.println("El precio final con impuesto incluido es : $ " + precioFinal);
    }


    public static double calcularImpuesto(double precio, double porcentaje){

        return precio + (precio * (porcentaje / 100));
    }
}
