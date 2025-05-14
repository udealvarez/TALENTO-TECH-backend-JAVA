public class Bebida extends Producto implements Descontable{

    private double volumenEnLitros;

    public Bebida(int cantidadEnStock, double precio, String nombre, double volumenEnLitros) {
        super(cantidadEnStock, precio, nombre);
        this.volumenEnLitros = volumenEnLitros;
    }

    // sobre escritura de clase padre
    @Override
    public double calcularPrecioFinal(){

        return getPrecio() - aplicarDescuento();
    }

    // sobre escritura de la interface
    @Override
    public double aplicarDescuento() {
        return  getPrecio() * 0.05;
    }
}
