package co.edu.uniquindio.poo;

public class Moto extends VehiculoCombustible {
    public Moto(Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
    double maximaVelocidad, int cilindraje, Tipo_Combustible tipo_Combustible){
        super(tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, tipo_Combustible);
    }

    @Override
    public String toString() {
        return "Moto: "+ super.toString();
    }
    
}
