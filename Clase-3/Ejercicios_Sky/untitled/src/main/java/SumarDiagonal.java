public class SumarDiagonal {
    public static void main(String[] args) {

        /*  EJERCICIO
                    [
                    [1,2,3],
                    [2,4,5],
                    [9,5,7]
                    ]

                    Hay que sumar en diagonal de izquierda a derecha y de superior a inferior

                    PRINCIPAL  1-4-7
                    INVERTIDA  9-4-3
         */

        int[][] matriz = {
                {1, 2, 3},
                {2, 4, 5},
                {9, 5, 7}
        };

        // primera forma
        int sumaDiagonalHardcodeado = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println(sumaDiagonalHardcodeado);

        // segunda forma -> diagonal principal
        int diagonal = 0;
        for (int i = 0; i < matriz.length ; i++) {

            diagonal += matriz[i][i];
        }
        System.out.println(diagonal);

        // diagonal invertida
        int diagonalInversa = 0;
        for (int i = 0; i < matriz.length ; i++) {

            diagonalInversa += matriz[matriz.length - 1 - i][i];
        }
        System.out.println(diagonalInversa);
    }
}
