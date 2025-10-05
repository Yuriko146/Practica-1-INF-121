/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author USUARIO
 */
public class Bus {
    private int capacidadTotal;
    private int pasajerosActuales;
    private final double COSTO_PASAJE = 1.50;
    private double dineroRecaudado;
 
    public Bus(int capacidad) {
        this.capacidadTotal = capacidad;
        this.pasajerosActuales = 0;
        this.dineroRecaudado = 0.0;
    }
    
    public boolean subirPasajeros(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de pasajeros debe ser mayor a 0");
            return false;
        }
        
        int asientosDisponibles = capacidadTotal - pasajerosActuales;
        
        if (cantidad <= asientosDisponibles) {
            pasajerosActuales += cantidad;
            System.out.println(cantidad + " pasajero(s) subieron al bus");
            System.out.println("Pasajeros actuales: " + pasajerosActuales);
            return true;
        } else {
            System.out.println("No hay suficientes asientos disponibles");
            System.out.println("Asientos disponibles: " + asientosDisponibles);
            System.out.println("Pasajeros que intentan subir: " + cantidad);
            return false;
        }
    }
    
    public double cobrarPasaje(int numeroPasajeros) {
        if (numeroPasajeros <= 0 || numeroPasajeros > pasajerosActuales) {
            System.out.println("Número de pasajeros inválido para cobrar");
            return 0.0;
        }
        
        double totalCobrado = numeroPasajeros * COSTO_PASAJE;
        dineroRecaudado += totalCobrado;
        
        System.out.println("Cobrando pasaje a " + numeroPasajeros + " pasajero(s)");
        System.out.println("Costo por pasajero: Bs. " + COSTO_PASAJE);
        System.out.println("Total cobrado: Bs. " + totalCobrado);
        System.out.println("Dinero recaudado total: Bs. " + dineroRecaudado);
        
        return totalCobrado;
    }
    
    public int getAsientosDisponibles() {
        return capacidadTotal - pasajerosActuales;
    }
    
    public void mostrarAsientosDisponibles() {
        int disponibles = getAsientosDisponibles();
        System.out.println("=================================");
        System.out.println("Asientos disponibles: " + disponibles);
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Pasajeros actuales: " + pasajerosActuales);
        System.out.println("=================================");
    }
    
    public void mostrarEstado() {
        System.out.println("\n========== ESTADO DEL BUS ==========");
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Pasajeros actuales: " + pasajerosActuales);
        System.out.println("Asientos disponibles: " + getAsientosDisponibles());
        System.out.println("Dinero recaudado: Bs. " + dineroRecaudado);
        System.out.println("====================================\n");
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }
    
    public double getDineroRecaudado() {
        return dineroRecaudado;
    }
}
