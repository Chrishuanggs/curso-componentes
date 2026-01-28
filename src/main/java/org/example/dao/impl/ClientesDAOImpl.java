package org.example.dao.impl;

import org.example.dao.ClientesDAO;
import org.example.models.Clientes;
import org.example.exceptions.*;
import java.util.*;

/**
 * Implementación en memoria del DAO de Clientes usando HashMap
 */
public class ClientesDAOImpl implements ClientesDAO {

    private final Map<String, Clientes> clientes;

    public ClientesDAOImpl() {
        this.clientes = new HashMap<>();
    }

    @Override
    public void crear(Clientes cliente) throws DuplicateEntityException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public Clientes buscarPorId(String id) throws EntityNotFoundException {
        // TODO: Implementar
        return null;
    }

    @Override
    public List<Clientes> buscarTodos() {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public void actualizar(Clientes cliente) throws EntityNotFoundException, InvalidDataException {
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
    public List<Clientes> buscarPorNombre(String nombre) {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public List<Clientes> buscarActivos() {
        // TODO: Implementar
        return new ArrayList<>();
    }

    @Override
    public List<Clientes> buscarPorUsuario(String usuario) {
        // TODO: Implementar
        return new ArrayList<>();
    }
}