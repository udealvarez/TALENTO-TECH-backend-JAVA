import java.util.Scanner;

public class B_Ejercicio_2 {
    public static void main(String[] args) {

        /*
            Definí un array con el stock de 3 productos.

            Escribí un mét odo reponerStock que sume unidades a un índice específico del array.

            Mostrá el stock antes y después de la reposición.
         */

        Scanner input = new Scanner(System.in);

        int indice, nuevoStock;

        int[] productos = {100, 50, 110, 44, 55};

        System.out.println("Ingrese el indice del stock (el array de productos tiene 5 elementos");
        indice = input.nextInt();

        System.out.println("Ingrese la cantidad del nuevo stock: ");
        nuevoStock = input.nextInt();

        System.out.println("Lista de stock antes");
        mostrarStockAntes(productos);

        reponerStock(productos, indice, nuevoStock);

        System.out.println("Lista de stock despues");
        mostrarStockDespues(productos);

    }

    public static void reponerStock(int[] item, int indiceEspecifico, int sumarUnidad){

        item[indiceEspecifico] += sumarUnidad;
    }

    public static void mostrarStockAntes(int[] productos){

        for (Integer producto : productos){
            System.out.println(producto);
        }
    }

    public static void mostrarStockDespues(int[] productos){

        for (Integer producto : productos){
            System.out.println(producto);
        }
    }
}
