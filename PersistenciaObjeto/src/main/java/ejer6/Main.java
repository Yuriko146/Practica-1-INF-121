/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║       SISTEMA DE GESTIÓN DE BIBLIOTECA                    ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
        
        // Crear sistema de biblioteca
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        
        // Registrar libros
        System.out.println("--- REGISTRANDO LIBROS ---");
        sistema.getArchLibro().agregarLibro(new Libro(101, "Cien Años de Soledad", 45.50));
        sistema.getArchLibro().agregarLibro(new Libro(102, "Don Quijote de la Mancha", 55.00));
        sistema.getArchLibro().agregarLibro(new Libro(103, "El Principito", 25.00));
        sistema.getArchLibro().agregarLibro(new Libro(104, "1984", 38.75));
        sistema.getArchLibro().agregarLibro(new Libro(105, "Crónica de una Muerte Anunciada", 42.00));
        sistema.getArchLibro().agregarLibro(new Libro(106, "La Ciudad y los Perros", 48.50));
        
        // Registrar clientes
        System.out.println("\n--- REGISTRANDO CLIENTES ---");
        sistema.getArchCliente().agregarCliente(new Cliente(1, "12345678", "Juan", "Pérez"));
        sistema.getArchCliente().agregarCliente(new Cliente(2, "23456789", "María", "González"));
        sistema.getArchCliente().agregarCliente(new Cliente(3, "34567890", "Carlos", "Rodríguez"));
        sistema.getArchCliente().agregarCliente(new Cliente(4, "45678901", "Ana", "Martínez"));
        sistema.getArchCliente().agregarCliente(new Cliente(5, "56789012", "Luis", "López"));
        
        // Registrar préstamos
        System.out.println("\n--- REGISTRANDO PRÉSTAMOS ---");
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(1, 101, "2025-01-10", "2025-01-24"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(2, 102, "2025-01-12", "2025-01-26"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(1, 103, "2025-01-15", "2025-01-29"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(3, 101, "2025-02-01", "2025-02-15"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(4, 104, "2025-02-05", "2025-02-19"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(1, 102, "2025-02-10", "2025-02-24"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(5, 101, "2025-02-15", "2025-03-01"));
        sistema.getArchPrestamo().agregarPrestamo(new Prestamo(2, 103, "2025-02-20", "2025-03-06"));
        
        // Mostrar datos iniciales
        sistema.getArchLibro().listarLibros();
        sistema.getArchCliente().listarClientes();
        sistema.getArchPrestamo().listarPrestamos();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                 EJECUCIÓN DE CONSULTAS                    ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        // a) Listar libros con precio entre $30 y $50
        sistema.listarLibrosPorRangoPrecio(30.0, 50.0);
        
        // b) Calcular ingreso total del libro 101
        sistema.calcularIngresoLibro(101);
        
        // c) Mostrar libros nunca prestados
        sistema.mostrarLibrosNuncaPrestados();
        
        // d) Mostrar clientes que prestaron el libro 102
        sistema.mostrarClientesPorLibro(102);
        
        // e) Definir libro más prestado
        sistema.definirLibroMasPrestado();
        
        // f) Mostrar cliente con más préstamos
        sistema.mostrarClienteConMasPrestamos();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              FIN DE LA EJECUCIÓN DEL SISTEMA              ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }
}