/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author Usuario
 */
public class Nota {
    private String materia;
    private float notaFinal;
    private Estudiante estudiante;
    
    // Constructor
    public Nota(String materia, float notaFinal, Estudiante estudiante) {
        this.materia = materia;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }
    
    // Getters
    public String getMateria() {
        return materia;
    }
    
    public float getNotaFinal() {
        return notaFinal;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    // Setters
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    @Override
    public String toString() {
        return "Nota[Materia=" + materia + ", NotaFinal=" + notaFinal + ", " + estudiante + "]";
    }
}