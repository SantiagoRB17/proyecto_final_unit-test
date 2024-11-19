package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N",
                TipoRol.ADMINISTRADOR, "Lucas");
        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");
        Empleado empleado1 = new Empleado("Andres", "1094646", 321456, "AndreZX", "uidadus", TipoRol.EMPLEADO, 1001,
                true, sede);
        Empleado empleado2 = new Empleado("Nicolas", "10394646", 32145656, "NicoMN", "NICOO", TipoRol.EMPLEADO, 1002,
                true, sede);
        Empleado empleado3 = new Empleado("Fabio", "109464634", 32641456, "Fab", "reest", TipoRol.EMPLEADO, 1003, true,
                sede);
        Cliente cliente1 = new Cliente("Marta", "8972838", 321187394, "Cra 22", "Marta@gmail.com");
        Cliente cliente2 = new Cliente("Sonia", "11972838", 327394, "Cra 16", "Sonia@gmail.com");
        Cliente cliente3 = new Cliente("Pedro", "11083", 34563, "Cra 89", "Pedro@gmail.com");
        Cliente cliente4 = new Cliente("Arturo", "110383", 4534563, "Cra 19", "Arturo@gmail.com");
        concesionario.agregarAdministrador(administrador1);
        concesionario.agregarSedes(sede);
        sede.setAdministrador(administrador1);
        administrador1.setSede(sede);
        administrador1.agregarEmpleadoSede(empleado1);
        administrador1.agregarEmpleadoSede(empleado2);
        administrador1.agregarEmpleadoSede(empleado3);
        empleado1.agregarClienteSede(cliente1);
        empleado2.agregarClienteSede(cliente2);
        empleado3.agregarClienteSede(cliente3);
        empleado2.agregarClienteSede(cliente4);
    }
}

