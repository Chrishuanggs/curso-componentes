package org.example.service.impl;

import org.example.service.GrupoService;
import org.example.dao.GrupoDAO;
import org.example.models.Grupo;
import org.example.exceptions.*;
import org.example.util.Validador;
import java.util.List;

/**
 * Implementación del servicio de Grupo
 */
public class GrupoServiceImpl implements GrupoService {

    private final GrupoDAO grupoDAO;

    public GrupoServiceImpl(GrupoDAO grupoDAO) {
        this.grupoDAO = grupoDAO;
    }

    @Override
    public void crearGrupo(Grupo grupo) throws DuplicateEntityException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public Grupo obtenerGrupoPorId(String id) throws EntityNotFoundException {
        // TODO: Implementar
        return null;
    }

    @Override
    public List<Grupo> obtenerTodosGrupos() {
        // TODO: Implementar
        return null;
    }

    @Override
    public void actualizarGrupo(Grupo grupo) throws EntityNotFoundException, InvalidDataException {
        // TODO: Implementar
    }

    @Override
    public void eliminarGrupo(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public List<Grupo> obtenerGruposActivos() {
        // TODO: Implementar
        return null;
    }

    @Override
    public void activarGrupo(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public void desactivarGrupo(String id) throws EntityNotFoundException {
        // TODO: Implementar
    }

    @Override
    public int contarGrupos() {
        // TODO: Implementar
        return 0;
    }

    @Override
    public boolean validarDatosGrupo(Grupo grupo) {
        // TODO: Implementar
        return false;
    }
}