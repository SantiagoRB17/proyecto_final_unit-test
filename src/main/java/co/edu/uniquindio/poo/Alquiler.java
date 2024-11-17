package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Alquiler extends Transaccion{
    private int diasAlquiler;
    private double total;
    public Alquiler(int codigo, LocalDate fecha, int diasAlquiler) {
        super(codigo, fecha);
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
