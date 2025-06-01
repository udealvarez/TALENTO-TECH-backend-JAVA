import java.util.ArrayList;

public class Cinco_Dinamico {
    public static void main(String[] args) {

        ArrayList<String> listaProducto = new ArrayList<>();
        listaProducto.add("pan");
        listaProducto.add("leche");
        listaProducto.add("sal");
        listaProducto.add("manteca");
        listaProducto.add("hamburguesa");

        // agregando un nuevo producto
        listaProducto.add("galletas");

        // eliminar SAL
        listaProducto.remove("sal");

        // MOSTRAR LISTA ACTUALIZADA
        for(String producto : listaProducto){
            System.out.println(producto);
        }

        // verificar si existe TE ORGANICO
        if (listaProducto.contains("te organico")){ // BUSCAR UN OBJETO
            System.out.println("EXISTE");
        }else{
            System.out.println("NO EXISTE");
        }

    }
}
