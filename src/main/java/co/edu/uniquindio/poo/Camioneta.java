package co.edu.uniquindio.poo;

public class Camioneta extends VehiculoHibrido {
/**
 * Atributos de la clase camioneta
 */
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraDeReversa;
    private boolean tieneVelocidadCrucero;
    private int numeroBolsasDeAire;
    private boolean tieneABS;
    private boolean tienesensoresDeColision;
    private boolean tieneSensorDeTraficoCruzado;
    private boolean tieneAsistenteDePermanenciaEnElCarril;
    private boolean es4x4;


    public Camioneta(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler,double precioVenta, Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado,
            boolean tieneCamaraDeReversa, boolean tieneVelocidadCrucero, int numeroBolsasDeAire, boolean tieneABS,
            boolean tienesensoresDeColision, boolean tieneSensorDeTraficoCruzado,
            boolean tieneAsistenteDePermanenciaEnElCarril, boolean es4x4) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, precioVenta,
                tipoCombustibleHibrido, autonomia, esEnchufable);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
        this.tienesensoresDeColision = tienesensoresDeColision;
        this.tieneSensorDeTraficoCruzado = tieneSensorDeTraficoCruzado;
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
        this.es4x4 = es4x4;
    }
    public Camioneta(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler,double precioVenta, Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, boolean esHibridoLigero, int numeroPasajeros, int numeroPuertas,
            boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneVelocidadCrucero,
            int numeroBolsasDeAire, boolean tieneABS, boolean tienesensoresDeColision,
            boolean tieneSensorDeTraficoCruzado, boolean tieneAsistenteDePermanenciaEnElCarril, boolean es4x4) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, precioVenta,
                tipoCombustibleHibrido, autonomia, esEnchufable, esHibridoLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
        this.tienesensoresDeColision = tienesensoresDeColision;
        this.tieneSensorDeTraficoCruzado = tieneSensorDeTraficoCruzado;
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
        this.es4x4 = es4x4;
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
    public boolean isEs4x4() {
        return es4x4;
    }
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }


}
