/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
                TipoRol.ADMINISTRADOR, "Lucas", "santiago.ramirezb1@uniquindio.edu.co");

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
                TipoRol.ADMINISTRADOR, "Lucas", "santiago.ramirezb1@uniquindio.edu.co");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel", "VeroMemDoza@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Lucas", "santiago.ramirezb1@uniquindio.edu.co");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel", "VeroMemDoza@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Lucas", "santiago.ramirezb1@uniquindio.edu.co");
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X",
                TipoRol.ADMINISTRADOR, "Miguel", "VeroMemDoza@gmail.com");
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
     * 
     * @throws PrecioVehiculoVacioException
     */
    @Test
    public void testBuscarTransaccionesPorRango() throws PrecioVehiculoVacioException {

        Sede sede = new Sede("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");
        Empleado empleado1 = new Empleado("Pedro", "5", 123456789, "Cra 10", "pedro@gmail.com", TipoRol.EMPLEADO, 1,
                true, sede);
        Vehiculo vehiculo1 = new Moto(12345, Tipo_Transmision.MANUAL, "Yamaha", true, "Negro", 12345, 2020, 150, 2, 0,
                null);

        LocalDate fechaInicioRango = LocalDate.of(2023, 11, 1);
        LocalDate fechaFinRango = LocalDate.of(2023, 11, 30);

        Venta venta = new Venta(1, LocalDate.of(2023, 11, 5), empleado1, vehiculo1);
        Compra compra = new Compra(2, LocalDate.of(2023, 11, 10), empleado1, vehiculo1);
        Alquiler alquiler = new Alquiler(3, LocalDate.of(2023, 11, 2), empleado1, vehiculo1,
                LocalDate.of(2023, 11, 16));
        Alquiler alquilerFueraRango = new Alquiler(4, LocalDate.of(2023, 12, 1), empleado1, vehiculo1,
                LocalDate.of(2023, 12, 5));

        sede.agregarTransaccion(venta);
        sede.agregarTransaccion(compra);
        sede.agregarTransaccion(alquiler);
        sede.agregarTransaccion(alquilerFueraRango);

        List<Transaccion> transaccionesEncontradas = sede.buscarTransaccionesPorRango(fechaInicioRango, fechaFinRango);

        assertEquals(3, transaccionesEncontradas.size(), "El número de transacciones encontradas es incorrecto");
        assertTrue(transaccionesEncontradas.contains(venta), "La transacción de venta no está incluida");
        assertTrue(transaccionesEncontradas.contains(compra), "La transacción de compra no está incluida");
        assertTrue(transaccionesEncontradas.contains(alquiler), "La transacción de alquiler no está incluida");
        assertFalse(transaccionesEncontradas.contains(alquilerFueraRango),
                "La transacción fuera del rango fue incluida");
    }

    /**
     * Test del administrador para agregar un cliente
     */
    @Test
    public void agregarClienteAdministradorTest() throws ExcepcionSedeOcupada {
        LOG.info("Iniciando prueba de agregar cliente");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador admin = new Administrador("Juan", "123456", 987654321, "juanAdmin", "clave123",
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
                TipoRol.ADMINISTRADOR, "Pregunta", "juan@gmail.com");
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
     * 
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

    /**
     * Test que clasifica los vehiculos en su categoria
     * (hibrido,electrico,combustible) con el fin de separarlos en la interfaz
     */
    @Test
    public void testClasificarVehiculosPorTipo() {

        LinkedList<Vehiculo> vehiculos = new LinkedList<>();
        vehiculos.add(new VehiculoHibrido(1, null, "Toyota Prius", false, null, 0, 0, 0, 0, 0, null, 0, false));
        vehiculos.add(new VehiculoElectrico(2, null, "Tesla Model 3", false, null, 0, 0, 0, 0, 0, 0, 0));
        vehiculos.add(new VehiculoCombustible(3, null, "Ford Fiesta", false, null, 0, 0, 0, 0, 0, null));
        vehiculos.add(new VehiculoHibrido(4, null, "Honda Insight", false, null, 0, 0, 0, 0, 0, null, 0, false));
        vehiculos.add(new VehiculoCombustible(5, null, "Chevrolet Cruze", false, null, 0, 0, 0, 0, 0, null));
        vehiculos.add(new VehiculoElectrico(6, null, "Nissan Leaf", false, null, 0, 0, 0, 0, 0, 0, 0));

        Sede sede = new Sede("principal", "Cra 10", "armenia", "556a4");
        sede.setVehiculos(vehiculos);

        Map<String, List<Vehiculo>> clasificacion = sede.clasificarVehiculosPorTipo();

        assertEquals(2, clasificacion.get("Híbridos").size(), "Debe haber 2 vehículos híbridos");
        assertEquals(2, clasificacion.get("Eléctricos").size(), "Debe haber 2 vehículos eléctricos");
        assertEquals(2, clasificacion.get("Combustión").size(), "Debe haber 2 vehículos de combustión");

        assertTrue(clasificacion.get("Híbridos").stream().allMatch(v -> v instanceof VehiculoHibrido),
                "Todos deben ser híbridos");
        assertTrue(clasificacion.get("Eléctricos").stream().allMatch(v -> v instanceof VehiculoElectrico),
                "Todos deben ser eléctricos");
        assertTrue(clasificacion.get("Combustión").stream().allMatch(v -> v instanceof VehiculoCombustible),
                "Todos deben ser de combustión");
    }

    /**
     * Test para el metodo de recuperacion de contraseña
     */
    @Test
    public void testRecuperarContraseñaAdministrador() {

        Administrador administrador = new Administrador("admin", "1234", 12345, "Seguridad", "respuestaSegura",
                TipoRol.ADMINISTRADOR, "palabra", "admin@");
        administrador.setClave("contraseñaAdmin123");

        Sede sede = new Sede("principal", "direccion", "ciudad", "codigoSede123");
        administrador.setSede(sede);
        sede.setAdministrador(administrador);

        String respuestaPalabra = "palabra";
        String respuestaCodigoSeguridadSede = "codigoSede123";
        String resultado = sede.recuperarContraseñaAdministrador(respuestaPalabra, respuestaCodigoSeguridadSede);
        assertEquals("Hola administrador tu contraseña es: contraseñaAdmin123", resultado, "La contraseña no coincide");

        IllegalArgumentException excepcionPalabra = assertThrows(IllegalArgumentException.class, () -> {
            sede.recuperarContraseñaAdministrador("respuestaIncorrecta", respuestaCodigoSeguridadSede);
        });
        assertEquals("Palabra de seguridad incorrecta", excepcionPalabra.getMessage(),
                "El mensaje de la excepción no coincide");

        IllegalArgumentException excepcionCodigo = assertThrows(IllegalArgumentException.class, () -> {
            sede.recuperarContraseñaAdministrador(respuestaPalabra, "codigoIncorrecto");
        });
        assertEquals("Codigo de sede incorrecto", excepcionCodigo.getMessage(),
                "El mensaje de la excepción no coincide");

        IllegalArgumentException excepcionAmbas = assertThrows(IllegalArgumentException.class, () -> {
            sede.recuperarContraseñaAdministrador("respuestaIncorrecta", "codigoIncorrecto");
        });
        assertEquals("Palabra de seguridad incorrecta", excepcionAmbas.getMessage(),
                "El mensaje de la excepción no coincide");
    }
}