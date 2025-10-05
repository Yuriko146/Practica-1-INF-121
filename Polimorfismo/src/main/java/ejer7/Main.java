/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author USUARIO
 */
public class Main {
     public static void main(String[] args) {
        // a) Probando constructor por defecto
        System.out.println("=== CONSTRUCTOR POR DEFECTO ===");
        Parada parada1 = new Parada();
        parada1.mostrar();
        
        // a) Probando constructor con datos
        System.out.println("=== CONSTRUCTOR CON DATOS ===");
        Parada parada2 = new Parada("Parada Central");
        
        // c) Probando adicionar admin
        System.out.println("=== ADICIONANDO ADMINISTRADORES ===");
        parada2.adicionar("Carlos Mendoza");
        parada2.adicionar("Maria Lopez");
        parada2.adicionar("Juan Perez");
        
        // d) Probando adicionar autos
        System.out.println("=== ADICIONANDO AUTOS ===");
        parada2.adicionar("Toyota", "Pedro Ramirez", "ABC-123");
        parada2.adicionar("Nissan", "Ana Garcia", "XYZ-456");
        parada2.adicionar("Hyundai", "Luis Fernandez", "DEF-789");
        
        // b) Probando método mostrar
        System.out.println("=== MOSTRANDO DATOS ===");
        parada2.mostrar();
    }
}

