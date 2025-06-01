public class SumarNumerosArray {
    public static void main(String[] args) {

        // Calcula el resultado de la suma de los numeros del 1 al 10 en un array.

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int i = 1; i < numeros.length; i++) {
            int numero = i;
            suma += numero;
        }

        System.out.println("La suma del array es: " + suma);

    }
}
