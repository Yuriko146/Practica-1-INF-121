/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArchPrestamo {
    private String nomArch;
    private ArrayList<Prestamo> prestamos;
    
    // Constructor
    public ArchPrestamo(String nomArch) {
        this.nomArch = nomArch;
        this.prestamos = new ArrayList<>();
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de ArchPrestamo - tipo: " + type);
    }
    
    // Método para agregar préstamo
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        System.out.println("Préstamo registrado: " + prestamo);
    }
    
    // Método para listar todos los préstamos
    public void listarPrestamos() {
        System.out.println("\n=== LISTADO DE PRÉSTAMOS ===");
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }
        System.out.println("===========================\n");
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
}