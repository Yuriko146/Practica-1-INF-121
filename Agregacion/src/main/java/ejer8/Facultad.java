/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Facultad {
    private String nombre;
    private String codigo;
    private ArrayList<Bailarin> bailarines;
    
    public Facultad(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.bailarines = new ArrayList<>();
    }
    
    public void agregarBailarin(Bailarin bailarin) {
        bailarines.add(bailarin);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Bailarin> getBailarines() {
        return bailarines;
    }
    
    public void mostrarBailarines() {
        System.out.println("\n=== FACULTAD: " + nombre + " ===");
        if (bailarines.isEmpty()) {
            System.out.println("Sin bailarines registrados");
        } else {
            for (Bailarin b : bailarines) {
                System.out.println("- " + b.getNombreCompleto() + " (Edad: " + b.getEdad() + 
                                 ") - Fraternidad: " + b.getFraternidad().getNombre());
            }
        }
    }
}