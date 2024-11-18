package co.edu.uniquindio.poo;


public class Cliente extends Persona {
    /**
 * Atributos de la clase Cliente
 */
    private String direccion;
    private String correo;


    public Cliente(String nombre, String cedula, long telefono, String direccion, String correo) {
        super(nombre, cedula, telefono);
        this.direccion = direccion;
        this.correo = correo;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }    
}

