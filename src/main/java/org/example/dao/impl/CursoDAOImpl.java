package org.example.dao.impl;

import org.example.dao.CursoDAO;
import org.example.models.Curso;
import org.example.exceptions.*;
import java.util.*;

/**
 * Implementación en memoria del DAO de Curso usando HashMap
 */
public class CursoDAOImpl implements CursoDAO {

    private final Map<String, Curso> cursos;

    public CursoDAOImpl() {
        this.cursos = new HashMap<>();
    }

    @Override
    public void crear(Curso curso) throws DuplicateEntityException, InvalidDataException {
        // TODO: Implementar validaciones
        // TODO: Verificar duplicados
        // TODO: Guardar en el HashMap
    }

    @Override
    public Curso buscarPorId(String id) throws EntityNotFoundException {
        // TODO: Implementar búsqueda
        return null;
    }

    @Override
    public List<Curso> buscarTodos() {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public void actualizar(Curso curso) throws EntityNotFoundException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public void eliminar(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public boolean existe(String id) {
        // TODO: Implementar
        return false;
    }

    @Override
    public List<Curso> buscarPorUsuario(String usuario) {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public List<Curso> buscarPorNombre(String nombre) {
        // TODO: Implementar
        return new ArrayList<>();
    }
}