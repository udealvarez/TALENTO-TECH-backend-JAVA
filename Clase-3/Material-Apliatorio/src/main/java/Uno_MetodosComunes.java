public class Uno_MetodosComunes {
    public static void main(String[] args) {

        String producto = " Cafe Premiun MOLIDO";

        // ELIMINAR ESPACIOS EXTRAS DEL STRING
        producto = producto.trim();
        System.out.println("El mensaje sin espacios es: -" + producto);

        // PASAR A MINUSCULA
        producto = producto.toLowerCase();
        System.out.println("El mensaje en minuscula es: " + producto);

    }
}
