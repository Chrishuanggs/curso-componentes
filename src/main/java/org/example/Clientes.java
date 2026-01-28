package org.example;

import java.util.Objects;

/**
 * Representa un cliente relacionado con un grupo o curso.
 */
public class Clientes {
    // Atributos
    private String id;
    private String nombre;
    private String apellidos;
    private String estado;
    private String usuario;

    // Constructor vacío
    public Clientes() {
    }

    // Constructor con parámetros
    public Clientes(String id, String nombre, String apellidos, String estado, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
        this.usuario = usuario;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Métodos adicionales
    /**
     * Obtiene el nombre completo del cliente
     * @return Nombre y apellidos concatenados
     */
    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    /**
     * Verifica si el cliente está activo
     * @return true si está activo
     */
    public boolean isActivo() {
        return "Activo".equalsIgnoreCase(estado) || "1".equals(estado);
    }

    /**
     * Activa el cliente
     */
    public void activar() {
        this.estado = "1";
    }

    /**
     * Desactiva el cliente
     */
    public void desactivar() {
        this.estado = "0";
    }

    // toString
    @Override
    public String toString() {
        return "Clientes{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estado='" + estado + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clientes clientes = (Clientes) obj;
        return Objects.equals(id, clientes.id);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}