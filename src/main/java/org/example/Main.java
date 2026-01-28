package org.example;

import org.example.models.Curso;
import org.example.models.Grupo;
import org.example.models.Clientes;

/**
 * Clase principal del sistema
 * Versión actual: Prueba de modelos + Arquitectura preparada
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║    SISTEMA DE GESTIÓN DE CURSOS - DEMO               ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");

        // ============================================================
        // PARTE 1: PRUEBA DE MODELOS (Ya implementados)
        // ============================================================
        probarModelos();

        // ============================================================
        // PARTE 2: ARQUITECTURA EN CAPAS (Preparada para implementar)
        // ============================================================
        System.out.println("\n" + "=".repeat(55));
        System.out.println("ARQUITECTURA EN CAPAS - LISTA PARA IMPLEMENTAR");
        System.out.println("=".repeat(55));
        mostrarArquitectura();

        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║              SISTEMA FINALIZADO ✓                     ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }

    /**
     * Prueba las clases de dominio ya implementadas
     */
    private static void probarModelos() {
        System.out.println("━━━ PRUEBA DE MODELOS DEL DOMINIO ━━━\n");

        // 1. CREAR CURSO
        System.out.println("1️⃣  CREANDO CURSO");
        Curso curso = new Curso(
                "C001",
                "Programación Orientada a Objetos",
                "Curso completo de POO con Java",
                "60 horas",
                "profesor@university.edu"
        );
        System.out.println("    ✓ " + curso.getNombre());
        System.out.println("      Duración: " + curso.getTiempo());

        // 2. CREAR GRUPOS
        System.out.println("\n2️⃣  CREANDO GRUPOS");
        Grupo grupo1 = new Grupo("G001", "Grupo Matutino", "Activo");
        Grupo grupo2 = new Grupo("G002", "Grupo Vespertino", "Activo");

        // Agregar grupos al curso (Relación 1:*)
        curso.agregarGrupo(grupo1);
        curso.agregarGrupo(grupo2);

        System.out.println("    ✓ " + grupo1.getNombre() + " (" + grupo1.getEstado() + ")");
        System.out.println("    ✓ " + grupo2.getNombre() + " (" + grupo2.getEstado() + ")");
        System.out.println("    → Grupos agregados al curso: " + curso.getCantidadGrupos());

        // 3. CREAR CLIENTES
        System.out.println("\n3️⃣  MATRICULANDO CLIENTES");
        Clientes cliente1 = new Clientes(
                "CL001", "Juan Carlos", "Pérez García", "1", "juan@mail.com"
        );
        Clientes cliente2 = new Clientes(
                "CL002", "María Fernanda", "López Rodríguez", "1", "maria@mail.com"
        );
        Clientes cliente3 = new Clientes(
                "CL003", "Pedro Antonio", "Martínez Silva", "0", "pedro@mail.com"
        );
        Clientes cliente4 = new Clientes(
                "CL004", "Ana Sofía", "González Vargas", "1", "ana@mail.com"
        );

        // Matricular clientes en grupos (Relación 1:0..*)
        grupo1.agregarCliente(cliente1);
        grupo1.agregarCliente(cliente2);
        grupo1.agregarCliente(cliente3);

        grupo2.agregarCliente(cliente4);

        System.out.println("    ✓ " + cliente1.getNombreCompleto() + " → " + grupo1.getNombre());
        System.out.println("    ✓ " + cliente2.getNombreCompleto() + " → " + grupo1.getNombre());
        System.out.println("    ✓ " + cliente3.getNombreCompleto() + " → " + grupo1.getNombre());
        System.out.println("    ✓ " + cliente4.getNombreCompleto() + " → " + grupo2.getNombre());

        // 4. MOSTRAR ESTRUCTURA COMPLETA
        System.out.println("\n4️⃣  ESTRUCTURA COMPLETA DEL CURSO");
        System.out.println("    ┌─────────────────────────────────────────");
        System.out.println("    │ Curso: " + curso.getNombre());
        System.out.println("    │ Total grupos: " + curso.getCantidadGrupos());
        System.out.println("    │ Total estudiantes: " + curso.getTotalClientes());
        System.out.println("    │");

        for (Grupo g : curso.getGrupos()) {
            System.out.println("    │ ┌─ " + g.getNombre());
            System.out.println("    │ │  Clientes: " + g.getCantidadClientes() +
                    " (Activos: " + g.getClientesActivos().size() + ")");

            for (Clientes c : g.getClientes()) {
                String estado = c.isActivo() ? "✓" : "✗";
                System.out.println("    │ │  " + estado + " " + c.getNombreCompleto());
            }
            System.out.println("    │ └─");
        }
        System.out.println("    └─────────────────────────────────────────");

        // 5. PROBAR FUNCIONALIDADES
        System.out.println("\n5️⃣  PROBANDO FUNCIONALIDADES");

        // Buscar grupo
        Grupo grupoEncontrado = curso.buscarGrupoPorId("G001");
        System.out.println("    ✓ Buscar grupo 'G001': " + grupoEncontrado.getNombre());

        // Buscar cliente
        Clientes clienteEncontrado = grupo1.buscarClientePorId("CL002");
        System.out.println("    ✓ Buscar cliente 'CL002': " + clienteEncontrado.getNombreCompleto());

        // Activar cliente inactivo
        cliente3.activar();
        System.out.println("    ✓ Cliente '" + cliente3.getNombre() + "' activado");
        System.out.println("    → Clientes activos en Grupo 1: " + grupo1.getClientesActivos().size());

        // Desactivar grupo
        grupo2.desactivar();
        System.out.println("    ✓ Grupo '" + grupo2.getNombre() + "' desactivado");
        System.out.println("    → Grupos activos en curso: " + curso.getGruposActivos().size());

        // 6. ESTADÍSTICAS FINALES
        System.out.println("\n6️⃣  ESTADÍSTICAS");
        System.out.println("    • Cursos en sistema: 1");
        System.out.println("    • Grupos totales: " + curso.getCantidadGrupos());
        System.out.println("    • Grupos activos: " + curso.getGruposActivos().size());
        System.out.println("    • Total estudiantes: " + curso.getTotalClientes());

        int totalActivos = 0;
        for (Grupo g : curso.getGrupos()) {
            totalActivos += g.getClientesActivos().size();
        }
        System.out.println("    • Estudiantes activos: " + totalActivos);
    }

    /**
     * Muestra la arquitectura preparada
     */
    private static void mostrarArquitectura() {
        System.out.println("\n📦 Estructura de paquetes creada:");
        System.out.println("   ├── 📁 models/           ✓ (3 clases implementadas)");
        System.out.println("   │   ├── Curso");
        System.out.println("   │   ├── Grupo");
        System.out.println("   │   └── Clientes");
        System.out.println("   │");
        System.out.println("   ├── 📁 exceptions/       ✓ (3 clases implementadas)");
        System.out.println("   │   ├── EntityNotFoundException");
        System.out.println("   │   ├── DuplicateEntityException");
        System.out.println("   │   └── InvalidDataException");
        System.out.println("   │");
        System.out.println("   ├── 📁 util/             ✓ (2 clases con esqueleto)");
        System.out.println("   │   ├── Validador");
        System.out.println("   │   └── Mensajes");
        System.out.println("   │");
        System.out.println("   ├── 📁 dao/              ⏳ (Pendiente implementar)");
        System.out.println("   │   ├── CursoDAO (interface)");
        System.out.println("   │   ├── GrupoDAO (interface)");
        System.out.println("   │   ├── ClientesDAO (interface)");
        System.out.println("   │   └── 📁 impl/");
        System.out.println("   │       ├── CursoDAOImpl");
        System.out.println("   │       ├── GrupoDAOImpl");
        System.out.println("   │       └── ClientesDAOImpl");
        System.out.println("   │");
        System.out.println("   ├── 📁 service/          ⏳ (Pendiente implementar)");
        System.out.println("   │   ├── CursoService (interface)");
        System.out.println("   │   ├── GrupoService (interface)");
        System.out.println("   │   ├── ClientesService (interface)");
        System.out.println("   │   └── 📁 impl/");
        System.out.println("   │       ├── CursoServiceImpl");
        System.out.println("   │       ├── GrupoServiceImpl");
        System.out.println("   │       └── ClientesServiceImpl");
        System.out.println("   │");
        System.out.println("   ├── 📁 controller/       ⏳ (Pendiente implementar)");
        System.out.println("   │   ├── CursoController");
        System.out.println("   │   ├── GrupoController");
        System.out.println("   │   └── ClientesController");
        System.out.println("   │");
        System.out.println("   └── 📁 view/             ⏳ (Pendiente implementar)");
        System.out.println("       ├── MenuPrincipal");
        System.out.println("       ├── MenuCursos");
        System.out.println("       ├── MenuGrupos");
        System.out.println("       └── MenuClientes");

        System.out.println("\n✅ MODELOS Y RELACIONES: Totalmente funcionales");
        System.out.println("⏳ ARQUITECTURA EN CAPAS: Lista para implementar");
        System.out.println("📋 PRÓXIMO PASO: Implementar DAOs, Services, Controllers y Views");
    }
}