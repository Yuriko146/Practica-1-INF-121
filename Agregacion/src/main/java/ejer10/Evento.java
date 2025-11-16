/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Evento {
    private String nombre;
    private int nc; // número de charlas
    private ArrayList<Charla> charlas;
    
    public Evento(String nombre) {
        this.nombre = nombre;
        this.charlas = new ArrayList<>();
        this.nc = 0;
    }
    
    public void agregarCharla(Charla charla) {
        charlas.add(charla);
        nc++;
        System.out.println("✓ Charla agregada: " + charla.getNombreCharla());
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Charla> getCharlas() {
        return charlas;
    }
    
    // a) Calcular edad promedio de participantes en el evento
    public double calcularEdadPromedio() {
        int totalParticipantes = 0;
        int sumaEdades = 0;
        
        for (Charla c : charlas) {
            for (Participante p : c.getParticipantes()) {
                sumaEdades += p.getEdad();
                totalParticipantes++;
            }
        }
        
        if (totalParticipantes == 0) return 0;
        return (double) sumaEdades / totalParticipantes;
    }
    
    // b) Verificar si persona está en alguna charla (como participante o speaker)
    public boolean verificarPersonaEnCharla(String nombre, String apellido) {
        for (Charla c : charlas) {
            // Verificar si es speaker
            if (c.getSpeaker().getNombre().equalsIgnoreCase(nombre) && 
                c.getSpeaker().getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("✓ " + nombre + " " + apellido + 
                                 " es SPEAKER en la charla: " + c.getNombreCharla());
                return true;
            }
            // Verificar si es participante
            for (Participante p : c.getParticipantes()) {
                if (p.getNombre().equalsIgnoreCase(nombre) && 
                    p.getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("✓ " + nombre + " " + apellido + 
                                     " es PARTICIPANTE en la charla: " + c.getNombreCharla());
                    return true;
                }
            }
        }
        System.out.println("✗ " + nombre + " " + apellido + 
                         " NO se encuentra en ninguna charla");
        return false;
    }
    
    // c) Eliminar charlas del speaker con CI X
    public void eliminarCharlasPorSpeaker(int ciSpeaker) {
        ArrayList<Charla> charlasAEliminar = new ArrayList<>();
        
        for (Charla c : charlas) {
            if (c.getSpeaker().getCi() == ciSpeaker) {
                charlasAEliminar.add(c);
            }
        }
        
        if (charlasAEliminar.isEmpty()) {
            System.out.println("✗ No se encontraron charlas del speaker con CI: " + ciSpeaker);
        } else {
            for (Charla c : charlasAEliminar) {
                charlas.remove(c);
                nc--;
                System.out.println("✓ Charla eliminada: " + c.getNombreCharla() + 
                                 " (Speaker: " + c.getSpeaker().getNombreCompleto() + ")");
            }
        }
    }
    
    // d) Ordenar charlas por número de participantes
    public void ordenarCharlasPorParticipantes() {
        // Ordenamiento burbuja simple
        for (int i = 0; i < charlas.size() - 1; i++) {
            for (int j = 0; j < charlas.size() - i - 1; j++) {
                if (charlas.get(j).getNp() > charlas.get(j + 1).getNp()) {
                    Charla temp = charlas.get(j);
                    charlas.set(j, charlas.get(j + 1));
                    charlas.set(j + 1, temp);
                }
            }
        }
        System.out.println("✓ Charlas ordenadas por número de participantes (menor a mayor)");
    }
    
    public void mostrarEvento() {
        System.out.println("\n========================================");
        System.out.println("EVENTO: " + nombre);
        System.out.println("Número de charlas: " + nc);
        System.out.println("========================================");
        
        for (Charla c : charlas) {
            c.mostrarCharla();
            c.mostrarParticipantes();
        }
    }
}
