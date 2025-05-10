public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        contadorProductos++;
    }

    public static int getContadorProductos() {      // SOLO CREO GET PORQUE NECESITO SABER UN DATO, NO MODIFICARLO
        return contadorProductos;
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
        if (cantidadEnStock >= 0){
            this.cantidadEnStock = cantidadEnStock;
        }else{
            System.out.println("No se aceptan valores negativos");
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
