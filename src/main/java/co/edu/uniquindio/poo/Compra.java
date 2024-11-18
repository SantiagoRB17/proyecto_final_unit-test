package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Compra extends Transaccion {
    /**
 * Atributos de la clase Compra
 */
    private LinkedList<DetalleCompra> detalleCompras;
    private double total;
    private boolean revisonTecnica;

    /**
     * Metodo que permite crear compras
     * 
     * @param codigo               codigo de la compra
     * @param fechaEntregaVehiculo fecha de la compra
     * @param empleado             empleado asignado
     * @param vehiculo             vehiculo comprado
     * @param revisonTecnica       determina si el vehiculo
     * @throws PrecioVehiculoVacioException
     */
    public Compra(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo,
            boolean revisonTecnica) throws PrecioVehiculoVacioException {
        super(codigo, fechaEntregaVehiculo, empleado, vehiculo);
        this.total = calcularTotal();
        this.revisonTecnica = revisonTecnica;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isRevisonTecnica() {
        return revisonTecnica;
    }

    public void setRevisonTecnica(boolean revisonTecnica) {
        this.revisonTecnica = revisonTecnica;
    }
    /**
     * Implementacion del metodo calculartotal para calcular el valor total de la
     *
     * compra
     */
    @Override
    public double calcularTotal() throws PrecioVehiculoVacioException {
    }

    @Override
    public String toString() {
        return "Compra: " + super.toString() + " , total=" + total + ", revisionTecnica=" + revisonTecnica;
    }

}
