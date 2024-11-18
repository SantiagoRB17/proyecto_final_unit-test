package co.edu.uniquindio.poo;

public class Persona {
    /**
 * Atributos de la clase Persona
 */
    private String nombre;
    private String cedula;
    private long telefono;

    public Persona(String nombre, String cedula, long telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona: nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono;
    }
}
