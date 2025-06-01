public class Cinco_ProblemaTres {
    public static void main(String[] args) {

        int [] inventario = {100, 20, 50, 30, 60};

        actualizarStock(inventario, 4, 35);

        System.out.println(inventario[4]);
    }

    public static void actualizarStock(int[] inventario, int indiceProducto, int unidadesVendidas){

        inventario[indiceProducto] -= unidadesVendidas;
    }
}
