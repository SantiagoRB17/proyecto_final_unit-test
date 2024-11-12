package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Transaccion {
    protected int codigo;
    protected LocalDate fecha;

    public Transaccion(int codigo, LocalDate fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Declaracion del metodo para calculcar el total de cada tipo de transaccion
     * @return
     */
    public abstract double calcularTotal();
    @Override
    public String toString() {
        return "codigo=" + codigo + ", fecha=" + fecha;
    }
}
