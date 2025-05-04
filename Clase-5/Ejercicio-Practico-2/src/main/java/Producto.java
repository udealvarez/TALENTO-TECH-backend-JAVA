public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;

    // constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // metodo para calcular el 10% de descuento
    public double calcularDescuento(){
        return this.precio * 0.9;
    }

    // metodo toString con DESCUENTO
    public String toStringConDescuento(){
        return  "Nombre: " + nombre + " | Precio original: $" + precio +  " | Precio con descuento: $" + calcularDescuento() + " | Stock: " + cantidadEnStock;
    }

    // metodo toString normal
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + cantidadEnStock;
    }
}
