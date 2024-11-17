package co.edu.uniquindio.poo;

public class Empleado extends Usuario implements IGestionEmpleado {
    
    private int idEmpleado;
    private boolean estado;
    private Sede sede;
    
    public Empleado(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol,
            int idEmpleado, boolean estado, Sede sede) {
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.idEmpleado = idEmpleado;
        this.estado = estado;
        this.sede = sede;
    }


    public Sede getSede() {
        return sede;
    }


    public void setSede(Sede sede) {
        this.sede = sede;
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


    @Override
    public String toString() {
        return "Empleado "+ super.toString()+ ", idEmpleado=" + idEmpleado + ", estado=" + estado;
    }

    @Override
    public boolean agregarClienteSede(Cliente cliente) {
        return sede.agregarCliente(cliente);
    }

    @Override
    public boolean eliminarClienteSede(String cedula) {
        return sede.eliminarCliente(cedula);
    }

    @Override
    public boolean actualizarClienteSede(String cedula, Cliente nuevoCliente) {
        return sede.actualizarCliente(cedula, nuevoCliente);
    }

    @Override
    public boolean verificarClienteSede(String cedula) {
        return sede.verificarCliente(cedula);
    }

    @Override
    public boolean agregarVehiculoSede(Vehiculo vehiculo) {
        return sede.agregarVehiculo(vehiculo);
    }    
}
