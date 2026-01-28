package org.example.exceptions;

/**
 * Excepción lanzada cuando no se encuentra una entidad
 */
public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String mensaje) {
        super(mensaje);
    }

    public EntityNotFoundException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}