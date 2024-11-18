package co.edu.uniquindio.poo;

/**
 * Representa una camioneta que hereda de la clase `VehiculoHibrido`. Contiene
 * atributos específicos
 * de la camioneta como el número de pasajeros, número de puertas, y
 * características adicionales
 * como la presencia de cámara de reversa, control de velocidad crucero,
 * sensores, entre otros.
 */
public class Camioneta extends VehiculoHibrido {

    /**
     * Atributo que indica el número de pasajeros que puede transportar la
     * camioneta.
     */
    private int numeroPasajeros;

    /**
     * Atributo que indica el número de puertas de la camioneta.
     */
    private int numeroPuertas;

    /**
     * Atributo que indica si la camioneta tiene aire acondicionado.
     */
    private boolean tieneAireAcondicionado;

    /**
     * Atributo que indica si la camioneta tiene cámara de reversa.
     */
    private boolean tieneCamaraDeReversa;

    /**
     * Atributo que indica si la camioneta tiene velocidad crucero.
     */
    private boolean tieneVelocidadCrucero;

    /**
     * Atributo que indica el número de bolsas de aire de la camioneta.
     */
    private int numeroBolsasDeAire;

    /**
     * Atributo que indica si la camioneta tiene sistema ABS (sistema de frenos
     * antibloqueo).
     */
    private boolean tieneABS;

    /**
     * Atributo que indica si la camioneta tiene sensores de colisión.
     */
    private boolean tienesensoresDeColision;

    /**
     * Atributo que indica si la camioneta tiene sensores de tráfico cruzado.
     */
    private boolean tieneSensorDeTraficoCruzado;

    /**
     * Atributo que indica si la camioneta tiene asistente de permanencia en el
     * carril.
     */
    private boolean tieneAsistenteDePermanenciaEnElCarril;

    /**
     * Atributo que indica si la camioneta es 4x4 (tracción en las cuatro ruedas).
     */
    private boolean es4x4;

    /**
     * Constructor de la clase `Camioneta` que inicializa todos los atributos de la
     * camioneta.
     * 
     * @param codigoIdentificador                   El código identificador del
     *                                              vehículo.
     * @param tipoTransmision                       El tipo de transmisión del
     *                                              vehículo.
     * @param marca                                 La marca del vehículo.
     * @param esNuevo                               Indica si el vehículo es nuevo.
     * @param modelo                                El modelo del vehículo.
     * @param numeroCambios                         El número de cambios de la
     *                                              transmisión.
     * @param maximaVelocidad                       La velocidad máxima del
     *                                              vehículo.
     * @param cilindraje                            El cilindraje del vehículo.
     * @param precioDiaAlquiler                     El precio de alquiler diario del
     *                                              vehículo.
     * @param precioVenta                           El precio de venta del vehículo.
     * @param tipoCombustibleHibrido                El tipo de combustible híbrido
     *                                              utilizado por el vehículo.
     * @param autonomia                             La autonomía del vehículo en
     *                                              modo híbrido.
     * @param esEnchufable                          Indica si el vehículo es
     *                                              enchufable.
     * @param numeroPasajeros                       El número de pasajeros que puede
     *                                              transportar la camioneta.
     * @param numeroPuertas                         El número de puertas de la
     *                                              camioneta.
     * @param tieneAireAcondicionado                Indica si la camioneta tiene
     *                                              aire acondicionado.
     * @param tieneCamaraDeReversa                  Indica si la camioneta tiene
     *                                              cámara de reversa.
     * @param tieneVelocidadCrucero                 Indica si la camioneta tiene
     *                                              control de velocidad crucero.
     * @param numeroBolsasDeAire                    El número de bolsas de aire de
     *                                              la camioneta.
     * @param tieneABS                              Indica si la camioneta tiene
     *                                              sistema ABS.
     * @param tienesensoresDeColision               Indica si la camioneta tiene
     *                                              sensores de colisión.
     * @param tieneSensorDeTraficoCruzado           Indica si la camioneta tiene
     *                                              sensores de tráfico cruzado.
     * @param tieneAsistenteDePermanenciaEnElCarril Indica si la camioneta tiene
     *                                              asistente de permanencia en el
     *                                              carril.
     * @param es4x4                                 Indica si la camioneta es 4x4.
     */
    public Camioneta(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
            Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado,
            boolean tieneCamaraDeReversa, boolean tieneVelocidadCrucero, int numeroBolsasDeAire, boolean tieneABS,
            boolean tienesensoresDeColision, boolean tieneSensorDeTraficoCruzado,
            boolean tieneAsistenteDePermanenciaEnElCarril,
            boolean es4x4) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje,
                precioDiaAlquiler, precioVenta,
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

