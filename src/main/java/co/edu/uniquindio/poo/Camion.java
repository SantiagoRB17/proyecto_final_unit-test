package co.edu.uniquindio.poo;

/**
 * Representa un camión eléctrico que extiende de la clase `VehiculoElectrico`. Esta clase contiene
 * atributos específicos de un camión como la capacidad de carga, sistemas de seguridad, y otras características 
 * relacionadas con este tipo de vehículo.
 */
public class Camion extends VehiculoElectrico {

    /**
     * Atributo que indica la capacidad de carga del camión en toneladas.
     */
    private double capacidadCarga;

    /**
     * Atributo que indica si el camión tiene aire acondicionado.
     */
    private boolean tieneAireAcondicionado;

    /**
     * Atributo que indica si el camión tiene frenos de aire.
     */
    private boolean tieneFrenosAire;

    /**
     * Atributo que indica si el camión tiene sistema de frenos ABS.
     */
    private boolean tieneABS;

    /**
     * Atributo que indica el número de ejes del camión.
     */
    private int numeroEjes;

    /**
     * Atributo que indica el tipo de camión (por ejemplo, camión de carga, camión cisterna, etc.).
     */
    private String tipoCamion;

    /**
     * Constructor de la clase `Camion` que inicializa los atributos del camión, incluyendo
     * los atributos heredados de la clase `VehiculoElectrico`.
     * 
     * @param codigoIdentificador El código identificador único del camión.
     * @param tipoTransmision El tipo de transmisión del camión.
     * @param marca La marca del camión.
     * @param esNuevo Indica si el camión es nuevo o usado.
     * @param modelo El modelo del camión.
     * @param numeroCambios El número de cambios de la transmisión.
     * @param maximaVelocidad La máxima velocidad que puede alcanzar el camión.
     * @param cilindraje El cilindraje del motor del camión.
     * @param precioDiaAlquiler El precio por día de alquiler del camión.
     * @param precioVenta El precio de venta del camión.
     * @param autonomia La autonomía de la batería del camión en kilómetros.
     * @param tiempoDeCarga El tiempo de carga de la batería en horas.
     * @param capacidadCarga La capacidad de carga del camión en toneladas.
     * @param tieneAireAcondicionado Indica si el camión tiene aire acondicionado.
     * @param tieneFrenosAire Indica si el camión tiene frenos de aire.
     * @param tieneABS Indica si el camión tiene sistema de frenos ABS.
     * @param numeroEjes El número de ejes del camión.
     * @param tipoCamion El tipo de camión (por ejemplo, camión de carga, camión cisterna, etc.).
     */
    public Camion(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, 
                  int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta, 
                  int autonomia, double tiempoDeCarga, double capacidadCarga, boolean tieneAireAcondicionado, 
                  boolean tieneFrenosAire, boolean tieneABS, int numeroEjes, String tipoCamion) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, 
              precioDiaAlquiler, precioVenta, autonomia, tiempoDeCarga);
        this.capacidadCarga = capacidadCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosAire = tieneFrenosAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    /**
     * Obtiene la capacidad de carga del camión en toneladas.
     * 
     * @return La capacidad de carga del camión.
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Establece la capacidad de carga del camión.
     * 
     * @param capacidadCarga La nueva capacidad de carga del camión.
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Indica si el camión tiene aire acondicionado.
     * 
     * @return `true` si el camión tiene aire acondicionado, `false` en caso contrario.
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Establece si el camión tiene aire acondicionado.
     * 
     * @param tieneAireAcondicionado El valor que indica si el camión tiene aire acondicionado.
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * Indica si el camión tiene frenos de aire.
     * 
     * @return `true` si el camión tiene frenos de aire, `false` en caso contrario.
     */
    public boolean isTieneFrenosAire() {
        return tieneFrenosAire;
    }

    /**
     * Establece si el camión tiene frenos de aire.
     * 
     * @param tieneFrenosAire El valor que indica si el camión tiene frenos de aire.
     */
    public void setTieneFrenosAire(boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }

    /**
     * Indica si el camión tiene sistema de frenos ABS.
     * 
     * @return `true` si el camión tiene ABS, `false` en caso contrario.
     */
    public boolean isTieneABS() {
        return tieneABS;
    }

    /**
     * Establece si el camión tiene sistema de frenos ABS.
     * 
     * @param tieneABS El valor que indica si el camión tiene ABS.
     */
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    /**
     * Obtiene el número de ejes del camión.
     * 
     * @return El número de ejes del camión.
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Establece el número de ejes del camión.
     * 
     * @param numeroEjes El nuevo número de ejes del camión.
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el tipo de camión (por ejemplo, camión de carga, camión cisterna, etc.).
     * 
     * @return El tipo de camión.
     */
    public String getTipoCamion() {
        return tipoCamion;
    }

    /**
     * Establece el tipo de camión.
     * 
     * @param tipoCamion El nuevo tipo de camión.
     */
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}