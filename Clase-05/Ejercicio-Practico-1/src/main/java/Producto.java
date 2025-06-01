public class Producto {

    String nombre;
    double precio;
    int cantidadEnStock;


    public void mostrarInformacion(String nombre, double precio, int stock){
        System.out.println("Nombre: " + nombre + " | Precio: $ " + precio + " | Cantidad de Stock: " + stock);
    }
}
