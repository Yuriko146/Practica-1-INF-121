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
public class SistemaEntradaUniversitaria {
    private ArrayList<Bailarin> bailarines;
    private ArrayList<Fraternidad> fraternidades;
    private ArrayList<Facultad> facultades;
    
    public SistemaEntradaUniversitaria() {
        this.bailarines = new ArrayList<>();
        this.fraternidades = new ArrayList<>();
        this.facultades = new ArrayList<>();
    }
    
    public void registrarFraternidad(Fraternidad fraternidad) {
        fraternidades.add(fraternidad);
        System.out.println("Fraternidad registrada: " + fraternidad.getNombre());
    }
    
    public void registrarFacultad(Facultad facultad) {
        facultades.add(facultad);
        System.out.println("Facultad registrada: " + facultad.getNombre());
    }
    
    // Registrar nuevo bailarín
    public boolean registrarBailarin(Bailarin bailarin, Fraternidad fraternidad, Facultad facultad) {
        // Verificar que no esté en otra fraternidad
        if (verificarBailarinEnMultiplesFraternidades(bailarin)) {
            System.out.println("ERROR: " + bailarin.getNombreCompleto() + 
                             " ya está registrado en otra fraternidad");
            return false;
        }
        
        bailarin.asignarFraternidad(fraternidad);
        bailarin.asignarFacultad(facultad);
        fraternidad.agregarMiembro(bailarin);
        facultad.agregarBailarin(bailarin);
        bailarines.add(bailarin);
        
        System.out.println("✓ Bailarín registrado: " + bailarin.getNombreCompleto());
        return true;
    }
    
    // Verificar que no esté en 2 o más fraternidades
    public boolean verificarBailarinEnMultiplesFraternidades(Bailarin bailarin) {
        int contador = 0;
        for (Fraternidad f : fraternidades) {
            if (f.getMiembros().contains(bailarin)) {
                contador++;
            }
        }
        return contador >= 1; // Si ya está en 1, no puede estar en otra
    }
    
    // Ver todos los bailarines con su fraternidad y facultad
    public void mostrarTodosBailarines() {
        System.out.println("\n========== LISTA DE BAILARINES ==========");
        if (bailarines.isEmpty()) {
            System.out.println("No hay bailarines registrados");
        } else {
            for (Bailarin b : bailarines) {
                System.out.println("• " + b.getNombreCompleto() + " (" + b.getEdad() + " años) - " +
                                 "Fraternidad: " + b.getFraternidad().getNombre() + 
                                 " | Facultad: " + b.getFacultad().getNombre());
            }
        }
    }
    
    // Mostrar encargados de fraternidades
    public void mostrarEncargadosFraternidades() {
        System.out.println("\n========== ENCARGADOS DE FRATERNIDADES ==========");
        for (Fraternidad f : fraternidades) {
            System.out.println("• " + f.getNombre() + " → Encargado: " + f.getEncargado());
        }
    }
    
    // Ver edades de participantes
    public void mostrarEdadesParticipantes() {
        System.out.println("\n========== EDADES DE PARTICIPANTES ==========");
        for (Bailarin b : bailarines) {
            System.out.println("• " + b.getNombreCompleto() + ": " + b.getEdad() + " años");
        }
    }
    
    public ArrayList<Fraternidad> getFraternidades() {
        return fraternidades;
    }
    
    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }
}

