package co.edu.uniquindio.poo;


public class Van extends VehiculoElectrico {

/**
 * Atributos de la clase Van
 */
    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraDeReversa;
    private int numeroBolsasDeAire;
    private boolean tieneABS;

    public Van(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje,double precioDiaAlquiler, double precioVenta, int autonomia, double tiempoDeCarga, int numeroPasajeros,
            int numeroPuertas, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa,
            int numeroBolsasDeAire, boolean tieneABS) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, precioVenta,autonomia,
                tiempoDeCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
    }


    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }


    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }


    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }


    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }


    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }


    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }


    public boolean isTieneCamaraDeReversa() {
        return tieneCamaraDeReversa;
    }


    public void setTieneCamaraDeReversa(boolean tieneCamaraDeReversa) {
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
    }


    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }


    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }


    public boolean isTieneABS() {
        return tieneABS;
    }


    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
}
