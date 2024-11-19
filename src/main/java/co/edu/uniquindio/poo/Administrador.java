package co.edu.uniquindio.poo;

public class Administrador extends Usuario implements IGestionEmpleado, IGestionAdministrador {
/**
 * Atributos de la clase administrador
 */
    private String palabraSeguridad;
    private Sede sede;
    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol,
            String palabraSeguridad) {
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.palabraSeguridad = palabraSeguridad;
        this.sede = null;
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

    /**
     * Metodo para eliminar el empleado de la sede asociada
     */
    @Override
    public boolean eliminarEmpleadoSede(String cedulaEmpleado) {
        return sede.eliminarEmpleado(cedulaEmpleado);
    }
    /**
     * Metodo para actualizar los datos de un empleado asociado a la sede
     */
    @Override
    public boolean actualizarEmpleadoSede(String cedula, Empleado nuevoEmpleado) {
        return sede.actualizarEmpleado(cedula, nuevoEmpleado);
    }
    /**
     * Metodo para verificar que el empleado no este repetido en la sede
     */
    @Override
    public boolean verificarEmpleadoSede(String cedula) {
        return sede.verificarEmpleado(cedula);
    }
    /**
     * Metodo para agregar cliente a la sede asociada
     */
    @Override
    public boolean agregarClienteSede(Cliente cliente) {

        return sede.agregarCliente(cliente);
    }
    /**
     * Metodo para eliminar el cliente de la sede asociada
     */
    @Override
    public boolean eliminarClienteSede(String cedula) {
        return sede.eliminarCliente(cedula);
    }
    /**
     * Metodo para actualizar los atributos del cliente de la sede asociada
     */
    @Override
    public boolean actualizarClienteSede(String cedula, Cliente nuevoCliente) {
        return sede.actualizarCliente(cedula, nuevoCliente);
    }
    /**
     * Metodo para verificar que el cliente no este repetido en la sede
     */
    @Override
    public boolean verificarClienteSede(String cedula) {
        return sede.verificarCliente(cedula);
    }
    /**
     * Metodo para agregar vehiculo a la sede asociada
     */
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
    /**
     * Metodo para verificar que respuesta a la palabra de seguridad coincida con la palabra de seguridad
     */
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
        return "Administrador:" + super.toString() + " palabraSeguridad= " + palabraSeguridad;
    }
}
