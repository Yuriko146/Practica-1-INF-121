/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author USUARIO
 */
public class Bailarin {
    private String nombre;
    private String apellido;
    private int edad;
    private String ci;
    private String telefono;
    private Fraternidad fraternidad;
    private Facultad facultad;
    
    public Bailarin(String nombre, String apellido, int edad, String ci, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
        this.telefono = telefono;
    }
    
    public void asignarFraternidad(Fraternidad fraternidad) {
        this.fraternidad = fraternidad;
    }
    
    public void asignarFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public Fraternidad getFraternidad() {
        return fraternidad;
    }
    
    public Facultad getFacultad() {
        return facultad;
    }
    
    public void mostrarInfo() {
        System.out.println("\n--- Bailarín ---");
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Edad: " + edad + " años");
        System.out.println("CI: " + ci);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fraternidad: " + (fraternidad != null ? fraternidad.getNombre() : "No asignada"));
        System.out.println("Facultad: " + (facultad != null ? facultad.getNombre() : "No asignada"));
    }
}
