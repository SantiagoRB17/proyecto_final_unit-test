package co.edu.uniquindio.poo;

public interface IGestionEmpleado {
    public boolean verificarClienteSede(String cedula);
    public boolean agregarClienteSede(Cliente cliente);
    public boolean eliminarClienteSede(String cedula);
    public boolean actualizarClienteSede(String cedula, Cliente nuevoCliente);
    public boolean agregarVehiculoSede(Vehiculo vehiculo);

}
