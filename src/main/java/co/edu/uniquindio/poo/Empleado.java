package co.edu.uniquindio.poo;


public class Empleado extends Usuario {
    
    private int idEmpleado;
    private boolean estado;


    public Empleado(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol,
            int idEmpleado, boolean estado) {
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.idEmpleado = idEmpleado;
        this.estado = estado;
    } 


    public int getIdEmpleado() {
        return idEmpleado;
    }


    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
