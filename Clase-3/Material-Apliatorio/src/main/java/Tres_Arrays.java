public class Tres_Arrays {
    public static void main(String[] args) {

        String[] productos = new String[3];
        productos[0] = "Cafe Premiun";
        productos[1] = "Te verde";
        productos[2] = "Mate cocido";

        // MUESTRO LOS PRODUCTOS DEL ARRAY
        for (int i = 0; i < productos.length ; i++) {
            System.out.println(productos[i]);
        }
    }
}
