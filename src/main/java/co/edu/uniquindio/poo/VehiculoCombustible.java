package co.edu.uniquindio.poo;

/**
 * Representa un vehículo a combustible que utiliza gasolina, diésel u otro tipo de combustible.
 */
public class VehiculoCombustible extends Vehiculo {
    /**
     * Tipo de combustible que utiliza el vehículo.
     */
    protected Tipo_Combustible tipo_Combustible;

    /**
     * Constructor para un vehículo a combustible.
     *
     * @param codigoIdentificador Código único del vehículo.
     * @param tipoTransmision Tipo de transmisión del vehículo.
     * @param marca Marca del vehículo.
     * @param esNuevo Indica si el vehículo es nuevo o usado.
     * @param modelo Modelo del vehículo.
     * @param numeroCambios Número de cambios de transmisión.
     * @param maximaVelocidad Velocidad máxima del vehículo en km/h.
     * @param cilindraje Cilindraje del vehículo.
     * @param precioDiaAlquiler Precio por día de alquiler.
     * @param precioVenta Precio de venta del vehículo.
     * @param tipo_Combustible Tipo de combustible que utiliza.
     */
    public VehiculoCombustible(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo,
                               int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler, double precioVenta,
                               Tipo_Combustible tipo_Combustible) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje);
        this.tipo_Combustible = tipo_Combustible;
    }

    public Tipo_Combustible getTipo_Combustible() {
        return tipo_Combustible;
    }

    public void setTipo_Combustible(Tipo_Combustible tipo_Combustible) {
        this.tipo_Combustible = tipo_Combustible;
    }

    @Override
    public String toString() {
        return "VehiculoCombustible" + super.toString() + "tipo_Combustible=" + tipo_Combustible;
    }
    
    
}