    /**
     * Constructor de la clase `Camioneta` que inicializa todos los atributos de la
     * camioneta.
     * 
     * @param codigoIdentificador                   El código identificador del
     *                                              vehículo.
     * @param tipoTransmision                       El tipo de transmisión del
     *                                              vehículo.
     * @param marca                                 La marca del vehículo.
     * @param esNuevo                               Indica si el vehículo es nuevo.
     * @param modelo                                El modelo del vehículo.
     * @param numeroCambios                         El número de cambios de la
     *                                              transmisión.
     * @param maximaVelocidad                       La velocidad máxima del
     *                                              vehículo.
     * @param cilindraje                            El cilindraje del vehículo.
     * @param precioDiaAlquiler                     El precio de alquiler diario del
     *                                              vehículo.
     * @param precioVenta                           El precio de venta del vehículo.
     * @param tipoCombustibleHibrido                El tipo de combustible híbrido
     *                                              utilizado por el vehículo.
     * @param autonomia                             La autonomía del vehículo en
     *                                              modo híbrido.
     * @param esEnchufable                          Indica si el vehículo es
     *                                              enchufable.
     * @param numeroPasajeros                       El número de pasajeros que puede
     *                                              transportar la camioneta.
     * @param numeroPuertas                         El número de puertas de la
     *                                              camioneta.
     * @param tieneAireAcondicionado                Indica si la camioneta tiene
     *                                              aire acondicionado.
     * @param tieneCamaraDeReversa                  Indica si la camioneta tiene
     *                                              cámara de reversa.
     * @param tieneVelocidadCrucero                 Indica si la camioneta tiene
     *                                              control de velocidad crucero.
     * @param numeroBolsasDeAire                    El número de bolsas de aire de
     *                                              la camioneta.
     * @param tieneABS                              Indica si la camioneta tiene
     *                                              sistema ABS.
     * @param tienesensoresDeColision               Indica si la camioneta tiene
     *                                              sensores de colisión.
     * @param tieneSensorDeTraficoCruzado           Indica si la camioneta tiene
     *                                              sensores de tráfico cruzado.
     * @param tieneAsistenteDePermanenciaEnElCarril Indica si la camioneta tiene
     *                                              asistente de permanencia en el
     *                                              carril.
     * @param es4x4                                 Indica si la camioneta es 4x4.
     */
    public Camioneta(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
            Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, boolean esHibridoLigero, int numeroPasajeros, int numeroPuertas,
            boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneVelocidadCrucero,
            int numeroBolsasDeAire, boolean tieneABS, boolean tienesensoresDeColision,
            boolean tieneSensorDeTraficoCruzado, boolean tieneAsistenteDePermanenciaEnElCarril, boolean es4x4) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje,
                precioDiaAlquiler, precioVenta,
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

    /**
     * Obtiene el número de pasajeros que puede transportar la camioneta.
     * 
     * @return El número de pasajeros.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros que puede transportar la camioneta.
     * 
     * @param numeroPasajeros El número de pasajeros a asignar.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el número de puertas de la camioneta.
     * 
     * @return El número de puertas.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el número de puertas de la camioneta.
     * 
     * @param numeroPuertas El número de puertas a asignar.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene si la camioneta tiene aire acondicionado.
     * 
     * @return True si tiene aire acondicionado, false en caso contrario.
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Establece si la camioneta tiene aire acondicionado.
     * 
     * @param tieneAireAcondicionado Indica si tiene aire acondicionado.
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * Obtiene si la camioneta tiene cámara de reversa.
     * 
     * @return True si tiene cámara de reversa, false en caso contrario.
     */
    public boolean isTieneCamaraDeReversa() {
        return tieneCamaraDeReversa;
    }

