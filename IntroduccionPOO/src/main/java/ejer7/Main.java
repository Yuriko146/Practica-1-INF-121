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
        System.out.println("===== SISTEMA DE MASCOTAS =====\n");
     
        Mascota mascota1 = new Mascota("Max", "Perro", 50);
        Mascota mascota2 = new Mascota("Luna", "Gato", 60);
        
        // Mostrar energía inicial
        System.out.println("--- ESTADO INICIAL ---");
        mascota1.mostrarEnergia();
        mascota2.mostrarEnergia();
        System.out.println();
        
        // Alimentar mascota 1
        System.out.println("--- ALIMENTANDO A MAX ---");
        mascota1.alimentar();
        System.out.println();
        
        // Jugar con mascota 1
        System.out.println("--- MAX JUGANDO ---");
        mascota1.jugar();
        System.out.println();
        
        // Alimentar mascota 2 dos veces
        System.out.println("--- ALIMENTANDO A LUNA ---");
        mascota2.alimentar();
        mascota2.alimentar();
        System.out.println();
        
        // Jugar con mascota 2
        System.out.println("--- LUNA JUGANDO ---");
        mascota2.jugar();
        System.out.println();
        
        // Estado final
        System.out.println("--- ESTADO FINAL ---");
        mascota1.mostrarEnergia();
        mascota2.mostrarEnergia();
        System.out.println();
        
        // Jugar hasta agotar energía
        System.out.println("--- MAX JUGANDO MUCHO ---");
        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
        System.out.println();
        
        // Alimentar con energía al máximo
        System.out.println("--- LUNA COMIENDO MUCHO ---");
        mascota2.alimentar();
        mascota2.alimentar();
        mascota2.alimentar();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}