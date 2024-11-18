package co.edu.uniquindio.poo;

public class Administrador extends Usuario implements IGestionEmpleado, IGestionAdministrador{
/**
 * Atributos de la clase administrador
 */
    private String preguntaSeguridad;
    private Sede sede;

    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol, String preguntaSeguridad){
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.preguntaSeguridad = preguntaSeguridad;
        this.sede = null;
   
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    @Override
    public String toString() {
        return "Administrador:" + super.toString() + " preguntaSeguridad= " + preguntaSeguridad  ;
    }

    @Override
    public boolean agregarEmpleadoSede(Empleado empleado) {
        return sede.agregarEmpleado(empleado);
    }

    @Override
    public boolean eliminarEmpleadoSede(String cedulaEmpleado) {
        return sede.eliminarEmpleado(cedulaEmpleado);
    }

    @Override
    public boolean actualizarEmpleadoSede(String cedula, Empleado nuevoEmpleado) {
        return sede.actualizarEmpleado(cedula, nuevoEmpleado);
    }

    @Override
    public boolean verificarEmpleadoSede(String cedula) {
        return sede.verificarEmpleado(cedula);
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


    public Sede getSede() {
        return sede;
    }


    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
