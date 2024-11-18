package co.edu.uniquindio.poo;

/**
 * Representa un vehículo eléctrico con características específicas como
 * autonomía y tiempo de carga.
 */
public class VehiculoElectrico extends Vehiculo {
    /**
     * Autonomía del vehículo eléctrico en kilómetros.
     */
    public int autonomia;

    /**
     * Tiempo de carga del vehículo en horas.
     */
    public double tiempoDeCarga;

    /**
     * Constructor para un vehículo eléctrico.
     *
     * @param codigoIdentificador Código único del vehículo.
     * @param tipoTransmision     Tipo de transmisión del vehículo.
     * @param marca               Marca del vehículo.
     * @param esNuevo             Indica si el vehículo es nuevo o usado.
     * @param modelo              Modelo del vehículo.
     * @param numeroCambios       Número de cambios de transmisión.
     * @param maximaVelocidad     Velocidad máxima del vehículo en km/h.
     * @param cilindraje          Cilindraje del vehículo.
     * @param precioDiaAlquiler   Precio por día de alquiler.
     * @param precioVenta         Precio de venta del vehículo.
     * @param autonomia           Autonomía del vehículo en kilómetros.
     * @param tiempoDeCarga       Tiempo necesario para cargar completamente la
     *                            batería.
     */
    public VehiculoElectrico(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
            int autonomia, double tiempoDeCarga) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje);
        this.autonomia = autonomia;
        this.tiempoDeCarga = tiempoDeCarga;
    }

    /**
     * Obtiene la autonomía del vehículo eléctrico.
     *
     * @return La autonomía del vehículo en kilómetros.
     */
    public int getAutonomia() {
        return autonomia;
    }

    /**
     * Establece la autonomía del vehículo eléctrico.
     *
     * @param autonomia La autonomía en kilómetros a asignar.
     */
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * Obtiene el tiempo de carga del vehículo eléctrico.
     *
     * @return El tiempo de carga en horas.
     */
    public double getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    /**
     * Establece el tiempo de carga del vehículo eléctrico.
     *
     * @param tiempoDeCarga El tiempo de carga en horas a asignar.
     */
    public void setTiempoDeCarga(double tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto VehiculoElectrico.
     *
     * @return Una cadena que representa los atributos del vehículo eléctrico,
     *         incluyendo los heredados de la clase base.
     */
    @Override
    public String toString() {
        return "VehiculoElectrico: " + super.toString() +
                ", autonomia=" + autonomia +
                ", tiempoDeCarga=" + tiempoDeCarga;
    }
}
