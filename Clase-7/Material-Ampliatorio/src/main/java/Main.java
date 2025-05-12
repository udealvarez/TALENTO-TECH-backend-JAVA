public class Main {
    public static void main(String[] args) {

        Bebida bebida = new Bebida(10, 100.0, "Jugo de naranja", 1.5);
        Comida comida = new Comida(5, 200.0, "Milanesa", "2025-12-01");

        System.out.println("Producto: " + bebida.getNombre());
        System.out.println("Precio original: $" + bebida.getPrecio());
        System.out.println("Descuento: $" + bebida.aplicarDescuento());
        System.out.println("Precio final: $" + bebida.calcularPrecioFinal());

        System.out.println();

        System.out.println("Producto: " + comida.getNombre());
        System.out.println("Precio original: $" + comida.getPrecio());
        System.out.println("Descuento: $" + comida.aplicarDescuento());
        System.out.println("Precio final: $" + comida.calcularPrecioFinal());

    }
}
