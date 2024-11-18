package co.edu.uniquindio.poo;


public class Sedan extends VehiculoElectrico {


    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraDeReversa;
    private boolean tieneVelocidadCrucero;
    private int numeroBolsasDeAire;
    private boolean tieneABS;
    private boolean tienesensoresDeColision;
    private boolean tieneSensorDeTraficoCruzado;
    private boolean tieneAsistenteDePermanenciaEnElCarril;
    public static final double PrecioVenta = 2.700000;


    public Sedan(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje,double precioDiaAlquiler, int autonomia, double tiempoDeCarga, int numeroPasajeros,
            int numeroPuertas, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa,
            boolean tieneVelocidadCrucero, int numeroBolsasDeAire, boolean tieneABS, boolean tienesensoresDeColision,
            boolean tieneSensorDeTraficoCruzado, boolean tieneAsistenteDePermanenciaEnElCarril) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, autonomia,
                tiempoDeCarga);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
        this.tienesensoresDeColision = tienesensoresDeColision;
        this.tieneSensorDeTraficoCruzado = tieneSensorDeTraficoCruzado;
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
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


    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }


    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
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


    public boolean isTienesensoresDeColision() {
        return tienesensoresDeColision;
    }


    public void setTienesensoresDeColision(boolean tienesensoresDeColision) {
        this.tienesensoresDeColision = tienesensoresDeColision;
    }


    public boolean isTieneSensorDeTraficoCruzado() {
        return tieneSensorDeTraficoCruzado;
    }


    public void setTieneSensorDeTraficoCruzado(boolean tieneSensorDeTraficoCruzado) {
        this.tieneSensorDeTraficoCruzado = tieneSensorDeTraficoCruzado;
    }


    public boolean isTieneAsistenteDePermanenciaEnElCarril() {
        return tieneAsistenteDePermanenciaEnElCarril;
    }


    public void setTieneAsistenteDePermanenciaEnElCarril(boolean tieneAsistenteDePermanenciaEnElCarril) {
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
    } 
}

