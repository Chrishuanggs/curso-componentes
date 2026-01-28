package org.example.service.impl;

import org.example.service.CursoService;
import org.example.dao.CursoDAO;
import org.example.models.Curso;
import org.example.exceptions.*;
import org.example.util.Validador;
import java.util.List;

/**
 * Implementación del servicio de Curso
 */
public class CursoServiceImpl implements CursoService {

    private final CursoDAO cursoDAO;

    public CursoServiceImpl(CursoDAO cursoDAO) {
        this.cursoDAO = cursoDAO;
    }

    @Override
    public void crearCurso(Curso curso) throws DuplicateEntityException, InvalidDataException {
        // TODO: Validar datos del curso
        // TODO: Llamar al DAO para crear
    }

    @Override
    public Curso obtenerCursoPorId(String id) throws EntityNotFoundException {
        // TODO: Validar ID
        // TODO: Llamar al DAO
        return null;
    }

    @Override
    public List<Curso> obtenerTodosCursos() {
        // TODO: Llamar al DAO
        return null;
    }

    @Override
    public void actualizarCurso(Curso curso) throws EntityNotFoundException, InvalidDataException {
        // TODO: Validar datos
        // TODO: Llamar al DAO
    }

    @Override
    public void eliminarCurso(String id) throws EntityNotFoundException {
        // TODO: Validar que no tenga grupos asociados
        // TODO: Llamar al DAO
    }

    @Override
    public List<Curso> buscarCursosPorUsuario(String usuario) {
        // TODO: Implementar
        return null;
    }

    @Override
    public List<Curso> buscarCursosPorNombre(String nombre) {
        // TODO: Implementar
        return null;
    }

    @Override
    public int contarCursos() {
        // TODO: Implementar
        return 0;
    }

    @Override
    public boolean validarDatosCurso(Curso curso) {
        // TODO: Validar todos los campos
        return false;
    }
}