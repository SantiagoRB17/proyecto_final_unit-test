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

        assertTrue(admin.agregarClienteSede(cliente));

        LOG.info("Finalizando prueba de agregar cliente");

        try {
            admin.agregarClienteSede(cliente);
        } catch (IllegalArgumentException e) {
            LOG.info(e.getMessage());
        }
        assertThrows(IllegalArgumentException.class, () -> admin.agregarClienteSede(cliente));
    }

    /**
     * Test del administrador para eliminar un cliente
     */
    @Test
    public void eliminarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar cliente");

        // Crear concesionario, administrador y sede
        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        // Agregar administrador y sede al concesionario
        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        // Asignar la sede al administrador
        admin.setSede(sede);

        // Crear un cliente
        Cliente cliente = new Cliente("Pedro", "654321", 123456789, "Cra 10", "pedro@gmail.com");

        // Agregar cliente a la sede a través del administrador
        assertTrue(admin.agregarClienteSede(cliente));
        assertTrue(admin.eliminarClienteSede("654321"));

        LOG.info("Finalizando prueba de eliminar cliente");
    }

    /**
     * Test del administrador para actualizar un cliente
     */
    @Test
    public void actualizarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar cliente");

        // Crear concesionario, administrador y sede
        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        // Agregar administrador y sede al concesionario
        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        // Asignar la sede al administrador
        admin.setSede(sede);

        // Crear un cliente
        Cliente cliente = new Cliente("Pedro", "654321", 123456789, "Cra 10", "pedro@gmail.com");
        Cliente cliente1 = new Cliente("Pedro", "65", 123456789, "Cra 10", "pedro@gmail.com");

        // Agregar cliente a la sede a través del administrador
        admin.agregarClienteSede(cliente);
        assertTrue(admin.actualizarClienteSede("654321", cliente1));

        LOG.info("Finalizando prueba de actualizar cliente");
    }

    /**
     * Test del administrador para agregar un vehiculo
     */
    @Test
    public void agregarVehiculoAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar cliente");

        // Crear concesionario, administrador y sede
        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta");
        Sede sede = new Sede("Principal", "Cra 8 #28 sur", "Armenia", "6675a");

        // Agregar administrador y sede al concesionario
        concesionario.agregarAdministrador(admin);
        concesionario.agregarSedes(sede);

        // Asignar la sede al administrador
        admin.setSede(sede);

        Vehiculo vehiculo = new Moto(Tipo_Transmision.MANUAL, "Yamaha", true, null, 0, 0, 0, 0, null);

        assertTrue(admin.agregarVehiculoSede(vehiculo));
        LOG.info("Finalizando prueba de agregar vehiculo");
    }

    

}