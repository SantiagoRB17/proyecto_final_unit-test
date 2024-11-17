package co.edu.uniquindio.poo;

import java.util.LinkedList;

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

    public Sede(String nombre, String direccion, String ciudad, String codigoSeguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.administrador = null;
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.transacciones = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
        this.codigoSeguridad=codigoSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public String toString() {
        return "Sede: nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", codigoSeguridad="
                + codigoSeguridad + ", administrador=" + administrador + ", empleados=" + empleados + ", clientes="
                + clientes + ", transacciones=" + transacciones + ", vehiculos=" + vehiculos;
    }
}
