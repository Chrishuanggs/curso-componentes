package org.example.util;

/**
 * Clase para centralizar mensajes del sistema
 */
public class Mensajes {

    // Mensajes de éxito
    public static final String CREADO_EXITOSO = "Creado exitosamente";
    public static final String ACTUALIZADO_EXITOSO = "Actualizado exitosamente";
    public static final String ELIMINADO_EXITOSO = "Eliminado exitosamente";

    // Mensajes de error
    public static final String ERROR_ID_NULO = "El ID no puede ser nulo o vacío";
    public static final String ERROR_DATOS_INVALIDOS = "Los datos proporcionados son inválidos";
    public static final String ERROR_NO_ENCONTRADO = "No se encontró el registro";
    public static final String ERROR_DUPLICADO = "Ya existe un registro con ese ID";

    // Mensajes de menú
    public static final String MENU_PRINCIPAL = "=== MENÚ PRINCIPAL ===";
    public static final String OPCION_INVALIDA = "Opción inválida. Intente nuevamente.";
    public static final String SALIR = "Saliendo del sistema...";

    /**
     * Formatea un mensaje de error con contexto
     */
    public static String formatearError(String entidad, String mensaje) {
        return String.format("[ERROR - %s] %s", entidad, mensaje);
    }

    /**
     * Formatea un mensaje de éxito con contexto
     */
    public static String formatearExito(String entidad, String mensaje) {
        return String.format("[ÉXITO - %s] %s", entidad, mensaje);
    }
}