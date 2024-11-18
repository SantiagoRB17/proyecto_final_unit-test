package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Concesionario {
    /**
 * Atributos de la clase Concesionario
 */
    private String nombre;
    private static final String contrasena = "22N35";
    private LinkedList<Sede> sedes;
    private LinkedList<Administrador> administradores;

    /**
     * Constructor que inicializa el nombre del concesionario y las listas de sedes
     * y administradores.
     * 
     * @param nombre nombre del concesionario
     */

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.sedes = new LinkedList<>();
        this.administradores = new LinkedList<>();
    }

    /**
     * Método que obtiene el nombre del concesionario.
     * 
     * @return nombre del concesionario
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del concesionario.
     * 
     * @param nombre nombre a establecer al concesionario
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la lista de sedes del concesionario.
     * 
     * @return lista de sedes
     */

    public LinkedList<Sede> getSedes() {
        return sedes;
    }

    /**
     * Método que establece la lista de sedes del concesionario.
     * 
     * @param sedes lista de sedes a establecer
     */

    public void setSedes(LinkedList<Sede> sedes) {
        this.sedes = sedes;
    }

    /**
     * Método que obtiene la lista de administradores del concesionario.
     * 
     * @return lista de administradores
     */

    public LinkedList<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * Método que establece la lista de administradores del concesionario.
     * 
     * @param administradores lista de administradores a establecer
     */
    public void setAdministradores(LinkedList<Administrador> administradores) {
        this.administradores = administradores;
    }

    /**
     * Método para verificar si el administrador se encuentra en la lista de
     * administradores.
     * 
     * @param cedula cédula del administrador a verificar
     * @return true si se encuentra en la lista, false si no es asi
     */
    public boolean verificarAdministrador(String cedula) {
        boolean centinela = false;
        for (Administrador administrador : administradores) {
            if (administrador.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método que permite agregar administradores al concesionario
     * 
     * @param administrador administrador a agregar
     */
    public boolean agregarAdministrador(Administrador administrador) {
        boolean centinela = false;
        if (!verificarAdministrador(administrador.getCedula())) {
            administradores.add(administrador);
            centinela = true;
        }
        else{
            throw new IllegalArgumentException("El administrador ya existe");
        }
        return centinela;
    }

    /**
     * Método que verifica si una sede se encuentra en la lista de sedes.
     * 
     * @param direccion dirección de la sede a verificar
     * @return
     */
    public boolean verificarSede(String direccion) {
        boolean centinela = false;
        for (Sede sede : sedes) {
            if (sede.getDireccion().equals(direccion)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método que permite agregar una sede a la lista de sedes
     * 
     * @param sede
     */
    public boolean agregarSedes(Sede sede) {
        boolean centinela = false;
        if (!verificarSede(sede.getDireccion())) {
            sedes.add(sede);
            centinela = true;
        }
        else{
            throw new IllegalArgumentException("Esta sede ya existe");
        }
        return centinela;
    }

    /**
     * Método que permite asignar un nuevo administrador a otra sede.
     * @param cedula cedula del administrador que se va asginar a la sede
     * @param sede sede que a la cual se le va asignar el administrador
     */
    public boolean cambiarAdministradorSede(String cedula, Sede sede) throws ExcepcionSedeOcupada{
        boolean centinela = false;
        for (Administrador administrador : administradores) {
            if (administrador.getCedula().equals(cedula)) {
                centinela = true;
                if (sede.getAdministrador() != null && sede.getAdministrador().equals(administrador)) {
                    throw new ExcepcionSedeOcupada ("El administrador ya está asignado a esta sede.");
                }
                sede.setAdministrador(administrador);
                break;
            }
        }
        if(!centinela){
            throw new IllegalArgumentException ("El administrador no existe");
        }
        return centinela;
    }

    /**
     * Método to string que permite mostrar los datos de la clase concesionario
     */
    @Override
    public String toString() {
        return "Concesionario: nombre=" + nombre + ", sedes=" + sedes + ", administradores=" + administradores;
    }
}
