public class Tres_DeclaracionLlamada {
    public static void main(String[] args) {

        String producto = "PC";
        double precioOriginal = 10000;

        double precioConDescuento = aplicarDescuento(precioOriginal, 25);
       // System.out.println("El precio con descuento es: " + precioConDescuento);   -> esto es otra manera

        imprimirRecibo(producto, precioOriginal, precioConDescuento);
    }

    public  static double aplicarDescuento(double precio, double porcentaje){

        double precioFinal;
        return precioFinal =  precio - (precio * (porcentaje / 100));
    }

    public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal){

        System.out.println("Recibo de compras!");
        System.out.println("Producto: " + producto);
        System.out.println("Precio Original: $ " + precioOriginal);
        System.out.println("Precio final con descuento: $ " + precioFinal);
    }
}
