/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author USUARIO
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTIÓN DE BUS =====\n");
        
        // d) Crear instancia del bus con capacidad de 40 pasajeros
        Bus miBus = new Bus(40);
        
        // Mostrar estado inicial
        miBus.mostrarEstado();
        
        // a) Subir 15 pasajeros
        System.out.println("--- Subiendo primer grupo de pasajeros ---");
        miBus.subirPasajeros(15);
        System.out.println();
        
        // b) Cobrar pasaje a los 15 pasajeros
        System.out.println("--- Cobrando pasaje al primer grupo ---");
        miBus.cobrarPasaje(15);
        System.out.println();
        
        // c) Mostrar asientos disponibles
        miBus.mostrarAsientosDisponibles();
        System.out.println();
        
        // Subir más pasajeros
        System.out.println("--- Subiendo segundo grupo de pasajeros ---");
        miBus.subirPasajeros(20);
        miBus.cobrarPasaje(20);
        System.out.println();
        
        // Mostrar asientos disponibles nuevamente
        miBus.mostrarAsientosDisponibles();
        System.out.println();
        
        // Intentar subir más pasajeros de los que caben
        System.out.println("--- Intentando subir más pasajeros de los que caben ---");
        miBus.subirPasajeros(10);
        System.out.println();
        
        // Estado final del bus
        miBus.mostrarEstado();
    }
}