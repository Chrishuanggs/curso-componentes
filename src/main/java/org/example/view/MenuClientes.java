package org.example.view;

import org.example.controller.ClientesController;
import org.example.models.Clientes;
import java.util.Scanner;

/**
 * Menú para gestión de Clientes
 */
public class MenuClientes {

    private final Scanner scanner;
    private final ClientesController controller;

    public MenuClientes(ClientesController controller) {
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
        System.out.println("\n--- GESTIÓN DE CLIENTES ---");
        System.out.println("1. Crear cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Actualizar cliente");
        System.out.println("5. Eliminar cliente");
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
        System.out.println("TODO: Implementar operaciones de clientes");
    }
}