package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║    SISTEMA DE GESTIÓN DE CURSOS Y GRUPOS             ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        System.out.println();

        // ============================================================
        // 1. CREAR CURSO
        // ============================================================
        System.out.println("━━━ 1. CREACIÓN DEL CURSO ━━━");
        Curso curso1 = new Curso(
                "C001",
                "Programación Orientada a Objetos en Java",
                "Curso completo de POO con Java aplicando encapsulamiento, herencia y polimorfismo",
                "60 horas",
                "profesor.tech@university.edu"
        );
        System.out.println("✓ Curso creado: " + curso1.getNombre());
        System.out.println("  ID: " + curso1.getId());
        System.out.println("  Duración: " + curso1.getTiempo());
        System.out.println();

        // ============================================================
        // 2. CREAR GRUPOS Y AGREGARLOS AL CURSO
        // ============================================================
        System.out.println("━━━ 2. CREACIÓN DE GRUPOS ━━━");
        Grupo grupo1 = new Grupo("G001", "Grupo Matutino A", "Activo");
        Grupo grupo2 = new Grupo("G002", "Grupo Vespertino B", "Activo");
        Grupo grupo3 = new Grupo("G003", "Grupo Sabatino C", "Inactivo");

        // Agregar grupos al curso (relación Curso -> Grupo)
        curso1.agregarGrupo(grupo1);
        curso1.agregarGrupo(grupo2);
        curso1.agregarGrupo(grupo3);

        System.out.println("✓ Grupos agregados al curso:");
        System.out.println("  - " + grupo1.getNombre() + " (" + grupo1.getEstado() + ")");
        System.out.println("  - " + grupo2.getNombre() + " (" + grupo2.getEstado() + ")");
        System.out.println("  - " + grupo3.getNombre() + " (" + grupo3.getEstado() + ")");
        System.out.println("  Total de grupos: " + curso1.getCantidadGrupos());
        System.out.println();

        // ============================================================
        // 3. CREAR CLIENTES Y MATRICULARLOS EN GRUPOS
        // ============================================================
        System.out.println("━━━ 3. MATRICULACIÓN DE CLIENTES ━━━");

        // Clientes para Grupo 1
        Clientes cliente1 = new Clientes("CL001", "Juan Carlos", "Pérez García", "1", "juan.perez@mail.com");
        Clientes cliente2 = new Clientes("CL002", "María Fernanda", "López Rodríguez", "1", "maria.lopez@mail.com");
        Clientes cliente3 = new Clientes("CL003", "Pedro Antonio", "Martínez Silva", "1", "pedro.martinez@mail.com");

        // Clientes para Grupo 2
        Clientes cliente4 = new Clientes("CL004", "Ana Sofía", "González Vargas", "1", "ana.gonzalez@mail.com");
        Clientes cliente5 = new Clientes("CL005", "Luis Miguel", "Ramírez Torres", "0", "luis.ramirez@mail.com");

        // Clientes para Grupo 3
        Clientes cliente6 = new Clientes("CL006", "Carmen Elena", "Díaz Morales", "1", "carmen.diaz@mail.com");

        // Matricular clientes en grupos (relación Grupo -> Clientes)
        grupo1.agregarCliente(cliente1);
        grupo1.agregarCliente(cliente2);
        grupo1.agregarCliente(cliente3);

        grupo2.agregarCliente(cliente4);
        grupo2.agregarCliente(cliente5);

        grupo3.agregarCliente(cliente6);

        System.out.println("✓ Clientes matriculados exitosamente");
        System.out.println();

        // ============================================================
        // 4. MOSTRAR ESTRUCTURA COMPLETA DEL CURSO
        // ============================================================
        System.out.println("━━━ 4. ESTRUCTURA COMPLETA DEL CURSO ━━━");
        System.out.println("Curso: " + curso1.getNombre());
        System.out.println("Total de grupos: " + curso1.getCantidadGrupos());
        System.out.println("Total de clientes: " + curso1.getTotalClientes());
        System.out.println();

        for (Grupo grupo : curso1.getGrupos()) {
            System.out.println("  ┌─ Grupo: " + grupo.getNombre());
            System.out.println("  │  Estado: " + grupo.getEstado());
            System.out.println("  │  Clientes matriculados: " + grupo.getCantidadClientes());
            System.out.println("  │  Clientes activos: " + grupo.getClientesActivos().size());
            System.out.println("  │");

            if (grupo.getCantidadClientes() > 0) {
                System.out.println("  │  Lista de clientes:");
                for (Clientes cliente : grupo.getClientes()) {
                    String status = cliente.isActivo() ? "✓ Activo" : "✗ Inactivo";
                    System.out.println("  │    • " + cliente.getNombreCompleto() + " - " + status);
                    System.out.println("  │      Email: " + cliente.getUsuario());
                }
            }
            System.out.println("  └─────────────────────────────────");
            System.out.println();
        }

        // ============================================================
        // 5. DEMOSTRACIÓN DE FUNCIONALIDADES
        // ============================================================
        System.out.println("━━━ 5. PRUEBAS DE FUNCIONALIDADES ━━━");

        // Buscar un grupo específico
        System.out.println("→ Buscando grupo con ID 'G002'...");
        Grupo grupoEncontrado = curso1.buscarGrupoPorId("G002");
        if (grupoEncontrado != null) {
            System.out.println("  ✓ Grupo encontrado: " + grupoEncontrado.getNombre());
        }
        System.out.println();

        // Buscar un cliente específico
        System.out.println("→ Buscando cliente con ID 'CL003' en Grupo Matutino...");
        Clientes clienteEncontrado = grupo1.buscarClientePorId("CL003");
        if (clienteEncontrado != null) {
            System.out.println("  ✓ Cliente encontrado: " + clienteEncontrado.getNombreCompleto());
        }
        System.out.println();

        // Activar grupo inactivo
        System.out.println("→ Activando grupo 'Sabatino C'...");
        grupo3.activar();
        System.out.println("  ✓ Estado actualizado: " + grupo3.getEstado());
        System.out.println();

        // Activar cliente inactivo
        System.out.println("→ Activando cliente 'Luis Miguel Ramírez'...");
        cliente5.activar();
        System.out.println("  ✓ Estado actualizado: " + (cliente5.isActivo() ? "Activo" : "Inactivo"));
        System.out.println();

        // Estadísticas finales
        System.out.println("━━━ 6. ESTADÍSTICAS FINALES ━━━");
        System.out.println("Total de grupos activos: " + curso1.getGruposActivos().size());
        System.out.println("Total de estudiantes en el curso: " + curso1.getTotalClientes());

        int totalActivos = 0;
        for (Grupo g : curso1.getGrupos()) {
            totalActivos += g.getClientesActivos().size();
        }
        System.out.println("Total de estudiantes activos: " + totalActivos);

        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║              PROGRAMA FINALIZADO ✓                    ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }
}