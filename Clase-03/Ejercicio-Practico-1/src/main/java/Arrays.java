public class Arrays {
    public static void main(String[] args) {

        // Creá un array de 5 productos.
        // Imprimí sus elementos y luego intentá agregar un sexto producto (analizá el resultado).

        String[] productos = {"anana", "manzana", "pera", "banana", "naranja"};

        // no se puede agregar un sexto elemento
            //  productos[5] = "cada";

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i]);
        }
    }
}
