package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo{
  /**
 * Atributos de la clase VehiculoElectrico
 */
    public int autonomia;
    public double tiempoDeCarga;

    
    public VehiculoElectrico(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje,double precioDiaAlquiler,double precioVenta, int autonomia, double tiempoDeCarga) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje,precioDiaAlquiler,  precioVenta);
        this.autonomia = autonomia;
        this.tiempoDeCarga = tiempoDeCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(double tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    @Override
    public String toString() {
        return "VehiculoElectrico:"+ super.toString() + "autonomia=" + autonomia + ", tiempoDeCarga=" + tiempoDeCarga;
    }
}
