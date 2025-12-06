/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Zoologico {
    private int id;
    private String nombre;
    private int nroAnimales;
    private Animal[] animales;
    
    // Constructor
    public Zoologico() {
        this.id = 0;
        this.nombre = "";
        this.nroAnimales = 0;
        this.animales = new Animal[30];
    }
    
    public Zoologico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.nroAnimales = 0;
        this.animales = new Animal[30];
    }
    
    // Método para adicionar animal
    public void adicionarAnimal(Animal animal) {
        if (nroAnimales < 30) {
            animales[nroAnimales] = animal;
            nroAnimales++;
            System.out.println("Animal agregado al zoológico '" + nombre + "': " + animal.getNombre());
        } else {
            System.out.println("No se pueden agregar más animales (límite alcanzado)");
        }
    }
    
    // Método para contar variedad de especies (animales diferentes)
    public int contarVariedadAnimales() {
        ArrayList<String> especiesContadas = new ArrayList<>();
        
        for (int i = 0; i < nroAnimales; i++) {
            String especie = animales[i].getEspecie();
            if (!especiesContadas.contains(especie)) {
                especiesContadas.add(especie);
            }
        }
        
        return especiesContadas.size();
    }
    
    // Método para verificar si el zoológico está vacío
    public boolean estaVacio() {
        return nroAnimales == 0;
    }
    
    // Método para mostrar todos los animales del zoológico
    public void mostrarAnimales() {
        System.out.println("\n  --- Zoológico: " + nombre + " (ID: " + id + ") ---");
        System.out.println("  Total de animales: " + nroAnimales);
        System.out.println("  Variedad de especies: " + contarVariedadAnimales());
        
        if (nroAnimales == 0) {
            System.out.println("  (Vacío)");
        } else {
            for (int i = 0; i < nroAnimales; i++) {
                System.out.println("    " + (i + 1) + ". " + animales[i]);
            }
        }
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNroAnimales() {
        return nroAnimales;
    }
    
    public Animal[] getAnimales() {
        return animales;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNroAnimales(int nroAnimales) {
        this.nroAnimales = nroAnimales;
    }
}
