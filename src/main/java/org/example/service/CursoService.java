package org.example.service;

import org.example.models.Curso;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz de servicio para lógica de negocio de Curso
 */
public interface CursoService {

    void crearCurso(Curso curso) throws DuplicateEntityException, InvalidDataException;

    Curso obtenerCursoPorId(String id) throws EntityNotFoundException;

    List<Curso> obtenerTodosCursos();

    void actualizarCurso(Curso curso) throws EntityNotFoundException, InvalidDataException;

    void eliminarCurso(String id) throws EntityNotFoundException;

    List<Curso> buscarCursosPorUsuario(String usuario);

    List<Curso> buscarCursosPorNombre(String nombre);

    int contarCursos();

    boolean validarDatosCurso(Curso curso);
}