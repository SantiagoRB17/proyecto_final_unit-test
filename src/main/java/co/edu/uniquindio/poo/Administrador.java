package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Administrador extends Persona {
    private String usuario;
    private String clave;
    private String preguntaSeguridad;
    private LinkedList<Empleado> empleados;

    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, String preguntaSeguridad){
        super(nombre, cedula, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.preguntaSeguridad = preguntaSeguridad;
        this.empleados=new LinkedList<>();
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

    @Override
    public String toString() {
        return "Administrador [usuario=" + usuario + ", clave=" + clave + ", preguntaSeguridad=" + preguntaSeguridad
                + ", empleados=" + empleados + "]";
    }
    
}
