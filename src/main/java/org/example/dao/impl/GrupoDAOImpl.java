package org.example.dao.impl;

import org.example.dao.GrupoDAO;
import org.example.models.Grupo;
import org.example.exceptions.*;
import java.util.*;

/**
 * Implementación en memoria del DAO de Grupo usando HashMap
 */
public class GrupoDAOImpl implements GrupoDAO {

    private final Map<String, Grupo> grupos;

    public GrupoDAOImpl() {
        this.grupos = new HashMap<>();
    }

    @Override
    public void crear(Grupo grupo) throws DuplicateEntityException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public Grupo buscarPorId(String id) throws EntityNotFoundException {
        // TODO: Implementar
        return null;
    }

    @Override
    public List<Grupo> buscarTodos() {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public void actualizar(Grupo grupo) throws EntityNotFoundException, InvalidDataException {
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
    public List<Grupo> buscarPorEstado(String estado) {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public List<Grupo> buscarActivos() {
        // TODO: Implementar
        return new ArrayList<>();
    }
}