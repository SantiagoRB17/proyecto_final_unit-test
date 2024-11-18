package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Venta extends Transaccion {
  /**
 * Atributos de la clase Venta 
 */
    private double total;
    private Vehiculo vehiculo;

    public Venta(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo) throws PrecioVehiculoVacioException {
        super(codigo, fechaEntregaVehiculo, empleado, vehiculo);
       this.vehiculo = vehiculo; 
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
         double precio = vehiculo.getPrecioVenta();
         if (precio <= 0) {
            throw new PrecioVehiculoVacioException("El precio del vehículo está vacío o es inválido.");
         }
         return precio;
     }
    
    @Override
    public String toString() {
        return "Venta: " + super.toString() + ", total=" + total;
    }   
}
