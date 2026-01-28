package org.example.service;

import org.example.models.Clientes;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz de servicio para lógica de negocio de Clientes
 */
public interface ClientesService {

    void crearCliente(Clientes cliente) throws DuplicateEntityException, InvalidDataException;

    Clientes obtenerClientePorId(String id) throws EntityNotFoundException;

    List<Clientes> obtenerTodosClientes();

    void actualizarCliente(Clientes cliente) throws EntityNotFoundException, InvalidDataException;

    void eliminarCliente(String id) throws EntityNotFoundException;

    List<Clientes> obtenerClientesActivos();

    void activarCliente(String id) throws EntityNotFoundException;

    void desactivarCliente(String id) throws EntityNotFoundException;

    List<Clientes> buscarClientesPorNombre(String nombre);

    int contarClientes();

    boolean validarDatosCliente(Clientes cliente);
}