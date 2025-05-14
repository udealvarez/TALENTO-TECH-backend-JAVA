import java.util.IllegalFormatCodePointException;

// CLASE PADRE -> CLASE ABSTRACTA (de esta manera obligas a los hijos implementar sus metodos)
public abstract class Producto {

    // ahora los atributos son privados
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // CONSTRUCTOR
    public Producto(int cantidadEnStock, double precio, String nombre) {
        this.cantidadEnStock = cantidadEnStock;
        this.precio = precio;
        this.nombre = nombre;
    }

    // METODO DE POLIMORFISMO
    public abstract double calcularPrecioFinal();


    // GET -> LECTURA
    // SET -> ESCRITURA | validar campos

    public String getNombre() {     // getter retorna el valor de un atributo -> LECTURA
        return nombre;
    }

    public void setNombre(String nombre) {      // mientras que un setter lo modifica -> ESCRITURA

        // verificamos que el nombre no este vacio
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio > 0){
            this.precio = precio;
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {

        if (cantidadEnStock > 0){
            this.cantidadEnStock = cantidadEnStock;
        }
    }
}
