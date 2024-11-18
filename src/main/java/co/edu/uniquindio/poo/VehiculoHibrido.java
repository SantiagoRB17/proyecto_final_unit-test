package co.edu.uniquindio.poo;

/**
 * Representa un vehículo híbrido, que combina dos tipos de combustibles y puede
 * ser enchufable o híbrido ligero.
 */
public class VehiculoHibrido extends Vehiculo {
    /**
     * Tipo de combustible híbrido que utiliza el vehículo.
     */
    protected Tipo_Combustible tipoCombustibleHibrido;

    /**
     * Autonomía del vehículo híbrido en kilómetros.
     */
    protected int autonomia;

    /**
     * Indica si el vehículo es enchufable.
     */
    protected boolean esEnchufable;

    /**
     * Indica si el vehículo es un híbrido ligero.
     */
    protected boolean esHibridoLigero;

    /**
     * Constructor para un vehículo híbrido estándar.
     *
     * @param codigoIdentificador    Código único del vehículo.
     * @param tipoTransmision        Tipo de transmisión del vehículo.
     * @param marca                  Marca del vehículo.
     * @param esNuevo                Indica si el vehículo es nuevo o usado.
     * @param modelo                 Modelo del vehículo.
     * @param numeroCambios          Número de cambios de transmisión.
     * @param maximaVelocidad        Velocidad máxima del vehículo en km/h.
     * @param cilindraje             Cilindraje del vehículo.
     * @param precioDiaAlquiler      Precio por día de alquiler.
     * @param precioVenta            Precio de venta del vehículo.
     * @param tipoCombustibleHibrido Tipo de combustible híbrido que utiliza.
     * @param autonomia              Autonomía del vehículo en kilómetros.
     * @param esEnchufable           Indica si es enchufable.
     */
    public VehiculoHibrido(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
            Tipo_Combustible tipoCombustibleHibrido, int autonomia, boolean esEnchufable) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje);
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
        this.autonomia = autonomia;
        this.esEnchufable = esEnchufable;
    }

    /**
     * Constructor para un vehículo híbrido estándar.
     *
     * @param codigoIdentificador    Código único del vehículo.
     * @param tipoTransmision        Tipo de transmisión del vehículo.
     * @param marca                  Marca del vehículo.
     * @param esNuevo                Indica si el vehículo es nuevo o usado.
     * @param modelo                 Modelo del vehículo.
     * @param numeroCambios          Número de cambios de transmisión.
     * @param maximaVelocidad        Velocidad máxima del vehículo en km/h.
     * @param cilindraje             Cilindraje del vehículo.
     * @param precioDiaAlquiler      Precio por día de alquiler.
     * @param precioVenta            Precio de venta del vehículo.
     * @param tipoCombustibleHibrido Tipo de combustible híbrido que utiliza.
     * @param autonomia              Autonomía del vehículo en kilómetros.
     * @param esEnchufable           Indica si es enchufable.
     * @param esHibridoLigero        Indica si es ligero o no.
     */
    public VehiculoHibrido(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
            Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, boolean esHibridoLigero) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje);
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
        this.autonomia = autonomia;
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = esHibridoLigero;
    }

    /**
     * Obtiene el tipo de combustible híbrido del vehículo.
     *
     * @return El tipo de combustible híbrido utilizado por el vehículo.
     */
    public Tipo_Combustible getTipoCombustibleHibrido() {
        return tipoCombustibleHibrido;
    }

    /**
     * Establece el tipo de combustible híbrido para el vehículo.
     *
     * @param tipoCombustibleHibrido El tipo de combustible híbrido a asignar.
     */
    public void setTipoCombustibleHibrido(Tipo_Combustible tipoCombustibleHibrido) {
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
    }

    /**
     * Obtiene la autonomía del vehículo híbrido.
     *
     * @return La autonomía del vehículo en kilómetros.
     */
    public int getAutonomia() {
        return autonomia;
    }

    /**
     * Establece la autonomía del vehículo híbrido.
     *
     * @param autonomia La autonomía en kilómetros a asignar.
     */
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * Verifica si el vehículo es enchufable.
     *
     * @return {@code true} si el vehículo es enchufable, de lo contrario
     *         {@code false}.
     */
    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    /**
     * Establece si el vehículo es enchufable.
     *
     * @param esEnchufable {@code true} si el vehículo es enchufable, de lo
     *                     contrario {@code false}.
     */
    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    /**
     * Verifica si el vehículo es un híbrido ligero.
     *
     * @return {@code true} si el vehículo es un híbrido ligero, de lo contrario
     *         {@code false}.
     */
    public boolean isEsHibridoLigero() {
        return esHibridoLigero;
    }

    /**
     * Establece si el vehículo es un híbrido ligero.
     *
     * @param esHibridoLigero {@code true} si el vehículo es un híbrido ligero, de
     *                        lo contrario {@code false}.
     */
    public void setEsHibridoLigero(boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto VehiculoHibrido.
    *
    * @return Una cadena que representa los atributos del vehículo híbrido, incluyendo los heredados de la clase base.
    */
    @Override
    public String toString() {
     return "VehiculoHibrido: " + super.toString() +
             ", tipoCombustibleHibrido=" + tipoCombustibleHibrido +
             ", autonomia=" + autonomia +
            ", esEnchufable=" + esEnchufable +
            ", esHibridoLigero=" + esHibridoLigero;
    }
}