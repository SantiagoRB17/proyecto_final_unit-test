package co.edu.uniquindio.poo;


public class Camion extends VehiculoElectrico {

/**
 * Atributos de la clase camion
 */
    private double capacidadCarga; 
    private boolean tieneAireAcondicionado;
    private boolean tieneFrenosAire;
    private boolean tieneABS;
    private int numeroEjes;
    private String tipoCamion;


    public Camion(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler,double precioVenta, int autonomia, double tiempoDeCarga, double capacidadCarga,
            boolean tieneAireAcondicionado, boolean tieneFrenosAire, boolean tieneABS, int numeroEjes,
            String tipoCamion) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler,  precioVenta, autonomia,
                tiempoDeCarga);
        this.capacidadCarga = capacidadCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosAire = tieneFrenosAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }


    public double getCapacidadCarga() {
        return capacidadCarga;
    }


    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }


    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }


    public boolean isTieneFrenosAire() {
        return tieneFrenosAire;
    }


    public void setTieneFrenosAire(boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }


    public boolean isTieneABS() {
        return tieneABS;
    }


    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }


    public int getNumeroEjes() {
        return numeroEjes;
    }


    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


    public String getTipoCamion() {
        return tipoCamion;
    }


    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }


}
