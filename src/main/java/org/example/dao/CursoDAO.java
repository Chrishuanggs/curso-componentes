package org.example.dao;

import org.example.models.Curso;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz para operaciones CRUD de Curso
 */
public interface CursoDAO {

    void crear(Curso curso) throws DuplicateEntityException, InvalidDataException;

    Curso buscarPorId(String id) throws EntityNotFoundException;

    List<Curso> buscarTodos();

    void actualizar(Curso curso) throws EntityNotFoundException, InvalidDataException;

    void eliminar(String id) throws EntityNotFoundException;

    boolean existe(String id);

    List<Curso> buscarPorUsuario(String usuario);

    List<Curso> buscarPorNombre(String nombre);
}