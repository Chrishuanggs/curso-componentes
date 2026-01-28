package org.example.view;

import java.util.Scanner;

/**
 * Menú principal del sistema
 */
public class MenuPrincipal {

    private final Scanner scanner;
    private final MenuCursos menuCursos;
    private final MenuGrupos menuGrupos;
    private final MenuClientes menuClientes;

    public MenuPrincipal(MenuCursos menuCursos, MenuGrupos menuGrupos, MenuClientes menuClientes) {
        this.scanner = new Scanner(System.in);
        this.menuCursos = menuCursos;
        this.menuGrupos = menuGrupos;
        this.menuClientes = menuClientes;
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
        System.out.println("\n" + "=".repeat(50));
        System.out.println("     SISTEMA DE GESTIÓN DE CURSOS");
        System.out.println("=".repeat(50));
        System.out.println("1. Gestión de Cursos");
        System.out.println("2. Gestión de Grupos");
        System.out.println("3. Gestión de Clientes");
        System.out.println("0. Salir");
        System.out.println("=".repeat(50));
        System.out.print("Seleccione una opción: ");
    }

    private int leerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar buffer
            return -1;
        }
    }

    private void procesarOpcion(int opcion) {
        scanner.nextLine(); // Limpiar buffer
        switch (opcion) {
            case 1:
                // TODO: Llamar menuCursos.mostrar();
                break;
            case 2:
                // TODO: Llamar menuGrupos.mostrar();
                break;
            case 3:
                // TODO: Llamar menuClientes.mostrar();
                break;
            case 0:
                System.out.println("\n¡Hasta luego!");
                break;
            default:
                System.out.println("\nOpción inválida. Intente nuevamente.");
        }
    }
}