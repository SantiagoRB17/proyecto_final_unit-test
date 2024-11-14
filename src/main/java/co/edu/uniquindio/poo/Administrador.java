package co.edu.uniquindio.poo;

public class Administrador extends Persona {
    private String usuario;
    private String clave;
    private String preguntaSeguridad;

    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, String preguntaSeguridad){
        super(nombre, cedula, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

}
