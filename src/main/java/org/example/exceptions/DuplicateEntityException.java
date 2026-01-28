package org.example.exceptions;

/**
 * Excepción lanzada cuando se intenta crear una entidad duplicada
 */
public class DuplicateEntityException extends Exception {

    public DuplicateEntityException(String mensaje) {
        super(mensaje);
    }

    public DuplicateEntityException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}