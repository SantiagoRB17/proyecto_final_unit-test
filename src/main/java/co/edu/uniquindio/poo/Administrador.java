package co.edu.uniquindio.poo;

/**
 * Representa a un administrador en el sistema, que tiene capacidades para gestionar empleados,
 * clientes y vehículos dentro de una sede específica.
 * Esta clase extiende de la clase `Usuario` e implementa las interfaces `IGestionEmpleado` y `IGestionAdministrador`.
 */
public class Administrador extends Usuario implements IGestionEmpleado, IGestionAdministrador {

    /**
     * Atributo que almacena la palabra de seguridad del administrador.
     */
    private String palabraSeguridad;

    /**
     * Atributo que almacena la sede a la que el administrador está asignado.
     */
    private Sede sede;

    /**
     * Atributo que almacena el correo electrónico del administrador.
     */
    private String correo;

    /**
     * Constructor que inicializa los atributos del administrador.
     * 
     * @param nombre El nombre del administrador.
     * @param cedula La cédula del administrador.
     * @param telefono El número de teléfono del administrador.
     * @param usuario El nombre de usuario del administrador.
     * @param clave La clave de acceso del administrador.
     * @param rol El rol del administrador en el sistema.
     * @param palabraSeguridad La palabra de seguridad del administrador.
     * @param correo El correo electrónico del administrador.
     */
    public Administrador(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol,
            String palabraSeguridad, String correo) {
        super(nombre, cedula, telefono, usuario, clave, rol);
        this.palabraSeguridad = palabraSeguridad;
        this.sede = null;
        this.correo = correo;
    }

    /**
     * Obtiene la palabra de seguridad del administrador.
     * 
     * @return La palabra de seguridad.
     */
    public String getPreguntaSeguridad() {
        return palabraSeguridad;
    }

    /**
     * Establece la palabra de seguridad del administrador.
     * 
     * @param palabraSeguridad La nueva palabra de seguridad.
     */
    public void setPreguntaSeguridad(String palabraSeguridad) {
        this.palabraSeguridad = palabraSeguridad;
    }

    /**
     * Obtiene la palabra de seguridad del administrador.
     * 
     * @return La palabra de seguridad.
     */
    public String getPalabraSeguridad() {
        return palabraSeguridad;
    }

    /**
     * Establece la palabra de seguridad del administrador.
     * 
     * @param palabraSeguridad La nueva palabra de seguridad.
     */
    public void setPalabraSeguridad(String palabraSeguridad) {
        this.palabraSeguridad = palabraSeguridad;
    }

    /**
     * Obtiene el correo electrónico del administrador.
     * 
     * @return El correo electrónico del administrador.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del administrador.
     * 
     * @param correo El nuevo correo electrónico del administrador.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Agrega un empleado a la sede del administrador.
     * 
     * @param empleado El empleado a agregar.
     * @return true si el empleado fue agregado correctamente.
     */
    @Override
    public boolean agregarEmpleadoSede(Empleado empleado) {
        return sede.agregarEmpleado(empleado);
    }

    /**
     * Elimina un empleado de la sede del administrador.
     * 
     * @param cedulaEmpleado La cédula del empleado a eliminar.
     * @return true si el empleado fue eliminado correctamente.
     */
    @Override
    public boolean eliminarEmpleadoSede(String cedulaEmpleado) {
        return sede.eliminarEmpleado(cedulaEmpleado);
    }

    /**
     * Actualiza la información de un empleado en la sede del administrador.
     * 
     * @param cedula La cédula del empleado a actualizar.
     * @param nuevoEmpleado El nuevo empleado con los datos actualizados.
     * @return true si el empleado fue actualizado correctamente.
     */
    @Override
    public boolean actualizarEmpleadoSede(String cedula, Empleado nuevoEmpleado) {
        return sede.actualizarEmpleado(cedula, nuevoEmpleado);
    }

    /**
     * Verifica si un empleado existe en la sede del administrador.
     * 
     * @param cedula La cédula del empleado a verificar.
     * @return true si el empleado existe, false si no.
     */
    @Override
    public boolean verificarEmpleadoSede(String cedula) {
        return sede.verificarEmpleado(cedula);
    }

    /**
     * Agrega un cliente a la sede del administrador.
     * 
     * @param cliente El cliente a agregar.
     * @return true si el cliente fue agregado correctamente.
     */
    @Override
    public boolean agregarClienteSede(Cliente cliente) {
        return sede.agregarCliente(cliente);
    }

    /**
     * Elimina un cliente de la sede del administrador.
     * 
     * @param cedula La cédula del cliente a eliminar.
     * @return true si el cliente fue eliminado correctamente.
     */
    @Override
    public boolean eliminarClienteSede(String cedula) {
        return sede.eliminarCliente(cedula);
    }

    /**
     * Actualiza la información de un cliente en la sede del administrador.
     * 
     * @param cedula La cédula del cliente a actualizar.
     * @param nuevoCliente El nuevo cliente con los datos actualizados.
     * @return true si el cliente fue actualizado correctamente.
     */
    @Override
    public boolean actualizarClienteSede(String cedula, Cliente nuevoCliente) {
        return sede.actualizarCliente(cedula, nuevoCliente);
    }

    /**
     * Verifica si un cliente existe en la sede del administrador.
     * 
     * @param cedula La cédula del cliente a verificar.
     * @return true si el cliente existe, false si no.
     */
    @Override
    public boolean verificarClienteSede(String cedula) {
        return sede.verificarCliente(cedula);
    }

    /**
     * Agrega un vehículo a la sede del administrador.
     * 
     * @param vehiculo El vehículo a agregar.
     * @return true si el vehículo fue agregado correctamente.
     */
    @Override
    public boolean agregarVehiculoSede(Vehiculo vehiculo) {
        return sede.agregarVehiculo(vehiculo);
    }

    /**
     * Obtiene la sede asignada al administrador.
     * 
     * @return La sede del administrador.
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Establece la sede asignada al administrador.
     * 
     * @param sede La nueva sede asignada.
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    /**
     * Verifica si la respuesta a la palabra de seguridad es correcta.
     * 
     * @param respuestapalabra La respuesta proporcionada por el administrador.
     * @return true si la respuesta es correcta.
     * @throws IllegalArgumentException si la respuesta es incorrecta o nula.
     */
    public boolean verificarRespuestaPalabraSeguridad(String respuestapalabra) {
        if (respuestapalabra == null || palabraSeguridad == null) {
            throw new IllegalArgumentException("La palabra de seguridad no puede ser nula");
        }
        if(respuestapalabra.equals(palabraSeguridad)){
            return true;
        }else{
            throw new IllegalArgumentException("Palabra de seguridad incorrecta");
        }
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Administrador.
     * 
     * @return Una cadena que contiene los detalles del administrador.
     */
    @Override
    public String toString() {
        return "Administrador:" + super.toString() + " palabraSeguridad= " + palabraSeguridad + ", correo=" + correo;
    }
}
