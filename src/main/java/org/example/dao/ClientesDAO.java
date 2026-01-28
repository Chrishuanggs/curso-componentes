package org.example.dao;

import org.example.models.Clientes;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz para operaciones CRUD de Clientes
 */
public interface ClientesDAO {

    void crear(Clientes cliente) throws DuplicateEntityException, InvalidDataException;

    Clientes buscarPorId(String id) throws EntityNotFoundException;

    List<Clientes> buscarTodos();

    void actualizar(Clientes cliente) throws EntityNotFoundException, InvalidDataException;

    void eliminar(String id) throws EntityNotFoundException;

    boolean existe(String id);

    List<Clientes> buscarPorNombre(String nombre);

    List<Clientes> buscarActivos();

    List<Clientes> buscarPorUsuario(String usuario);
}