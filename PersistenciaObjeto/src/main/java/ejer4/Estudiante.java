/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String ru;
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    
    // Constructor
    public Estudiante(String ru, String nombre, String paterno, String materno, int edad) {
        this.ru = ru;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }
    
    // Getters
    public String getRu() {
        return ru;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getPaterno() {
        return paterno;
    }
    
    public String getMaterno() {
        return materno;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Setters
    public void setRu(String ru) {
        this.ru = ru;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Estudiante[RU=" + ru + ", Nombre=" + nombre + " " + paterno + " " + materno + ", Edad=" + edad + "]";
    }
}
