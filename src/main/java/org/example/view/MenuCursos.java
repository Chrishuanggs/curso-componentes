package org.example.view;

import org.example.controller.CursoController;
import org.example.models.Curso;
import java.util.Scanner;

/**
 * Menú para gestión de Cursos
 */
public class MenuCursos {

    private final Scanner scanner;
    private final CursoController controller;

    public MenuCursos(CursoController controller) {
        this.scanner = new Scanner(System.in);
        this.controller = controller;
    }

    public void mostrar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    private void mostrarOpciones() {
        System.out.println("\n--- GESTIÓN DE CURSOS ---");
        System.out.println("1. Crear curso");
        System.out.println("2. Listar cursos");
        System.out.println("3. Buscar curso");
        System.out.println("4. Actualizar curso");
        System.out.println("5. Eliminar curso");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }

    private int leerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    private void procesarOpcion(int opcion) {
        scanner.nextLine(); // Limpiar buffer
        switch (opcion) {
            case 1:
                crearCurso();
                break;
            case 2:
                listarCursos();
                break;
            case 3:
                buscarCurso();
                break;
            case 4:
                actualizarCurso();
                break;
            case 5:
                eliminarCurso();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    private void crearCurso() {
        // TODO: Solicitar datos y llamar al controller
        System.out.println("TODO: Implementar crear curso");
    }

    private void listarCursos() {
        // TODO: Llamar al controller y mostrar
        System.out.println("TODO: Implementar listar cursos");
    }

    private void buscarCurso() {
        // TODO: Solicitar ID y buscar
        System.out.println("TODO: Implementar buscar curso");
    }

    private void actualizarCurso() {
        // TODO: Solicitar datos y actualizar
        System.out.println("TODO: Implementar actualizar curso");
    }

    private void eliminarCurso() {
        // TODO: Solicitar ID y eliminar
        System.out.println("TODO: Implementar eliminar curso");
    }
}