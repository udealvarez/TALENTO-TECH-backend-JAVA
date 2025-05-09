import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos;
    private Cliente cliente;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void sumarProductos(Producto prod){
        this.productos.add(prod);
    }

    public double calcularTotal(){
        double total = 0;

        for (Producto item : this.productos){

            total += item.getPrecio();
        }

        return total;
    }
}
