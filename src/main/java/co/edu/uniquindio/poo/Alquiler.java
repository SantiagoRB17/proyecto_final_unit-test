package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler extends Transaccion{

    private int diasAlquiler;
    private double total;
    private LocalDate FechaDevolucionVehiculo;


    public Alquiler(int codigo, LocalDate fechaEntrega, int diasAlquiler,  LocalDate FechaDevolucionVehiculo) {
        super(codigo, fechaEntrega);

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
     * Metodo para calcular el costo del alquiler
     * @param vehiculo
     * @return
     */
    public double calcularCostoAlquiler(Vehiculo vehiculo) {
        // Convertir fechas a número de días (LoacalDate a int)
        long diasAlquiler = ChronoUnit.DAYS.between(fechaEntregaVehiculo, FechaDevolucionVehiculo);
        if (diasAlquiler <= 0) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a la fecha de fin.");
        }
        // Calcular el costo total
        return vehiculo.getPrecioDiaAlquiler() * diasAlquiler;
    }
    /**
     * Implementacion del metodo calculartotal para calcular el valor total del alquiler
     */
    @Override
    public double calcularTotal() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "Alquiler: diasAlquiler=" + diasAlquiler + ", " + super.toString() + ", total="
                + total;
    }
}
