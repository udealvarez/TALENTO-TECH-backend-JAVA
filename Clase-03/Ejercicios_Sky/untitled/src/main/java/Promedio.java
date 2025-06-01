public class Promedio {
    public static void main(String[] args) {

        // //Calcula el promedio de todos los números en un array de números

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double suma = 0;
        double promedio = 0;

        for (int i = 1; i < numeros.length; i++) {

            suma += i;
            promedio = suma / numeros.length;
        }

        System.out.println("EL PROMEDIO DEL ARRAY ES: " + promedio);
    }
}
