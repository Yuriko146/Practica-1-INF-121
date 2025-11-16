/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author USUARIO
 */
public class Participante extends Persona {
    private int nroTicket;
    
    public Participante(String nombre, String apellido, int edad, int ci, int nroTicket) {
        super(nombre, apellido, edad, ci);
        this.nroTicket = nroTicket;
    }
    
    public int getNroTicket() {
        return nroTicket;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("PARTICIPANTE: " + getNombreCompleto() + " | Edad: " + getEdad() + 
                         " | Ticket #" + nroTicket);
    }
}
