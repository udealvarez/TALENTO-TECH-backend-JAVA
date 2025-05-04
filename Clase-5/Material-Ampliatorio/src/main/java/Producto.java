public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;


    public void descontarStock(int cantidad){       // método de instancia - es propio de cada producto
        this.cantidadEnStock -= cantidad;
    }

    public static double calcularImpuesto(double precio){   // método estático - comun a todos
        return precio * 0.21;  // 21% de impuestos en ARG
    }

}
