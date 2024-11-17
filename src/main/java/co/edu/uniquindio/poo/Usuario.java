package co.edu.uniquindio.poo;


public class Usuario extends Persona {
   
    private String usuario;
    private String clave;
    protected TipoRol rol;


 /**
     * Constructor de la clase Usuario.
     *
     * @param nombre el nombre del usuario
     * @param cedula la cédula del usuario
     * @param telefono el número de teléfono del usuario
     * @param usuario el nombre de usuario para autenticación
     * @param clave la contraseña del usuario
     * @param rol el rol asignado al usuario
     */
    public Usuario(String nombre, String cedula, long telefono, String usuario, String clave, TipoRol rol) {
        super(nombre, cedula, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }


    /**
     * Obtiene el nombre de usuario.
     *
     * @return el nombre de usuario
     */
    public String getUsuario() {
        return usuario;
    }


    /**
     * Establece el nombre de usuario.
     *
     * @param usuario el nuevo nombre de usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    /**
     * Obtiene la clave del usuario.
     *
     * @return la clave del usuario
     */
    public String getClave() {
        return clave;
    }


    /**
     * Establece la clave del usuario.
     *
     * @param clave la nueva clave del usuario
     */
    public void setClave(String clave) {
        this.clave = clave;
    }


    /**
     * Obtiene el rol asignado al usuario.
     *
     * @return el rol del usuario
     */
    public TipoRol getRol() {
        return rol;
    }


    /**
     * Establece el rol del usuario.
     *
     * @param rol el nuevo rol del usuario
     */
    public void setRol(TipoRol rol) {
        this.rol = rol;
    }
}
