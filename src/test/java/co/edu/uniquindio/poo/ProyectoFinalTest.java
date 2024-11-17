/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el concesionario.
 */
public class ProyectoFinalTest {
    private static final Logger LOG = Logger.getLogger(ProyectoFinalTest.class.getName());

    @Test
    public void testAsignarAdministradorSede() {
        LOG.info("Iniciado test");

        Concesionario concesionario = new Concesionario("Tu Carro UQ");
        Administrador administrador1 = new Administrador("Santiago Bernal", "1092457", 123456, "Santiagoob", "457890N", "Lucas"); 
        Administrador administrador2 = new Administrador("Veronica Mendoza", "123456", 987654, "VeroM", "897654X", "Miguel");
        Sede sede = new Sede ("Sede Principal", "Cra 24#35-23", "Armenia", "6757a");
        
        concesionario.agregarAdministrador(administrador1);

        concesionario.agregarAdministrador(administrador2);

        sede.setAdministrador(administrador1);

        LOG.info(sede.toString());

        concesionario.cambiarAdministradorSede("123456", sede);

        LOG.info(sede.toString());

        assertEquals("Veronica Mendoza", sede.getAdministrador().getNombre());
        LOG.info("Finalizando test");
    }
}
