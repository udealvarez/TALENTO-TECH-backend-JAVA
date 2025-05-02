import java.util.Scanner;

public class Seis_SobrecargaMetodos {
    public static void main(String[] args) {

        double precioFinal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio original: ");
        double precio = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = entrada.nextDouble();

        System.out.println("Sos cliente premiun? S/N");
        String cliente = entrada.next();

        if (cliente.equalsIgnoreCase("s")){
            System.out.println("Ingre el bonus adicional por ser premiun: ");
            double bonus = entrada.nextDouble();

            precioFinal = aplicarDescuento(precio, porcentajeDescuento, bonus);
        }else{
            precioFinal = aplicarDescuento(precio, porcentajeDescuento);
        }

        System.out.println("Precio final: $ " + precioFinal);
    }

    public static double aplicarDescuento(double precio, double porcentaje){

        return precio - (precio * (porcentaje/100));
    }

    public static double aplicarDescuento(double precio, double porcentaje, double bonus){

        double precioPremiun = aplicarDescuento(precio, porcentaje);
        return aplicarDescuento(precioPremiun, bonus);
    }
}
