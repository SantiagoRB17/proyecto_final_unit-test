package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Administrador extends Usuario implements IGestionEmpleado, IGestionAdministrador{

    private String preguntaSeguridad;
    private LinkedList<Empleado> empleados;

    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol, String preguntaSeguridad){
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.preguntaSeguridad = preguntaSeguridad;
        this.empleados=new LinkedList<>();
    }

    
    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }


    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }


    @Override
    public String toString() {
        return "Administrador:" + super.toString() + " preguntaSeguridad= " + preguntaSeguridad + ", empleados=" + empleados;
    }

    
}
