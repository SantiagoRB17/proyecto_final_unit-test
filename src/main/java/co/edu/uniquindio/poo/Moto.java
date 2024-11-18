package co.edu.uniquindio.poo;

public class Moto extends VehiculoCombustible {


    public Moto(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo, int numeroCambios,
    double maximaVelocidad, int cilindraje,double precioDiaAlquiler, double precioVenta,Tipo_Combustible tipo_Combustible){
        super(codigoIdentificador,tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler, precioVenta, tipo_Combustible);
    }

    @Override
    public String toString() {
        return "Moto: "+ super.toString();
    }
    
}
