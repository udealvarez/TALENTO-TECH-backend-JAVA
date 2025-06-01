public class Dos_FormateoDeNombres {
    public static void main(String[] args) {

        /*
            FORMATEAR TEXTO
                - eliminar espacios de principio y fin
                - convertirlos a Tito Blanco (primera letra de cada palabra en Mayuscula)
         */

        String nombreOriginal = "EDUARDO ALVAREZ";
        String fomateado = formatearNombreProducto(nombreOriginal);

        System.out.println("El nombre formateado es: " + fomateado);
    }

    public static String formatearNombreProducto(String nombre){

        nombre = nombre.trim().toLowerCase();

        // DIVIDIMOS EN PALABRAS
        String[] palabras = nombre.split(" ");
        StringBuilder sBuilder = new StringBuilder();

        for (int i = 0; i <palabras.length; i++) {

            if (!palabras[i].isEmpty()){    // verifico que no este VACIO
                String primeraLetra = palabras[i].substring(0,1).toUpperCase();
                String resto = palabras[i].substring(1);

                sBuilder.append(primeraLetra).append(resto);

                if (i < palabras.length - 1){ // si no es la ultima palabra le agrego un espacio -> " "
                    sBuilder.append(" ");
                }
            }
        }

        return sBuilder.toString(); // devolvemos el nombre formateado
    }
}
