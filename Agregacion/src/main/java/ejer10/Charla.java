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
public class Charla {
    private String lugar;
    private String nombreCharla;
    private Speaker speaker;
    private int np; // número de participantes
    private ArrayList<Participante> participantes;
    
    public Charla(String lugar, String nombreCharla, Speaker speaker) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
        this.np = 0;
    }
    
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
        np++;
        System.out.println("✓ Participante agregado: " + participante.getNombreCompleto());
    }
    
    public void eliminarParticipante(Participante participante) {
        if (participantes.remove(participante)) {
            np--;
            System.out.println("✓ Participante eliminado: " + participante.getNombreCompleto());
        } else {
            System.out.println("✗ Participante no encontrado");
        }
    }
    
    public String getLugar() {
        return lugar;
    }
    
    public String getNombreCharla() {
        return nombreCharla;
    }
    
    public Speaker getSpeaker() {
        return speaker;
    }
    
    public int getNp() {
        return np;
    }
    
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    
    public void mostrarCharla() {
        System.out.println("\n=== CHARLA: " + nombreCharla + " ===");
        System.out.println("Lugar: " + lugar);
        System.out.println("Speaker: " + speaker.getNombreCompleto() + 
                         " (Especialidad: " + speaker.getEspecialidad() + ")");
        System.out.println("Número de participantes: " + np);
    }
    
    public void mostrarParticipantes() {
        System.out.println("\nParticipantes de la charla '" + nombreCharla + "':");
        if (participantes.isEmpty()) {
            System.out.println("- Sin participantes registrados");
        } else {
            for (Participante p : participantes) {
                System.out.println("- " + p.getNombreCompleto() + " (Edad: " + p.getEdad() + 
                                 ", Ticket #" + p.getNroTicket() + ")");
            }
        }
    }
}
