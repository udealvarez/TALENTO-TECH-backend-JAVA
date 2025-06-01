import java.util.Scanner;

public class A_Ejercicio_1 {
    public static void main(String[] args) {

        /*
             Sobrecarga de métodos:

                Creá dos métodos mostrarMensaje: uno recibe una String, otro recibe una String y un int.

                Usá ambos para imprimir mensajes en función de si el cliente es nuevo o recurrente.
         */

        Scanner input = new Scanner(System.in);

        String nombre = "eduardo";
        int cantidad = 23;

        System.out.println("Ingrese su nombre: ");
        nombre = input.next();

        if (nombre.equals("eduardo")){

            mostrarMensaje(nombre, cantidad);

        }else{
            mostrarMensaje(nombre);
        }
    }

    public static void mostrarMensaje(String nombre){

        System.out.println("Bienvenido " + nombre + " !");
    }

    public static void mostrarMensaje(String nombre, int numero){

        System.out.println("Bienvenido nuevamente " + nombre + "! Esta es tu vez numero: " + numero);
    }
}
