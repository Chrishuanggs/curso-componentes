package org.example.view;

import org.example.controller.GrupoController;
import org.example.models.Grupo;
import java.util.Scanner;

/**
 * Menú para gestión de Grupos
 */
public class MenuGrupos {

    private final Scanner scanner;
    private final GrupoController controller;

    public MenuGrupos(GrupoController controller) {
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
        System.out.println("\n--- GESTIÓN DE GRUPOS ---");
        System.out.println("1. Crear grupo");
        System.out.println("2. Listar grupos");
        System.out.println("3. Buscar grupo");
        System.out.println("4. Actualizar grupo");
        System.out.println("5. Eliminar grupo");
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
        scanner.nextLine();
        // TODO: Implementar switch similar a MenuCursos
        System.out.println("TODO: Implementar operaciones de grupos");
    }
}