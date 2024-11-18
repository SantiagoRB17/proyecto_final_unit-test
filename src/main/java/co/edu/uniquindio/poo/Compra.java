package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Compra extends Transaccion {
    /**
 * Atributos de la clase Compra
 */
    private double total;


    /**
     * Metodo que permite crear compras
     * 
     * @param codigo               codigo de la compra
     * @param fechaEntregaVehiculo fecha de la compra
     * @param empleado             empleado asignado
     * @param vehiculo             vehiculo comprado
     * @throws PrecioVehiculoVacioException
     */
    public Compra(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo) throws PrecioVehiculoVacioException {
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
     *
     * compra
     */
    @Override
    public double calcularTotal() {
        double total = 0;
        if (vehiculo instanceof Bus && vehiculo.isRevisionTecnica()) {
            total = Bus.precioDiaAlquiler;
        } else if (vehiculo instanceof Camion && vehiculo.isRevisionTecnica()) {
            total = Camion.precioDiaAlquiler;
        } else if (vehiculo instanceof Camioneta && vehiculo.isRevisionTecnica()) {
            total = Camioneta.precioDiaAlquiler;
        } else if (vehiculo instanceof Deportivo && vehiculo.isRevisionTecnica()) {
            total = Deportivo.precioDiaAlquiler;
        } else if (vehiculo instanceof PickUp && vehiculo.isRevisionTecnica()) {
            total = PickUp.precioDiaAlquiler;
        } else if (vehiculo instanceof Moto && vehiculo.isRevisionTecnica()) {
            total = Moto.precioDiaAlquiler;
        } else if (vehiculo instanceof Sedan && vehiculo.isRevisionTecnica()) {
            total = Sedan.precioDiaAlquiler;
        } else if (vehiculo instanceof Van && vehiculo.isRevisionTecnica()) {
            total = Van.precioDiaAlquiler;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Compra: " + super.toString() + " , total=" + total ;
    }

}
