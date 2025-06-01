public class Cliente {
    String nombre;
    String email;

    // constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // metodos
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Email: " + email;
    }
}
