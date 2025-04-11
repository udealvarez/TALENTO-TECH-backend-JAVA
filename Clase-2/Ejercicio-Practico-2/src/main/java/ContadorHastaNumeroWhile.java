import java.util.Scanner;

public class ContadorHastaNumeroWhile {
    public static void main(String[] args) {

        /*
            Bucles:
                Pedile al usuario que ingrese un número, y luego usá un bucle for para imprimir desde 1 hasta ese número.
                Repetí lo mismo con un while y compará cuál te resulta más intuitivo.
         */

        int numero, i=1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero - WHILE: ");
        numero = entrada.nextInt();

        while (i <= numero){    // MIENTRAS I SEA MENOR QUE EL NUMERO QUE SE INGRESA, SE REPITE EL CICLO
            System.out.println(i);
            i++;
        }
    }
}