    /**
     * Establece si la camioneta tiene cámara de reversa.
     * 
     * @param tieneCamaraDeReversa Indica si tiene cámara de reversa.
     */
    public void setTieneCamaraDeReversa(boolean tieneCamaraDeReversa) {
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
    }

    /**
     * Obtiene si la camioneta tiene control de velocidad crucero.
     * 
     * @return True si tiene control de velocidad crucero, false en caso contrario.
     */
    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    /**
     * Establece si la camioneta tiene control de velocidad crucero.
     * 
     * @param tieneVelocidadCrucero Indica si tiene control de velocidad crucero.
     */
    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    /**
     * Obtiene el número de bolsas de aire de la camioneta.
     * 
     * @return El número de bolsas de aire.
     */
    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    /**
     * Establece el número de bolsas de aire de la camioneta.
     * 
     * @param numeroBolsasDeAire El número de bolsas de aire a asignar.
     */
    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    /**
     * Obtiene si la camioneta tiene sistema ABS.
     * 
     * @return True si tiene ABS, false en caso contrario.
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Establece si la camioneta tiene sistema ABS.
     * 
     * @param tieneABS Indica si tiene sistema ABS.
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    /**
     * Obtiene si la camioneta tiene sensores de colisión.
     * 
     * @return True si tiene sensores de colisión, false en caso contrario.
     */
    public boolean isTienesensoresDeColision() {
        return tienesensoresDeColision;
    }

    /**
     * Establece si la camioneta tiene sensores de colisión.
     * 
     * @param tienesensoresDeColision Indica si tiene sensores de colisión.
     */
    public void setTienesensoresDeColision(boolean tienesensoresDeColision) {
        this.tienesensoresDeColision = tienesensoresDeColision;
    }

    /**
     * Obtiene si la camioneta tiene sensores de tráfico cruzado.
     * 
     * @return True si tiene sensores de tráfico cruzado, false en caso contrario.
     */
    public boolean isTieneSensorDeTraficoCruzado() {
        return tieneSensorDeTraficoCruzado;
    }

    /**
     * Establece si la camioneta tiene sensores de tráfico cruzado.
     * 
     * @param tieneSensorDeTraficoCruzado Indica si tiene sensores de tráfico
     *                                    cruzado.
     */
    public void setTieneSensorDeTraficoCruzado(boolean tieneSensorDeTraficoCruzado) {
        this.tieneSensorDeTraficoCruzado = tieneSensorDeTraficoCruzado;
    }

    /**
     * Obtiene si la camioneta tiene asistente de permanencia en el carril.
     * 
     * @return True si tiene asistente de permanencia en el carril, false en caso
     *         contrario.
     */
    public boolean isTieneAsistenteDePermanenciaEnElCarril() {
        return tieneAsistenteDePermanenciaEnElCarril;
    }

    /**
     * Establece si la camioneta tiene asistente de permanencia en el carril.
     * 
     * @param tieneAsistenteDePermanenciaEnElCarril Indica si tiene asistente de
     *                                              permanencia en el carril.
     */
    public void setTieneAsistenteDePermanenciaEnElCarril(boolean tieneAsistenteDePermanenciaEnElCarril) {
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
    }

    /**
     * Obtiene si la camioneta es 4x4 (tracción en las cuatro ruedas).
     * 
     * @return True si es 4x4, false en caso contrario.
     */
    public boolean isEs4x4() {
        return es4x4;
    }

    /**
     * Establece si la camioneta es 4x4 (tracción en las cuatro ruedas).
     * 
     * @param es4x4 Indica si la camioneta es 4x4.
     */
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
}