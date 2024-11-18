package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Venta extends Transaccion {
  /**
 * Atributos de la clase Venta 
 */
    private double total;

    public Venta(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo){
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
    public double calcularTotal(){
    }
    
    @Override
    public String toString() {
        return "Venta: " + super.toString() + ", total=" + total;
    }   
}