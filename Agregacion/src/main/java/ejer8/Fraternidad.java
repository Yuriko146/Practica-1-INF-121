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
public class Fraternidad {
    private String nombre;
    private String encargado;
    private ArrayList<Bailarin> miembros;
    
    public Fraternidad(String nombre, String encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.miembros = new ArrayList<>();
    }
    
    public boolean agregarMiembro(Bailarin bailarin) {
        if (!miembros.contains(bailarin)) {
            miembros.add(bailarin);
            return true;
        }
        return false;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEncargado() {
        return encargado;
    }
    
    public ArrayList<Bailarin> getMiembros() {
        return miembros;
    }
    
    public void mostrarMiembros() {
        System.out.println("\n=== FRATERNIDAD: " + nombre + " ===");
        System.out.println("Encargado: " + encargado);
        System.out.println("Miembros:");
        if (miembros.isEmpty()) {
            System.out.println("Sin miembros registrados");
        } else {
            for (Bailarin b : miembros) {
                System.out.println("- " + b.getNombreCompleto() + " (Edad: " + b.getEdad() + 
                                 ") - Facultad: " + b.getFacultad().getNombre());
            }
        }
    }
}
