public class Comida extends Producto implements Descontable {

    private String fechaVencimiento;

    public Comida(int cantidadEnStock, double precio, String nombre, String fechaVencimiento) {
        super(cantidadEnStock, precio, nombre);
        this.fechaVencimiento = fechaVencimiento;
    }

    // sobre escritura de clase padre
    @Override
    public double calcularPrecioFinal() {
        return getPrecio() - aplicarDescuento();
    }

    // sobre escritura de la interface
    @Override
    public double aplicarDescuento() {
        return getPrecio() * 0.1;
    }
}
