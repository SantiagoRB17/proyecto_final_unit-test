package co.edu.uniquindio.poo;

/**
 * Representa a un cliente que hereda de la clase `Persona`. Esta clase contiene los datos
 * específicos de un cliente, como su dirección y correo electrónico.
 */
public class Cliente extends Persona {

    /**
     * Atributo que almacena la dirección del cliente.
     */
    private String direccion;

    /**
     * Atributo que almacena el correo electrónico del cliente.
     */
    private String correo;

    /**
     * Constructor de la clase `Cliente` que inicializa los atributos del cliente, incluyendo 
     * los atributos heredados de la clase `Persona`.
     * 
     * @param nombre El nombre del cliente.
     * @param cedula La cédula del cliente.
     * @param telefono El número de teléfono del cliente.
     * @param direccion La dirección del cliente.
     * @param correo El correo electrónico del cliente.
     */
    public Cliente(String nombre, String cedula, long telefono, String direccion, String correo) {
        super(nombre, cedula, telefono);
        this.direccion = direccion;
        this.correo = correo;
    }

    /**
     * Obtiene la dirección del cliente.
     * 
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     * 
     * @param direccion La dirección a asignar al cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param correo El correo electrónico a asignar al cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}