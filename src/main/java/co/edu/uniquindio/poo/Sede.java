package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Atributos de la clase Sede
 */
public class Sede {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String codigoSeguridad;
    private Administrador administrador;
    private LinkedList<Empleado> empleados;
    private LinkedList<Cliente> clientes;
    private LinkedList<Transaccion> transacciones;
    private LinkedList<Vehiculo> vehiculos;

    /**
     * Metodo que permite crear sedes
     * 
     * @param nombre          nombre de la sede
     * @param direccion       direccion de la sede
     * @param ciudad          ciudad de la sede
     * @param codigoSeguridad codigo de seguridad de la sede
     */
    public Sede(String nombre, String direccion, String ciudad, String codigoSeguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.administrador = null;
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.transacciones = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
        this.codigoSeguridad = codigoSeguridad;
    }

    /**
     * Metodo que obtiene el nombre de la sede
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la sede
     * 
     * @param nombre nombre de la sede
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la direccion de la sede
     * 
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que establece la direccion de la sede
     * 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que obtiene la ciudad de la sede
     * 
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo que establece la ciudad de la sede
     * 
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Metodo que obtiene el administrador encargado de la sede
     * 
     * @return
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * Metodo que asigna el administrador de la sede
     * 
     * @param administrador
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo que obtiene la lista de empleados de la sede
     * 
     * @return
     */
    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Metodo que establece la lista de empleados de la sede
     * 
     * @param empleados
     */
    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Metodo que obtiene la lista de clientes
     * 
     * @return
     */
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Metodo que establece la lista de clientes
     * 
     * @param clientes
     */
    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo que obtiene la lista de transacciones
     * 
     * @return
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Metodo que establece la lista de transacciones
     * 
     * @param transacciones
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Metodo que obtiene la lista de vehiculo
     * 
     * @return
     */
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Metodo que establece la lista de vehiculos
     * 
     * @param vehiculos
     */
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo que obtiene el codigo de seguridad de la sede
     * 
     * @return
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * Metodo que establece el codigo de seguridad de la sede
     * 
     * @param codigoSeguridad
     */
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    /**
     * Metodo que verifica si una transaccion ya existe en la sede
     * 
     * @param codigo codigo de la transaccion a verificar
     * @return
     */
    public boolean verificarTransaccion(int codigo) {
        boolean centinela = false;
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getCodigo() == codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar una transaccion a la sede
     * 
     * @param transaccion transaccion a agregar
     */
    public void agregarTransaccion(Transaccion transaccion) {
        if (!verificarTransaccion(transaccion.getCodigo())) {
            transacciones.add(transaccion);
        } else {
            throw new IllegalArgumentException("La transaccion ya existe");
        }
    }

    /**
     * Método para buscar transacciones dentro de un rango de fechas
     * 
     * @param fechaInicioRango Fecha de inicio del rango
     * @param fechaFinRango    Fecha de fin del rango
     * @return Lista de transacciones que cumplen con el criterio
     */
    public List<Transaccion> buscarTransaccionesPorRango(LocalDate fechaInicioRango, LocalDate fechaFinRango) {
        if (fechaInicioRango.isAfter(fechaFinRango)) {
            throw new IllegalArgumentException("La fecha de incio no puede ser despues de la fecha de fin");
        }
        List<Transaccion> transaccionesEnRango = new ArrayList<>();
        for (Transaccion transaccion : transacciones) {
            if (transaccion instanceof Alquiler) {
                Alquiler alquiler = (Alquiler) transaccion;
                if (!alquiler.getFechaDevolucionVehiculo().isBefore(fechaInicioRango) &&
                        !alquiler.getFechaEntregaVehiculo().isAfter(fechaFinRango)) {
                    transaccionesEnRango.add(transaccion);
                }
            } else {
                if (!transaccion.getFechaEntregaVehiculo().isBefore(fechaInicioRango) &&
                        !transaccion.getFechaEntregaVehiculo().isAfter(fechaFinRango)) {
                    transaccionesEnRango.add(transaccion);
                }
            }
        }
        if (transaccionesEnRango.isEmpty()){
            throw new IllegalArgumentException("No existen transacciones en el rango especificado");
        }
        return transaccionesEnRango;
    }

    /**
     * Metodo to string para ver la informacion de la sede
     */
    @Override
    public String toString() {
        return "Sede: nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", codigoSeguridad="
                + codigoSeguridad + ", administrador=" + administrador + ", empleados=" + empleados + ", clientes="
                + clientes + ", transacciones=" + transacciones + ", vehiculos=" + vehiculos;
    }

    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);
            centinela = true;
        }else{
            throw new IllegalArgumentException("El cliente ya existe");
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }else{
                throw new IllegalArgumentException("La cedula del cliente no coincide con la cedula ingresada");
            }
        }
        return  centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente nuevoCliente) {
        boolean centinela = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                clientes.set(i, nuevoCliente);
                centinela = true;
            }else{
                throw new IllegalArgumentException("No se pudo actualizar al cliente");
            }
        }
        return centinela;
    }

    public boolean verificarEmpleado(String cedula) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        boolean centinela = false;
        if (!verificarEmpleado(empleado.getCedula())) {
            empleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String cedula) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                empleados.remove(empleado);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado nuevoEmpleado) {
        boolean centinela = false;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getCedula().equals(cedula)) {
                empleados.set(i, nuevoEmpleado);
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean centinela = false;
        if (vehiculo != null) {
            vehiculos.add(vehiculo);
            centinela = true; 
        }
        if (!centinela) {
            throw new IllegalArgumentException("Eror al agregar vehiculo.");
        }
        return centinela;
    }

    public boolean aprovarRevisionTecnica(int codigoIdentificador) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getCodigoIdentificador()==codigoIdentificador){
                vehiculo.setRevisionTecnica(true);
                centinela=true;
                break;
            }
        }
        if(!centinela){
            throw new IllegalArgumentException("El codigo es incorrecto o no existe el vehiculo");
        }
        return centinela;
    }

    public boolean verificarCodigoSede(String respuestaCodigoSeguridadSede){
        if(codigoSeguridad.equals(respuestaCodigoSeguridadSede)){
            return true;
        }else{
            throw new IllegalArgumentException("Codigo de sede incorrecto");
        }
    }
    public String recuperarContraseñaAdministrador(String respuestaPalabra, String respuestaCodigoSeguridadSede){
        if (administrador.verificarRespuestaPalabraSeguridad(respuestaPalabra) && verificarCodigoSede(respuestaCodigoSeguridadSede)) {
                String contraseña="Hola administrador tu contraseña es: " + administrador.getClave();
                return contraseña;
        }else{
            throw new IllegalArgumentException("Palabra de seguridad o Codigo de sede incorrectos");
        }
    }
}
