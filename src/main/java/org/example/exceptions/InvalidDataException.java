package org.example.exceptions;

/**
 * Excepción lanzada cuando los datos proporcionados son inválidos
 */
public class InvalidDataException extends Exception {

    public InvalidDataException(String mensaje) {
        super(mensaje);
    }

    public InvalidDataException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}