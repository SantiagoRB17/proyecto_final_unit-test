package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Venta extends Transaccion {
    private LinkedList<DetalleVenta> detalleVentas;
    private double total;
    public Venta(int codigo, LocalDate fecha) {
        super(codigo, fecha);
        this.detalleVentas= new LinkedList<>();
        this.total= calcularTotal();
    }
    public LinkedList<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }
    public void setDetalleVentas(LinkedList<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
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
    public double calcularTotal() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "Venta: " + super.toString() + ", total=" + total;
    }   
}
