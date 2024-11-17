package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Transaccion {
    protected int codigo;
    protected LocalDate fechaEntregaVehiculo;
    protected Empleado empleado;
    protected Vehiculo vehiculo;

    /**
     * Constructor que obtiene crear transacciones
     * 
     * @param codigo   codigo de la transaccion
     * @param fecha    fecha de la transacción para el caso de alquiler esta sera su
     *                 fecha inicial.
     * @param empleado empleado que realizo la transaccion
     */
    public Transaccion(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fechaEntregaVehiculo = fechaEntregaVehiculo;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo get que obtiene el codigo de la transacción
     * 
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece el codigo de la transaccion
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo get que obtiene la fecha de la transacción
     * 
     * @return
     */
    public LocalDate getFechaEntregaVehiculo() {
        return fechaEntregaVehiculo;
    }

    /**
     * Metodo que establece la fecha de la transaccion
     * 
     * @param fecha
     */
    public void setFechaEntregaVehiculo(LocalDate fechaEntregaVehiculo) {
        this.fechaEntregaVehiculo = fechaEntregaVehiculo;
    }

    /**
     * Metodo que obtiene el empleado asociado
     * 
     * @return
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Metodo que establece el empleado asociado a la transaccion
     * 
     * @return
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo que obtiene el vehiculo de la transaccion
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Metodo que establece el vehiculo de la transaccion
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * Declaración del método para calcular el total de cada tipo de transacción
     * 
     * @return
     */
    public abstract double calcularTotal() throws PrecioVehiculoVacioException;

    /**
     * Metodo to string para mostrar la informacion de la transaccion
     */
    @Override
    public String toString() {
        return "codigo=" + codigo + ", fechaEntregaVehiculo=" + fechaEntregaVehiculo + ", empleado=" + empleado;
    }
}
