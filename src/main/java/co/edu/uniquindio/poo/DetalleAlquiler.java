package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class DetalleAlquiler {
    private double subTotal;
    private int cantidad;
    private Vehiculo vehiculo;
    private Alquiler alquiler;
    public DetalleAlquiler(int cantidad,Alquiler alquiler,Vehiculo vehiculo) {
        this.subTotal = calcularsubTotal();
        this.cantidad = cantidad;
        this.vehiculo=vehiculo;
        this.alquiler=alquiler;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Alquiler getAlquiler() {
        return alquiler;
    }
    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    /**
     * Metodo que permite calcular el subtotal de cada vehiculo
     * @return
     */
    public double calcularsubTotal(int diasAlquiler){
        double subTotal=precioDia*cantidad;
        return subTotal;
    }
    
}
