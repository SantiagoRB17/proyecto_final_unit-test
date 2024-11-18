package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo {
      /**
 * Atributos de la clase VehiculoHibrido
 */
    protected Tipo_Combustible tipoCombustibleHibrido;
    protected int autonomia;
    protected boolean esEnchufable;
    protected boolean esHibridoLigero;
    

    public VehiculoHibrido(int codigoIdentificador,Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje,double precioDiaAlquiler, double precioVenta,Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje,precioDiaAlquiler, precioVenta);
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
        this.autonomia = autonomia;
        this.esEnchufable = esEnchufable;
    }

    public VehiculoHibrido(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo, String modelo,
            int numeroCambios, double maximaVelocidad, int cilindraje, double precioDiaAlquiler,double precioVenta,Tipo_Combustible tipoCombustibleHibrido,
            int autonomia, boolean esEnchufable, boolean esHibridoLigero) {
        super(codigoIdentificador, tipoTransmision, marca, esNuevo, modelo, numeroCambios, maximaVelocidad, cilindraje, precioDiaAlquiler,  precioVenta);
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
        this.autonomia = autonomia;
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = esHibridoLigero;
    }

    public Tipo_Combustible getTipoCombustibleHibrido() {
        return tipoCombustibleHibrido;
    }

    public void setTipoCombustibleHibrido(Tipo_Combustible tipoCombustibleHibrido) {
        this.tipoCombustibleHibrido = tipoCombustibleHibrido;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    public boolean isEsHibridoLigero() {
        return esHibridoLigero;
    }

    public void setEsHibridoLigero(boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }

    @Override
    public String toString() {
        return "VehiculoHibrido: "+ super.toString() + "tipoCombustibleHibrido=" + tipoCombustibleHibrido + ", autonomia=" + autonomia
                + ", esEnchufable=" + esEnchufable + ", esHibridoLigero=" + esHibridoLigero;
    }
    
    
}
