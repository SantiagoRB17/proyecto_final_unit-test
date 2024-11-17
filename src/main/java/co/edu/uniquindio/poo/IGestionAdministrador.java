package co.edu.uniquindio.poo;

public interface IGestionAdministrador {
    public boolean verificarEmpleadoSede(String cedula);
    public boolean agregarEmpleadoSede(Empleado empleado);
    public boolean eliminarEmpleadoSede(String cedulaEmpleado);
    public boolean actualizarEmpleadoSede(String cedula, Empleado nuevoEmpleado);
    

}
