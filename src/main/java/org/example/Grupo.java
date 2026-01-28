package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representa un grupo asociado a un curso.
 * Un grupo puede tener múltiples clientes matriculados.
 */
public class Grupo {
    // Atributos
    private String id;
    private String nombre;
    private String estado;
    private List<Clientes> clientes; // Relación: Un grupo INCLUYE muchos clientes

    // Constructor vacío
    public Grupo() {
        this.clientes = new ArrayList<>();
    }

    // Constructor con parámetros
    public Grupo(String id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.clientes = new ArrayList<>();
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    // Métodos relacionados con el estado
    /**
     * Verifica si el grupo está activo
     * @return true si está activo
     */
    public boolean isActivo() {
        return "Activo".equalsIgnoreCase(estado) || "1".equals(estado);
    }

    /**
     * Activa el grupo
     */
    public void activar() {
        this.estado = "Activo";
    }

    /**
     * Desactiva el grupo
     */
    public void desactivar() {
        this.estado = "Inactivo";
    }

    // Métodos para gestionar la relación con Clientes
    /**
     * Agrega un cliente al grupo
     * @param cliente El cliente a agregar
     * @return true si se agregó exitosamente, false si ya existía
     */
    public boolean agregarCliente(Clientes cliente) {
        if (cliente != null && !clientes.contains(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    /**
     * Elimina un cliente del grupo
     * @param cliente El cliente a eliminar
     * @return true si se eliminó exitosamente
     */
    public boolean eliminarCliente(Clientes cliente) {
        return clientes.remove(cliente);
    }

    /**
     * Busca un cliente por su ID
     * @param idCliente ID del cliente a buscar
     * @return El cliente encontrado o null
     */
    public Clientes buscarClientePorId(String idCliente) {
        for (Clientes cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Obtiene la cantidad de clientes en el grupo
     * @return Número de clientes
     */
    public int getCantidadClientes() {
        return clientes.size();
    }

    /**
     * Obtiene todos los clientes activos
     * @return Lista de clientes activos
     */
    public List<Clientes> getClientesActivos() {
        List<Clientes> activos = new ArrayList<>();
        for (Clientes cliente : clientes) {
            if (cliente.isActivo()) {
                activos.add(cliente);
            }
        }
        return activos;
    }

    /**
     * Obtiene todos los clientes inactivos
     * @return Lista de clientes inactivos
     */
    public List<Clientes> getClientesInactivos() {
        List<Clientes> inactivos = new ArrayList<>();
        for (Clientes cliente : clientes) {
            if (!cliente.isActivo()) {
                inactivos.add(cliente);
            }
        }
        return inactivos;
    }

    // toString
    @Override
    public String toString() {
        return "Grupo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", cantidadClientes=" + clientes.size() +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Grupo grupo = (Grupo) obj;
        return Objects.equals(id, grupo.id);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}