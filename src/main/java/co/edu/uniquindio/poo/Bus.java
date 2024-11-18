package co.edu.uniquindio.poo;

/**
 * Representa un bus que extiende de la clase `VehiculoCombustible`. Esta clase contiene
 * atributos específicos de un bus como el número de pasajeros, puertas, capacidad del maletero,
 * sistemas de seguridad, y otras características específicas para este tipo de vehículo.
 */
public class Bus extends VehiculoCombustible {

    /**
     * Atributo que indica el número de pasajeros que puede transportar el bus.
     */
    private int numeroPasajeros;

    /**
     * Atributo que indica el número de puertas del bus.
     */
    private int numeroPuertas;

    /**
     * Atributo que indica la capacidad del maletero del bus en litros.
     */
    private double capacidadMaletero;

    /**
     * Atributo que indica si el bus tiene aire acondicionado.
     */
    private boolean tieneAireAcondicionado;

    /**
     * Atributo que indica si el bus tiene cámara de reversa.
     */
    private boolean tieneCamaraDeReversa;

    /**
     * Atributo que indica el número de bolsas de aire que tiene el bus.
     */
    private int numeroBolsasDeAire;

    /**
     * Atributo que indica si el bus tiene sistema de frenos ABS.
     */
    private boolean tieneABS;

    /**
     * Atributo que indica el número de ejes del bus.
     */
    private int numeroEjes;

    /**
     * Atributo que indica el número de salidas de emergencia del bus.
     */
    private int numeroSalidasEmergencia;

    /**
     * Constructor de la clase `Bus` que inicializa los atributos del bus, incluyendo
     * los atributos heredados de la clase `VehiculoCombustible`.
     * 
     * @param codigoIdentificador El código identificador único del bus.
     * @param tipoTransmision El tipo de transmisión del bus.
     * @param marca La marca del bus.
     * @param esNuevo Indica si el bus es nuevo o usado.
     * @param modelo El modelo del bus.
     * @param numeroCambios El número de cambios de la transmisión.
     * @param maximaVelocidad La máxima velocidad que puede alcanzar el bus.
     * @param cilindraje El cilindraje del motor del bus.
     * @param precioDiaAlquiler El precio por día de alquiler del bus.
     * @param precioVenta El precio de venta del bus.
     * @param tipo_Combustible El tipo de combustible que usa el bus.
     * @param numeroPasajeros El número de pasajeros que puede transportar el bus.
     * @param numeroPuertas El número de puertas del bus.
     * @param capacidadMaletero La capacidad del maletero del bus en litros.
     * @param tieneAireAcondicionado Indica si el bus tiene aire acondicionado.
     * @param tieneCamaraDeReversa Indica si el bus tiene cámara de reversa.
     * @param numeroBolsasDeAire El número de bolsas de aire del bus.
     * @param tieneABS Indica si el bus tiene sistema de frenos ABS.
     * @param numeroEjes El número de ejes del bus.
     * @param numeroSalidasEmergencia El número de salidas de emergencia del bus.
     */
    public Bus(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, 
            int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta, 
            Tipo_Combustible tipo_Combustible, int numeroPasajeros, int numeroPuertas, double capacidadMaletero, 
            boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, int numeroBolsasDeAire, boolean tieneABS, 
            int numeroEjes, int numeroSalidasEmergencia) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, 
              precioDiaAlquiler, precioVenta, tipo_Combustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Obtiene el número de pasajeros que puede transportar el bus.
     * 
     * @return El número de pasajeros del bus.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros que puede transportar el bus.
     * 
     * @param numeroPasajeros El nuevo número de pasajeros.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el número de puertas del bus.
     * 
     * @return El número de puertas del bus.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el número de puertas del bus.
     * 
     * @param numeroPuertas El nuevo número de puertas del bus.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene la capacidad del maletero del bus en litros.
     * 
     * @return La capacidad del maletero del bus.
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Establece la capacidad del maletero del bus.
     * 
     * @param capacidadMaletero La nueva capacidad del maletero del bus.
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Indica si el bus tiene aire acondicionado.
     * 
     * @return `true` si el bus tiene aire acondicionado, `false` en caso contrario.
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Establece si el bus tiene aire acondicionado.
     * 
     * @param tieneAireAcondicionado El valor que indica si el bus tiene aire acondicionado.
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * Indica si el bus tiene cámara de reversa.
     * 
     * @return `true` si el bus tiene cámara de reversa, `false` en caso contrario.
     */
    public boolean isTieneCamaraDeReversa() {
        return tieneCamaraDeReversa;
    }

    /**
     * Establece si el bus tiene cámara de reversa.
     * 
     * @param tieneCamaraDeReversa El valor que indica si el bus tiene cámara de reversa.
     */
    public void setTieneCamaraDeReversa(boolean tieneCamaraDeReversa) {
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
    }

    /**
     * Obtiene el número de bolsas de aire del bus.
     * 
     * @return El número de bolsas de aire del bus.
     */
    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    /**
     * Establece el número de bolsas de aire del bus.
     * 
     * @param numeroBolsasDeAire El nuevo número de bolsas de aire.
     */
    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    /**
     * Indica si el bus tiene sistema de frenos ABS.
     * 
     * @return `true` si el bus tiene ABS, `false` en caso contrario.
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Establece si el bus tiene sistema de frenos ABS.
     * 
     * @param tieneABS El valor que indica si el bus tiene ABS.
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    /**
     * Obtiene el número de ejes del bus.
     * 
     * @return El número de ejes del bus.
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Establece el número de ejes del bus.
     * 
     * @param numeroEjes El nuevo número de ejes del bus.
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el número de salidas de emergencia del bus.
     * 
     * @return El número de salidas de emergencia del bus.
     */
    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    /**
     * Establece el número de salidas de emergencia del bus.
     * 
     * @param numeroSalidasEmergencia El nuevo número de salidas de emergencia.
     */
    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Bus, incluyendo
     * todas las características del bus.
     * 
     * @return Una cadena con los detalles del bus.
     */
    @Override
    public String toString() {
        return "Bus: numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero=" 
            + capacidadMaletero + ", tieneAireAcondicionado=" + tieneAireAcondicionado + ", tieneCamaraDeReversa=" 
            + tieneCamaraDeReversa + ", numeroBolsasDeAire=" + numeroBolsasDeAire + ", tieneABS=" + tieneABS 
            + ", numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia;
    }
}
