/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el concesionario.
 */
public class ProyectoFinalTest {
    private static final Logger LOG = Logger.getLogger(ProyectoFinalTest.class.getName());

    /**
     * Test que verifica que se agregue correctamente el administrador y verifica
     * que no se agregue un administrador repetido
     */
    @Test
    public void agregarAdministradorTest() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Sede sede = new Sede("principal", "norte", "armenia", "123");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N",
                TipoRol.ADMINISTRADOR, "Lucas");

        LOG.info(concesionario.toString());

        concesionario.agregarSedes(sede);
        concesionario.agregarAdministrador(administrador1);

        LOG.info(concesionario.toString());

        try {
            concesionario.agregarAdministrador(administrador1);
        } catch (IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }
        assertThrows(IllegalArgumentException.class, () -> concesionario.agregarAdministrador(administrador1));

        LOG.info("Finalizando test");
    }

    /**
     * Test que verifica que se agregue correctamente una sede y verifica que no se
     * agregue una sede repetida
     */
    @Test
    public void agregarSedeTest() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");

        LOG.info(concesionario.toString());

        concesionario.agregarSedes(sede);

        LOG.info(concesionario.toString());

        try {
            concesionario.agregarSedes(sede);
        } catch (IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }
        assertThrows(IllegalArgumentException.class, () -> concesionario.agregarSedes(sede));

        LOG.info("Finalizando test");
    }

    /**
     * Test Para comprobar que el metodo asignar administrador funcione
     * correctamente
     * asignando un nuevo administrador a una sede.
     */

    @Test
    public void testAsignarAdministradorSede() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N",
                TipoRol.ADMINISTRADOR, "Lucas");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel");
        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");

        concesionario.agregarAdministrador(administrador1);

        concesionario.agregarAdministrador(administrador2);

        sede.setAdministrador(administrador1);

        LOG.info(sede.toString());
        try {
            concesionario.cambiarAdministradorSede("123456", sede);
        } catch (ExcepcionSedeOcupada | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        LOG.info(sede.toString());
        assertEquals("Veronica Mendoza", sede.getAdministrador().getNombre());
        LOG.info("Finalizando test");
    }

    /**
     * Test para comprobar que la excepcion de si el administrador ya existe en esa
     * sede sea arrojada correctamente.
     */
    @Test
    public void ExcepcionSedeOcupadaTest() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N",
                TipoRol.ADMINISTRADOR, "Lucas");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel");
        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");

        concesionario.agregarAdministrador(administrador1);

        concesionario.agregarAdministrador(administrador2);

        sede.setAdministrador(administrador1);

        LOG.info(sede.toString());
        try {
            concesionario.cambiarAdministradorSede("1092457", sede);
        } catch (ExcepcionSedeOcupada e) {
            LOG.info(e.getMessage());
        }
        assertThrows(ExcepcionSedeOcupada.class, () -> concesionario.cambiarAdministradorSede("1092457", sede));
        LOG.info("Finalizando test");
    }

    /**
     * Test para comprobar que la excepcion de si el administrador en nulo o no se
     * encuentra en la lista
     * de administradores arroje una excepcion de argumento invalido.
     */
    @Test
    public void ExcepcionIllegalArgumentTest() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N",
                TipoRol.ADMINISTRADOR, "Lucas");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel");
        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");

        concesionario.agregarAdministrador(administrador1);

        concesionario.agregarAdministrador(administrador2);

        sede.setAdministrador(administrador1);

        LOG.info(sede.toString());
        try {
            concesionario.cambiarAdministradorSede(null, sede);
        } catch (ExcepcionSedeOcupada | IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }
        assertThrows(IllegalArgumentException.class, () -> concesionario.cambiarAdministradorSede(null, sede));
        LOG.info("Finalizando test");
    }

    /**
     * Test para Buscar una transaccion por un rango de fechas
     */
    @Test
    public void buscarTransaccionesPorRangoTest() {
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

        
        LOG.info(sede.toString());
    }

    /**
     * Test del administrador para agregar un cliente
     */
    @Test
    public void agregarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar cliente");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Cliente cliente = new Cliente("Pedro", "654321", 123456789, "Cra 10", "pedro@gmail.com");

        try {
            assertTrue(admin.agregarClienteSede(cliente));
        } catch (IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }

        LOG.info("Verificando duplicados y capturando excepciones esperadas");
        try {
            admin.agregarClienteSede(cliente);
        } catch (IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }
        assertThrows(IllegalArgumentException.class, () -> admin.agregarClienteSede(cliente));

        LOG.info("Finalizando prueba de agregar cliente");
    }

    /**
     * Test del administrador para eliminar un cliente
     */
    @Test
    public void eliminarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de eliminar cliente");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Cliente cliente = new Cliente("Pedro", "654321", 123456789, "Cra 10", "pedro@gmail.com");
        admin.agregarClienteSede(cliente);

        try {
            assertTrue(admin.eliminarClienteSede("654321"));
            admin.eliminarClienteSede("999999");
        } catch (IllegalArgumentException e) {
            LOG.info("Excepción al eliminar cliente: " + e.getMessage());
        }

        LOG.info("Finalizando prueba de eliminar cliente");
    }

    /**
     * Test del administrador para actualizar un cliente
     */
    @Test
    public void actualizarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de actualizar cliente");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Cliente cliente = new Cliente("Pedro", "654321", 123456789, "Cra 10", "pedro@gmail.com");
        Cliente cliente1 = new Cliente("Pedro Modificado", "654321", 987654321, "Cra 20", "modificado@gmail.com");
        admin.agregarClienteSede(cliente);

        try {
            assertTrue(admin.actualizarClienteSede("654321", cliente1));
            admin.actualizarClienteSede("999999", cliente1);
        } catch (IllegalArgumentException e) {
            LOG.info("Excepción al actualizar cliente: " + e.getMessage());
        }

        try {
            admin.actualizarClienteSede("654321", null);
        } catch (IllegalArgumentException e) {
            LOG.info("Excepción al intentar actualizar con cliente nulo: " + e.getMessage());
        }

        LOG.info("Finalizando prueba de actualizar cliente");
    }

    /**
     * Test del administrador para agregar un vehiculo a la sede
     */
    @Test
    public void agregarVehiculoAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar vehículo");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Vehiculo vehiculo = new Moto(1, Tipo_Transmision.MANUAL, "Yamaha", true, null, 0, 0, 0, 0, 0, null);

        try {
            assertTrue(admin.agregarVehiculoSede(vehiculo));
            admin.agregarVehiculoSede(null);
        } catch (IllegalArgumentException e) {
            LOG.info("Excepción al agregar vehículo: " + e.getMessage());
        }

        LOG.info("Finalizando prueba de agregar vehículo");
    }

    /**
     * Test del administrador para agregar un empleado
     */
    @Test
    public void agregarEmpleadoTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar empleado");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Empleado empleado1 = new Empleado("Pedro", "5", 123456789, "Cra 10", "pedro@gmail.com", TipoRol.EMPLEADO, 1,
                true, sede);

        assertTrue(admin.agregarEmpleadoSede(empleado1));

        LOG.info("Finalizando prueba de agregar empleado");
    }

    /**
     * Test para eliminar la informacion de un empleado
     * 
     * @throws ExcepcionSedeOcupada
     */
    @Test
    public void eliminarEmpleadoTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de eliminar empleado");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Empleado empleado1 = new Empleado("Pedro", "5", 123456789, "Cra 10", "pedro@gmail.com", TipoRol.EMPLEADO, 1,
                true, sede);

        assertTrue(admin.agregarEmpleadoSede(empleado1));
        assertTrue(admin.eliminarEmpleadoSede(empleado1.getCedula()));

        LOG.info("Finalizando prueba de eliminar empleado");
    }

    /**
     * Test para que el administrador pueda actualizar la informacion del empleado
     * 
     * @throws ExcepcionSedeOcupada
     */
    @Test
    public void actualizarEmpleadoTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de eliminar empleado");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        admin.setSede(sede);

        Empleado empleado1 = new Empleado("Pedro", "5", 123456789, "Cra 10", "pedro@gmail.com", TipoRol.EMPLEADO, 1,
                true, sede);
        Empleado empleado2 = new Empleado("Juan", "12", 34567, "Cra 5", "juan@gmail.com", TipoRol.EMPLEADO, 2,
                true, sede);

        assertTrue(admin.agregarEmpleadoSede(empleado1));
        assertTrue(admin.actualizarEmpleadoSede(empleado1.getCedula(), empleado2));

        LOG.info("Finalizando prueba de agregar empleado");
    }

    /**
     * Test para la saber si la aprobacion de revision tecnica esta funcionando
     * correctamente
     * 
     */
    @Test
    public void aprovarRevisionTecnicaTest() {
        LOG.info("Iniciando prueba de aprobar revisión técnica");

        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");
        Vehiculo vehiculo1 = new Moto(12345, Tipo_Transmision.MANUAL, "Yamaha", true, "Negro", 12345, 2020, 150, 2, 0,
                null);
        Vehiculo vehiculo2 = new Deportivo(54321, Tipo_Transmision.AUTOMATICA, "Toyota", false, "Rojo", 54321, 2018,
                2000, 5, 0, null, 0, 0, 0, 0, 0);

        sede.agregarVehiculo(vehiculo1);
        sede.agregarVehiculo(vehiculo2);

        assertTrue(sede.aprovarRevisionTecnica(12345));
        assertTrue(vehiculo1.isRevisionTecnica());

        assertTrue(sede.aprovarRevisionTecnica(54321));
        assertTrue(vehiculo2.isRevisionTecnica());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sede.aprovarRevisionTecnica(99999);
        });
        assertEquals("El codigo es incorrecto o no existe el vehiculo", exception.getMessage());

        LOG.info("Finalizando prueba de aprobar revisión técnica");
    }

    /**
     * Test para calcular costo con la revision tecnica aprobada
     * @throws PrecioVehiculoVacioException
     */
    @Test
    public void testCalcularTotalConRevisionTecnicaAprobada() throws PrecioVehiculoVacioException {

        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        Empleado empleado1 = new Empleado("Pedro", "5", 123456789, "Cra 10", "pedro@gmail.com", TipoRol.EMPLEADO, 1,
                true, sede);

        Bus bus = new Bus(1, Tipo_Transmision.MANUAL, "Mercedes", true, "Sprinter", 6, 120, 5000, 200, 50000, null, 0,
                0, 0,
                false, false, 0, false, 0, 0);
        bus.setRevisionTecnica(true);

        Compra compra = new Compra(1, null, empleado1, bus);

        assertEquals(Bus.precioDiaAlquiler, compra.calcularTotal(),
                "El cálculo del total no es correcto para revisión técnica aprobada");
    }

}