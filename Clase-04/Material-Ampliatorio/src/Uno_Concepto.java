import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Uno_Concepto {
    public static void main(String[] args) {

        int numeroUno, numeroDos, total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numeroUno = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        numeroDos = entrada.nextInt();

        total = sumar(numeroUno, numeroDos);

        System.out.println("El resultado final es: " + total);
    }

    public static int sumar(int a, int b){

        int resultado = a + b;
        return resultado;
    }

}
