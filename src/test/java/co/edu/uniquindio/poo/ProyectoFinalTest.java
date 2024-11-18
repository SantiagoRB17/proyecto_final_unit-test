/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



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
     * Test para el método calcularTotal y la excepción PrecioVehiculoVacioException
     */
    @Test
public void testCalcularTotal() throws PrecioVehiculoVacioException {
    // Vehículo válido
    Vehiculo vehiculoValido = new Vehiculo(Tipo_Transmision.AUTOMATICA, "Toyota", true, "Corolla", 6, 180.0, 1600, 150.0, 220000.0);
    vehiculoValido.setPrecioVenta(50000); // Asegúrate de que el precio sea adecuado

    // Vehículo inválido
    Vehiculo vehiculoInvalido = new Vehiculo(Tipo_Transmision.AUTOMATICA, "Ford", true, "1232wds", 3, 100, 467, 3420, 2000);
    vehiculoInvalido.setPrecioVenta(0); // Precio inválido

    // Empleado
    Empleado empleado = new Empleado("Veronica", "456712", 764321, "safs", "crack", TipoRol.EMPLEADO, 1, true);

    // Creación de ventas
    Venta ventaValida = new Venta(1, null, empleado, vehiculoValido); // Vehículo válido
    Venta ventaInvalida = new Venta(1, null, empleado, vehiculoInvalido); // Vehículo inválido

    // Caso válido: no debe lanzar excepción
    assertDoesNotThrow(() -> {
        double total = ventaValida.calcularTotal();
        assertEquals(50000, total);
    });

    // Caso inválido: debe lanzar la excepción
    assertThrows(PrecioVehiculoVacioException.class, () -> ventaInvalida.calcularTotal());
}
 }
