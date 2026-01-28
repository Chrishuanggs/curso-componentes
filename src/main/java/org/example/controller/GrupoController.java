package org.example.controller;

import org.example.service.GrupoService;
import org.example.models.Grupo;
import org.example.exceptions.*;
import org.example.util.Mensajes;
import java.util.List;

/**
 * Controlador para operaciones de Grupo
 */
public class GrupoController {

    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    public void crearGrupo(Grupo grupo) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.CREADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Grupo", e.getMessage()));
        }
    }

    public Grupo obtenerGrupo(String id) {
        try {
            // TODO: Llamar al servicio
            return null;
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Grupo", e.getMessage()));
            return null;
        }
    }

    public List<Grupo> listarGrupos() {
        // TODO: Llamar al servicio
        return null;
    }

    public void actualizarGrupo(Grupo grupo) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ACTUALIZADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Grupo", e.getMessage()));
        }
    }

    public void eliminarGrupo(String id) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ELIMINADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Grupo", e.getMessage()));
        }
    }
}