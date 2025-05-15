import com.techlab.clientes.Cliente;
import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.pedidos.Pedido;
import com.techlab.productos.Bebida;
import com.techlab.productos.Comida;
import com.techlab.productos.Producto;
import com.techlab.productos.ProductoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente nuevoCliente = new Cliente("Juan");

        List<Producto> productos = new ArrayList<>();

        Bebida primerBebida = new Bebida("Coca cola");
        Comida segundaComida = new Comida("Asado");
        Bebida tercerBebida = new Bebida("Fernet");
        Comida cuartaComida = new Comida("Picada");

        productos.add(primerBebida);
        productos.add(segundaComida);
        productos.add(tercerBebida);
        productos.add(cuartaComida);

        Pedido nuevoPedido = new Pedido(nuevoCliente, productos);

        System.out.println("Pedido de " + nuevoCliente.getNombre());
        System.out.println("Productos en el pedido");

        for(Producto item : productos){
            System.out.println("- " + item.getNombre());
        }

        ProductoService prodService = new ProductoService(productos);

        try{
            Producto productoEncontrado = prodService.buscarProductoNombre("Pizza");
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
        } catch (ProductoNoEncontradoException e){
            System.out.println("ERROR " + e.getMessage());
        }

        try{
            Producto productoEncontrado = prodService.buscarProductoNombre("Fernet");
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
        } catch (ProductoNoEncontradoException e){
            System.out.println("ERROR " + e.getMessage());
        }

    }
}
