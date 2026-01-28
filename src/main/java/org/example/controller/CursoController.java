package org.example.controller;

import org.example.service.CursoService;
import org.example.models.Curso;
import org.example.exceptions.*;
import org.example.util.Mensajes;
import java.util.List;

/**
 * Controlador para operaciones de Curso
 */
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public void crearCurso(Curso curso) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.CREADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Curso", e.getMessage()));
        }
    }

    public Curso obtenerCurso(String id) {
        try {
            // TODO: Llamar al servicio
            return null;
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Curso", e.getMessage()));
            return null;
        }
    }

    public List<Curso> listarCursos() {
        // TODO: Llamar al servicio
        return null;
    }

    public void actualizarCurso(Curso curso) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ACTUALIZADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Curso", e.getMessage()));
        }
    }

    public void eliminarCurso(String id) {
        try {
            // TODO: Llamar al servicio
            System.out.println(Mensajes.ELIMINADO_EXITOSO);
        } catch (Exception e) {
            System.out.println(Mensajes.formatearError("Curso", e.getMessage()));
        }
    }
}