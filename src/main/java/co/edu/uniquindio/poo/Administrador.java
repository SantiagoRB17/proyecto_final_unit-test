package co.edu.uniquindio.poo;

public class Administrador extends Usuario implements IGestionEmpleado, IGestionAdministrador {
/**
 * Atributos de la clase administrador
 */
    private String palabraSeguridad;
    private Sede sede;
    private String correo;
    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol,
            String palabraSeguridad, String correo) {
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.palabraSeguridad = palabraSeguridad;
        this.sede = null;
        this.correo=correo;
    }

    public String getPreguntaSeguridad() {
        return palabraSeguridad;
    }

    public void setPreguntaSeguridad(String palabraSeguridad) {
        this.palabraSeguridad = palabraSeguridad;
    }

    @Override
    public boolean agregarEmpleadoSede(Empleado empleado) {
        return sede.agregarEmpleado(empleado);
    }
    
    public String getPalabraSeguridad() {
        return palabraSeguridad;
    }

    public void setPalabraSeguridad(String palabraSeguridad) {
        this.palabraSeguridad = palabraSeguridad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public boolean verificarRespuestaPalabraSeguridad(String respuestapalabra) {
        if (respuestapalabra == null || palabraSeguridad == null) {
            throw new IllegalArgumentException("La palabra de seguridad no puede ser nula");
        }
        if(respuestapalabra.equals(palabraSeguridad)){
            return true;
        }else{
            throw new IllegalArgumentException("Palabra incorrecta");
        }
    }


    @Override
    public String toString() {
        return "Administrador:" + super.toString() + " palabraSeguridad= " + palabraSeguridad+ ", correo=" + correo;
    }
}
