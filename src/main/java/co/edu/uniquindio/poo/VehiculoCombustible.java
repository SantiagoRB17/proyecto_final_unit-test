package co.edu.uniquindio.poo;

public class VehiculoCombustible extends Vehiculo {
    /**
 * Atributos de la clase VehiculoCombustible
 */

    protected Tipo_Combustible tipo_Combustible;


    public VehiculoCombustible(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje,double precioDiaAlquiler, double precioVenta,Tipo_Combustible tipo_Combustible) {
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, precioVenta);
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
