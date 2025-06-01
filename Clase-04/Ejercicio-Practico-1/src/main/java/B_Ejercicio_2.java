import java.util.Scanner;

public class B_Ejercicio_2 {
    public static void main(String[] args) {

        /*

        Parámetros y argumentos:

            Creá un méto do calcularPrecioFinal que reciba el precio, el descuento y la cantidad. Si la cantidad es mayor a 50, aumentá el descuento.
            Imprimí el resultado.

            Definí un array con el stock de 3 productos.

            Escribí un méto do reponerStock que sume unidades a un índice específico del array.

            Mostrá el stock antes y después de la reposición.
         */

        Scanner input = new Scanner(System.in);

        double precio, descuento, precioFinal;
        int cantidad;

        int[] productos = {100, 70,110};

        System.out.println("Ingrese el precio: ");
        precio = input.nextDouble();

        System.out.println("Ingrese la cantidad: ");
        cantidad = input.nextInt();

        if (cantidad > 50){

            double descuentoBonus;

            System.out.println("Ingrese el descuento adiconal por compra mayorista: ");
            descuentoBonus = input.nextDouble();

            precioFinal = calcularPrecioFinal(precio, descuentoBonus, cantidad);

            System.out.println("El precio final es: " + precioFinal);
        }else{

            System.out.println("Ingrese el descuento: ");
            descuento = input.nextDouble();

            precioFinal = calcularPrecioFinal(precio, descuento);

            System.out.println("El precio sin descuento es " + precioFinal);
        }

    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad){

        return precio - ((descuento/100) * cantidad);
    }

    public static double calcularPrecioFinal(double precio, double descuento){

        return precio - (descuento/100);
    }
}
