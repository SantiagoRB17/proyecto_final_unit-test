package co.edu.uniquindio.poo;


public class Deportivo  extends VehiculoCombustible{


    private  int numeroPasajeros;
    private  int numeroPuertas;
    private int numeroBolsasAire;
    private double numeroCaballosFuerza;
    private double tiempoAlcanzar100km;
    public static final double PrecioVenta = 3.600000;

    public Deportivo(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler, Tipo_Combustible tipo_Combustible, int numeroPasajeros,
            int numeroPuertas, int numeroBolsasAire, double numeroCaballosFuerza, double tiempoAlcanzar100km) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, tipo_Combustible);

        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.tiempoAlcanzar100km = tiempoAlcanzar100km;
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
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public double getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }
    public void setNumeroCaballosFuerza(double numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }
    public double getTiempoAlcanzar100km() {
        return tiempoAlcanzar100km;
    }
    public void setTiempoAlcanzar100km(double tiempoAlcanzar100km) {
        this.tiempoAlcanzar100km = tiempoAlcanzar100km;
    }


}
