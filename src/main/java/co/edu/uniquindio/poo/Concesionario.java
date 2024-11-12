package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private LinkedList<Sede> sedes;
    private LinkedList<Administrador> administradores;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.sedes = new LinkedList<>();
        this.administradores = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(LinkedList<Sede> sedes) {
        this.sedes = sedes;
    }

    public LinkedList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(LinkedList<Administrador> administradores) {
        this.administradores = administradores;
    }


}
