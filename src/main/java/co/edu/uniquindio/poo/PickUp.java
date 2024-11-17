package co.edu.uniquindio.poo;


public class PickUp extends VehiculoHibrido{


    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraDeReversa;
    private int numeroBolsasDeAire;
    private boolean tieneABS;
    private boolean es4x4;
    private double capacidadCajaNegra;
    
    public PickUp(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje,double precioDiaAlquiler, Tipo_Combustible tipoCombustibleHibrido, int autonomia,
            boolean esEnchufable, int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado,
            boolean tieneCamaraDeReversa, int numeroBolsasDeAire, boolean tieneABS, boolean es4x4,
            double capacidadCajaNegra) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler,
                tipoCombustibleHibrido, autonomia, esEnchufable);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
        this.es4x4 = es4x4;
        this.capacidadCajaNegra = capacidadCajaNegra;
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


    public boolean isEs4x4() {
        return es4x4;
    }


    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }


    public double getCapacidadCajaNegra() {
        return capacidadCajaNegra;
    }


    public void setCapacidadCajaNegra(double capacidadCajaNegra) {
        this.capacidadCajaNegra = capacidadCajaNegra;
    }


}


