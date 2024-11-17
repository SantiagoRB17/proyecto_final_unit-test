package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Compra extends Transaccion {
    private LinkedList<DetalleCompra> detalleCompras;
    private double total;
    private boolean revisonTecnica;

    public Compra(int codigo, LocalDate fechaEntregaVehiculo, Empleado empleado, Vehiculo vehiculo,
            LinkedList<DetalleCompra> detalleCompras, double total, boolean revisonTecnica) {
        super(codigo, fechaEntregaVehiculo, empleado, vehiculo);
        this.detalleCompras = new LinkedList<>();
        this.total = calcularTotal();
        this.revisonTecnica = revisonTecnica;
    }

    public LinkedList<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(LinkedList<DetalleCompra> detalleCompras) {
        this.detalleCompras = detalleCompras;
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
     * compra
     */
    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Compra: " + super.toString() + " , total=" + total + ", revisionTecnica=" + revisonTecnica;
    }

}
