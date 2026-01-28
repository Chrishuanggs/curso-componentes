package org.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representa un curso ofrecido en el sistema.
 * Un curso puede tener múltiples grupos asociados.
 */
public class Curso {
    // Atributos
    private String id;
    private String nombre;
    private String descripcion;
    private String tiempo;
    private String usuario;
    private List<Grupo> grupos; // Relación: Un curso TIENE muchos grupos

    // Constructor vacío
    public Curso() {
        this.grupos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Curso(String id, String nombre, String descripcion, String tiempo, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.usuario = usuario;
        this.grupos = new ArrayList<>();
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    // Métodos para gestionar la relación con Grupos
    /**
     * Agrega un grupo al curso
     * @param grupo El grupo a agregar
     * @return true si se agregó exitosamente, false si ya existía
     */
    public boolean agregarGrupo(Grupo grupo) {
        if (grupo != null && !grupos.contains(grupo)) {
            grupos.add(grupo);
            return true;
        }
        return false;
    }

    /**
     * Elimina un grupo del curso
     * @param grupo El grupo a eliminar
     * @return true si se eliminó exitosamente
     */
    public boolean eliminarGrupo(Grupo grupo) {
        return grupos.remove(grupo);
    }

    /**
     * Busca un grupo por su ID
     * @param idGrupo ID del grupo a buscar
     * @return El grupo encontrado o null
     */
    public Grupo buscarGrupoPorId(String idGrupo) {
        for (Grupo grupo : grupos) {
            if (grupo.getId().equals(idGrupo)) {
                return grupo;
            }
        }
        return null;
    }

    /**
     * Obtiene la cantidad de grupos en el curso
     * @return Número de grupos
     */
    public int getCantidadGrupos() {
        return grupos.size();
    }

    /**
     * Obtiene todos los grupos activos
     * @return Lista de grupos activos
     */
    public List<Grupo> getGruposActivos() {
        List<Grupo> activos = new ArrayList<>();
        for (Grupo grupo : grupos) {
            if (grupo.isActivo()) {
                activos.add(grupo);
            }
        }
        return activos;
    }

    /**
     * Obtiene el total de clientes matriculados en todos los grupos
     * @return Total de clientes
     */
    public int getTotalClientes() {
        int total = 0;
        for (Grupo grupo : grupos) {
            total += grupo.getCantidadClientes();
        }
        return total;
    }

    // toString
    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tiempo='" + tiempo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", cantidadGrupos=" + grupos.size() +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Curso curso = (Curso) obj;
        return Objects.equals(id, curso.id);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}