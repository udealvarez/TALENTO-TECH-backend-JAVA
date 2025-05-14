public class Cafe extends Producto implements Descontable {

    private String tipoDeGrano;

    public Cafe(String nombre, double precio, String tipoDeGrano) {
        super(nombre, precio);
        this.tipoDeGrano = tipoDeGrano;
    }

    // sobre escritura de met odo
    @Override
    public double calcularPrecioFinal() {
        return getPrecio() - aplicarDescuento(0.1);
    }

    // sobre escritura interface
    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() * porcentaje;
    }

    @Override
    public void setNombre(String nombre) {
        System.out.println("cafe super especial, cambiando nombreeee");
        super.setNombre(nombre);
    }
}
