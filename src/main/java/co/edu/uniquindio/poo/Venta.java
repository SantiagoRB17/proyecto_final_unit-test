package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Venta extends Transaccion {

    private double total;
    private Vehiculo vehiculo;

    public Venta(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo) throws PrecioVehiculoVacioException {
        super(codigo, fechaEntregaVehiculo, empleado, vehiculo);
        this.total= calcularTotal();
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    /**
     * Implementacion del metodo calculartotal para calcular el valor total de la venta
     */
    
    @Override
    public double calcularTotal() throws PrecioVehiculoVacioException {
        // Verificación del precio para cada tipo de vehículo
        if (vehiculo instanceof Bus) {
            if (Bus.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio del bus está vacío");
            }
            return Bus.PrecioVenta;
        } else if (vehiculo instanceof Camion) {
            if (Camion.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio del camión está vacío");
            }
            return Camion.PrecioVenta;
        } else if (vehiculo instanceof Camioneta) {
            if (Camioneta.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio de la camioneta está vacío");
            }
            return Camioneta.PrecioVenta;
        } else if (vehiculo instanceof Deportivo) {
            if (Deportivo.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio del deportivo está vacío");
            }
            return Deportivo.PrecioVenta;
        } else if (vehiculo instanceof PickUp) {
            if (PickUp.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio de la pick up está vacío");
            }
            return PickUp.PrecioVenta;
        } else if (vehiculo instanceof Moto) {
            if (Moto.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio de la moto está vacío");
            }
            return Moto.PrecioVenta;
        } else if (vehiculo instanceof Sedan) {
            if (Sedan.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio del sedán está vacío");
            }
            return Sedan.PrecioVenta;
        } else if (vehiculo instanceof Van) {
            if (Van.PrecioVenta == 0) {
                throw new PrecioVehiculoVacioException("El precio de la van está vacío");
            }
            return Van.PrecioVenta;
        }

    }
    
    @Override
    public String toString() {
        return "Venta: " + super.toString() + ", total=" + total;
    }   
}
