public class SumarNumerosImpares {
    public static void main(String[] args) {

        //Calcula la suma de todos los números impares mayores que 10 y menores que 30

        int sumarImpares = 0;

        for (int i = 10; i < 30; i++) {

            if (i % 2 != 0){
                sumarImpares += i;
            }
        }

        System.out.println("La suma de los numeros impares entre el 10 y 30 es: " + sumarImpares);
    }
}
