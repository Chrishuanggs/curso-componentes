package org.example.dao;

import org.example.models.Grupo;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz para operaciones CRUD de Grupo
 */
public interface GrupoDAO {

    void crear(Grupo grupo) throws DuplicateEntityException, InvalidDataException;

    Grupo buscarPorId(String id) throws EntityNotFoundException;

    List<Grupo> buscarTodos();

    void actualizar(Grupo grupo) throws EntityNotFoundException, InvalidDataException;

    void eliminar(String id) throws EntityNotFoundException;

    boolean existe(String id);

    List<Grupo> buscarPorEstado(String estado);

    List<Grupo> buscarActivos();
}