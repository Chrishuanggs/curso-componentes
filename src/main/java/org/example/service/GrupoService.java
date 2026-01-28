package org.example.service;

import org.example.models.Grupo;
import org.example.exceptions.*;
import java.util.List;

/**
 * Interfaz de servicio para lógica de negocio de Grupo
 */
public interface GrupoService {

    void crearGrupo(Grupo grupo) throws DuplicateEntityException, InvalidDataException;

    Grupo obtenerGrupoPorId(String id) throws EntityNotFoundException;

    List<Grupo> obtenerTodosGrupos();

    void actualizarGrupo(Grupo grupo) throws EntityNotFoundException, InvalidDataException;

    void eliminarGrupo(String id) throws EntityNotFoundException;

    List<Grupo> obtenerGruposActivos();

    void activarGrupo(String id) throws EntityNotFoundException;

    void desactivarGrupo(String id) throws EntityNotFoundException;

    int contarGrupos();

    boolean validarDatosGrupo(Grupo grupo);
}