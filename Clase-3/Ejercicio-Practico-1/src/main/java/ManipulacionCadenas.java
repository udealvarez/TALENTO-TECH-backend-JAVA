public class ManipulacionCadenas {
    public static void main(String[] args) {

        // Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
        // Mostrá su longitud, su primera letra y verificá si contiene la palabra "Chai".

        String cadena = " té CHAi ";
        String formateado = nuevoFormato(cadena);

        System.out.println("El nombre original es '" + cadena + "' y el nuevo formato es " + formateado);

        System.out.println("Segunda parte.....");

        System.out.println("Longitud: " + formateado.length());
        System.out.println("Primera letra: " + formateado.charAt(0));
        System.out.println("Tiene la palabra chai? : " + formateado.contains("Chai"));
    }

    public static String nuevoFormato(String nombre){

        nombre = nombre.trim().toLowerCase();   // elimino los espacios de inicio y fin, paso a minuscula

        String[] palabras = nombre.split(" ");
        StringBuilder sConstructor = new StringBuilder();

        for (int i = 0; i < palabras.length ; i++) {

            if (!palabras[i].isEmpty()){        // chequeo que no este vacio
                String primeraLetra = palabras[i].substring(0,1).toUpperCase();
                String resto = palabras[i].substring(1);

                sConstructor.append(primeraLetra).append(resto);

                if (i < palabras.length - 1){       // si no es la ultima palabra le agrego un espacio
                    sConstructor.append(" ");
                }
            }
        }

        return sConstructor.toString();
    }
}

