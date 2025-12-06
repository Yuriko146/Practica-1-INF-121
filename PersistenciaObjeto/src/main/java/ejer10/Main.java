/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestorUsuarios gestor = new GestorUsuarios();
    
    public static void main(String[] args) {
        mostrarBienvenida();
        
        boolean continuar = true;
        
        while (continuar) {
            mostrarMenu();
            int opcion = leerOpcion();
            
            switch (opcion) {
                case 1:
                    agregarNuevoUsuario();
                    break;
                case 2:
                    gestor.mostrarRegistros();
                    break;
                case 3:
                    buscarUsuarioPorNombre();
                    break;
                case 4:
                    gestor.mostrarArchivoCifrado();
                    break;
                case 5:
                    mostrarEstadisticas();
                    break;
                case 6:
                    continuar = false;
                    mostrarDespedida();
                    break;
                default:
                    System.out.println("\n✗ Opción inválida. Intente nuevamente.\n");
            }
        }
    }
    
    private static void mostrarBienvenida() {
        System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                       ║");
        System.out.println("║        🔐 SISTEMA DE SEGURIDAD DE LA INFORMACIÓN 🔐                  ║");
        System.out.println("║                                                                       ║");
        System.out.println("║           Gestión de Usuarios con Cifrado de Datos                   ║");
        System.out.println("║                                                                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
    
    private static void mostrarMenu() {
        System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                          MENÚ PRINCIPAL                               │");
        System.out.println("├───────────────────────────────────────────────────────────────────────┤");
        System.out.println("│  1. Agregar nuevo usuario                                             │");
        System.out.println("│  2. Mostrar todos los registros                                       │");
        System.out.println("│  3. Buscar usuario por nombre                                         │");
        System.out.println("│  4. Ver contenido cifrado del archivo                                 │");
        System.out.println("│  5. Mostrar estadísticas                                              │");
        System.out.println("│  6. Salir                                                             │");
        System.out.println("└───────────────────────────────────────────────────────────────────────┘");
        System.out.print("\nSeleccione una opción: ");
    }
    
    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static void agregarNuevoUsuario() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      AGREGAR NUEVO USUARIO                            ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
        
        System.out.print("\nNombre de usuario: ");
        String nombreUsuario = scanner.nextLine().trim();
        
        if (nombreUsuario.isEmpty()) {
            System.out.println("✗ El nombre de usuario no puede estar vacío\n");
            return;
        }
        
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine().trim();
        
        if (contrasena.isEmpty()) {
            System.out.println("✗ La contraseña no puede estar vacía\n");
            return;
        }
        
        gestor.agregarUsuario(nombreUsuario, contrasena);
        System.out.println();
    }
    
    private static void buscarUsuarioPorNombre() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                       BUSCAR USUARIO                                  ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
        
        System.out.print("\nNombre de usuario a buscar: ");
        String nombreBuscar = scanner.nextLine().trim();
        
        if (nombreBuscar.isEmpty()) {
            System.out.println("✗ Debe ingresar un nombre de usuario\n");
            return;
        }
        
        gestor.buscarUsuario(nombreBuscar);
    }
    
    private static void mostrarEstadisticas() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                         ESTADÍSTICAS                                  ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║  Archivo: usuarios_seguro.txt                                         ║");
        System.out.println("║  Total de usuarios registrados: " + gestor.getCantidadUsuarios() + "                                      ║");
        System.out.println("║  Método de cifrado: XOR + Base64                                      ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
    
    private static void mostrarDespedida() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                       ║");
        System.out.println("║              ¡Gracias por usar el Sistema de Seguridad!               ║");
        System.out.println("║                                                                       ║");
        System.out.println("║         Todos los datos han sido guardados de forma segura           ║");
        System.out.println("║                                                                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
}
