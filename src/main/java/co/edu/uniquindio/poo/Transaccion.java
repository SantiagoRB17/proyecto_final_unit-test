package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Transaccion {
    protected int codigo;
    protected LocalDate fechaEntregaVehiculo;

    public Transaccion(int codigo, LocalDate fechaEntregaVehiculo) {
        this.codigo = codigo;
        this.fechaEntregaVehiculo = fechaEntregaVehiculo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public LocalDate getFechaEntregaVehiculo() {
        return fechaEntregaVehiculo;
    }
    public void setFechaEntregaVehiculo(LocalDate fechaEntregaVehiculo) {
        this.fechaEntregaVehiculo = fechaEntregaVehiculo;
    }
    /**
     * Declaracion del metodo para calculcar el total de cada tipo de transaccion
     * @return
     */
    public abstract double calcularTotal();
    /**
     * Metodo to string para mostrar la informacion de la transaccion
     */
    @Override
    public String toString() {
        return "codigo=" + codigo + ", fechaEntregaVehiculo=" + fechaEntregaVehiculo;
    }
}
