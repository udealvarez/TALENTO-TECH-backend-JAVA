import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> productos;
    private Cliente cliente;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public double calcularTota(){
        double total = 0;

        for (Producto item : productos){
            total += item.getPrecio() * item.getCantidadEnStock();
        }

        return total;
    }
}
