public class Te extends Producto implements Descontable {

    private String origen;

    public Te(String nombre, double precio, String origen) {
        super(nombre, precio);
        this.origen = origen;
    }

    // sobre escritura de met odo
    @Override
    public double calcularPrecioFinal() {
        return getPrecio() - aplicarDescuento(0.05);
    }

    // sobre escritura interface
    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() * porcentaje;
    }
}
