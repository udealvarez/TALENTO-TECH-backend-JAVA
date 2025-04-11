import java.util.Scanner;

public class ContadorHastaNumeroFor {

    public static void main(String[] args) {

        /*
            Bucles:
                Pedile al usuario que ingrese un número, y luego usá un bucle for para imprimir desde 1 hasta ese número.
                Repetí lo mismo con un while y compará cuál te resulta más intuitivo.
         */

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

    }
}
