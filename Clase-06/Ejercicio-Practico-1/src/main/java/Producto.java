public class Producto {

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }
    }
}
