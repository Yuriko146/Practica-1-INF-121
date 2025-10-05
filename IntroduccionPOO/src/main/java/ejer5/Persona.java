/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;
    
    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    
    // b) Método mostrarDatos()
    public void mostrarDatos() {
        System.out.println("=================================");
        System.out.println("DATOS DE LA PERSONA");
        System.out.println("=================================");
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad + " años");
        System.out.println("CI: " + ci);
        System.out.println("Mayor de edad: " + (mayorDeEdad() ? "Si" : "No"));
        System.out.println("=================================");
    }
    
    // c) Método mayorDeEdad()
    public boolean mayorDeEdad() {
        return edad >= 18;
    }
    
    // d) Método modificarEdad()
    public void modificarEdad(int nuevaEdad) {
        int edadAnterior = this.edad;
        this.edad = nuevaEdad;
        System.out.println("Edad de " + nombre + " modificada: " + edadAnterior + " -> " + nuevaEdad + " años");
    }
    public String getPaterno() {
        return paterno;
    }
    
    public String getNombre() {
        return nombre;
    }
}