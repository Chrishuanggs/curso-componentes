package org.example.service.impl;

import org.example.service.ClientesService;
import org.example.dao.ClientesDAO;
import org.example.models.Clientes;
import org.example.exceptions.*;
import org.example.util.Validador;
import java.util.List;

/**
 * Implementación del servicio de Clientes
 */
public class ClientesServiceImpl implements ClientesService {

    private final ClientesDAO clientesDAO;

    public ClientesServiceImpl(ClientesDAO clientesDAO) {
        this.clientesDAO = clientesDAO;
    }

    @Override
    public void crearCliente(Clientes cliente) throws DuplicateEntityException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public Clientes obtenerClientePorId(String id) throws EntityNotFoundException {
        // TODO: Implementar
        return null;
    }

    @Override
    public List<Clientes> obtenerTodosClientes() {
        // TODO: Implementar
        return null;
    }

    @Override
    public void actualizarCliente(Clientes cliente) throws EntityNotFoundException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public void eliminarCliente(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public List<Clientes> obtenerClientesActivos() {
        // TODO: Implementar
        return null;
    }

    @Override
    public void activarCliente(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public void desactivarCliente(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public List<Clientes> buscarClientesPorNombre(String nombre) {
        // TODO: Implementar
        return null;
    }

    @Override
    public int contarClientes() {
        // TODO: Implementar
        return 0;
    }

    @Override
    public boolean validarDatosCliente(Clientes cliente) {
        // TODO: Implementar
        return false;
    }
}