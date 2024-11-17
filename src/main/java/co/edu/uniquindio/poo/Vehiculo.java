package co.edu.uniquindio.poo;

public class Vehiculo {
    protected Tipo_Transmision tipoTransmision;
    protected String marca;
    protected boolean esNuevo; 
    protected String modelo;
    protected int numeroCambios;
    protected double maximaVelocidad;
    protected int cilindraje;
    private double precioDiaAlquiler;

    public Vehiculo(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler) {
        this.tipoTransmision = tipoTransmision;
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.numeroCambios = numeroCambios;
        this.maximaVelocidad = maximaVelocidad;
        this.cilindraje = cilindraje;
        this. precioDiaAlquiler = precioDiaAlquiler;
    }
    
    public Tipo_Transmision getTipoTransmision() {
        return tipoTransmision;
    }
    public void setTipoTransmision(Tipo_Transmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isEsNuevo() {
        return esNuevo;
    }
    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumeroCambios() {
        return numeroCambios;
    }
    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }
    public double getMaximaVelocidad() {
        return maximaVelocidad;
    }
    public void setMaximaVelocidad(double maximaVelocidad) {
        this.maximaVelocidad = maximaVelocidad;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public double getPrecioDiaAlquiler() {
        return precioDiaAlquiler;
    }

    public void setPrecioDiaAlquiler(double precioDiaAlquiler) {
        this.precioDiaAlquiler = precioDiaAlquiler;
    }

    @Override
    public String toString() {
        return "Vehiculo [tipoTransmision=" + tipoTransmision + ", marca=" + marca + ", esNuevo=" + esNuevo
                + ", modelo=" + modelo + ", numeroCambios=" + numeroCambios + ", maximaVelocidad=" + maximaVelocidad
                + ", cilindraje=" + cilindraje + ", precioDiaAlquiler=" + precioDiaAlquiler + "]";
    }
    
    
}
