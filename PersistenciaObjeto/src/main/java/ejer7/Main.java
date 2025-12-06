/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║         SISTEMA DE GESTIÓN DE NIÑOS                      ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
        
        // Crear archivo de niños
        ArchNiño archivo = new ArchNiño("ninos.dat");
        archivo.crear();
        
        // a) Crear, leer, listar y mostrar - Agregando datos de prueba
        System.out.println("--- Agregando niños al sistema ---");
        archivo.adicionar(new Niño("Juan", "Pérez", "García", "12345678", 5, 19.0, "XS"));
        archivo.adicionar(new Niño("María", "López", "Martínez", "23456789", 7, 25.0, "S"));
        archivo.adicionar(new Niño("Carlos", "Rodríguez", "Fernández", "34567890", 3, 14.5, "3T"));
        archivo.adicionar(new Niño("Ana", "Gómez", "Sánchez", "45678901", 8, 35.0, "S"));
        archivo.adicionar(new Niño("Luis", "Torres", "Ramírez", "56789012", 6, 20.0, "XS"));
        archivo.adicionar(new Niño("Sofia", "Morales", "Castro", "67890123", 4, 16.0, "4T"));
        archivo.adicionar(new Niño("Diego", "Vargas", "Silva", "78901234", 9, 28.0, "M"));
        archivo.adicionar(new Niño("Valentina", "Ruiz", "Flores", "89012345", 10, 32.0, "M"));
        archivo.adicionar(new Niño("Mateo", "Jiménez", "Ortiz", "90123456", 2, 12.5, "2T"));
        archivo.adicionar(new Niño("Emma", "Herrera", "Reyes", "01234567", 5, 25.0, "XS"));
        
        // Listar todos los niños
        archivo.listar();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              EJECUCIÓN DE CONSULTAS                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        // b) Cuántos niños tienen el peso adecuado
        archivo.contarNiñosPesoAdecuado();
        
        // c) Mostrar niños con peso o talla inadecuada
        archivo.mostrarNiñosPesoTallaInadecuada();
        
        // d) Determinar promedio de edad
        archivo.determinarPromedioEdad();
        
        // e) Buscar niño por CI
        archivo.buscarNiñoPorCI("34567890");
        archivo.buscarNiñoPorCI("99999999"); // CI que no existe
        
        // f) Mostrar niños con talla más alta
        archivo.mostrarNiñosTallaMasAlta();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║           FIN DE LA EJECUCIÓN DEL SISTEMA                 ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }
}
