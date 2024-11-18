package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler extends Transaccion{
/**
 * Atributos de la clase alquiler
 */
    private int diasAlquiler;
    private double total;
    private LocalDate FechaDevolucionVehiculo;


    public Alquiler(int codigo, LocalDate fechaEntrega,Empleado empleado, Vehiculo vehiculo, int diasAlquiler,  LocalDate FechaDevolucionVehiculo) throws PrecioVehiculoVacioException {
        super(codigo, fechaEntrega, empleado, vehiculo);
        this.diasAlquiler = diasAlquiler;
        this.total=calcularTotal();
    }
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public LocalDate getFechaDevolucionVehiculo() {
        return FechaDevolucionVehiculo;
    }
    public void setFechaDevolucionVehiculo(LocalDate fechaDevolucionVehiculo) {
        FechaDevolucionVehiculo = fechaDevolucionVehiculo;
    }

    /**
     * Implementacion del metodo calculartotal para calcular el valor total del alquiler
     */
    @Override
    public double calcularTotal () throws PrecioVehiculoVacioException {
        // Verificar si el precio de alquiler es vacío o cero
        if (vehiculo.getPrecioDiaAlquiler() == 0) {
            throw new PrecioVehiculoVacioException("El precio de alquiler del vehículo está vacío o no está establecido.");
        }
        
        // Convertir fechas a número de días (LocalDate a int)
        long diasAlquiler = ChronoUnit.DAYS.between(fechaEntregaVehiculo, FechaDevolucionVehiculo);
        
        if (diasAlquiler <= 0) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a la fecha de fin.");
        }
        
        // Calcular el costo total
        return vehiculo.getPrecioDiaAlquiler() * diasAlquiler;
    }
    
    @Override
    public String toString() {
        return "Alquiler: diasAlquiler=" + diasAlquiler + ", " + super.toString() + ", total="
                + total;
    }
}
