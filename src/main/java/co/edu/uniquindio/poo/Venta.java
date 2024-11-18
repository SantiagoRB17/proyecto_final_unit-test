package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta extends Transaccion {

    private double total;

    public Venta(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo) {
        super(codigo, fechaEntregaVehiculo, empleado, vehiculo);
        this.total = calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Implementacion del metodo calculartotal para calcular el valor total de la
     * venta
     */

    @Override
    public double calcularTotal() {
        double total = 0;
        if (vehiculo instanceof Bus) {
            total = Bus.precioVenta;
        } else if (vehiculo instanceof Camion) {
            total = Camion.precioVenta;
        } else if (vehiculo instanceof Camioneta) {
            total = Camioneta.precioVenta;
        } else if (vehiculo instanceof Deportivo) {
            total = Deportivo.precioVenta;
        } else if (vehiculo instanceof PickUp) {
            total = PickUp.precioVenta;
        } else if (vehiculo instanceof Moto) {
            total = Moto.precioVenta;
        } else if (vehiculo instanceof Sedan) {
            total = Sedan.precioVenta;
        } else if (vehiculo instanceof Van) {
            total = Van.precioVenta;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venta: " + super.toString() + ", total=" + total;
    }
}