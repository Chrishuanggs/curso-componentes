package org.example.controller;

import org.example.service.ClientesService;
import org.example.models.Clientes;
import org.example.exceptions.*;
import org.example.util.Mensajes;
import java.util.List;

/**
 * Controlador para operaciones de Clientes
 */
public class ClientesController {

    private final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    public void crearCliente(Clientes cliente) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.CREADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Cliente", e.getMessage()));
        }
    }

    public Clientes obtenerCliente(String id) {
        try {
            // TODO: Llamar al servicio
            return null;
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Cliente", e.getMessage()));
            return null;
        }
    }

    public List<Clientes> listarClientes() {
        // TODO: Llamar al servicio
        return null;
    }

    public void actualizarCliente(Clientes cliente) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ACTUALIZADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Cliente", e.getMessage()));
        }
    }

    public void eliminarCliente(String id) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ELIMINADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Cliente", e.getMessage()));
        }
    }
}