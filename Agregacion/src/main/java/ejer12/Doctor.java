/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer12;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Doctor {
    private String nombre;
    private String especialidad;
    private String matricula;
    
    public Doctor(String nombre, String especialidad, String matricula) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void mostrarInfo() {
        System.out.println("Dr./Dra. " + nombre + " | Especialidad: " + especialidad + 
                         " | Matrícula: " + matricula);
    }
}

// b) Clase Hospital con lista de doctores (Agregación)
class Hospital {
    private String nombre;
    private String direccion;
    private ArrayList<Doctor> doctores;
    
    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.doctores = new ArrayList<>();
    }
    
    // c) Método para asignar doctores al hospital
    public void asignarDoctor(Doctor doctor) {
        if (!doctores.contains(doctor)) {
            doctores.add(doctor);
            System.out.println("✓ Doctor asignado: Dr./Dra. " + doctor.getNombre() + 
                             " al hospital " + nombre);
        } else {
            System.out.println("✗ El doctor ya está asignado a este hospital");
        }
    }
    
    // Método para remover doctor
    public void removerDoctor(Doctor doctor) {
        if (doctores.remove(doctor)) {
            System.out.println("✓ Doctor removido: Dr./Dra. " + doctor.getNombre() + 
                             " del hospital " + nombre);
        } else {
            System.out.println("✗ El doctor no se encuentra en este hospital");
        }
    }
    
    // c) Método para mostrar doctores del hospital
    public void mostrarDoctores() {
        System.out.println("\n========================================");
        System.out.println("HOSPITAL: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Total de doctores: " + doctores.size());
        System.out.println("========================================");
        
        if (doctores.isEmpty()) {
            System.out.println("- Sin doctores asignados");
        } else {
            for (int i = 0; i < doctores.size(); i++) {
                System.out.print((i + 1) + ". ");
                doctores.get(i).mostrarInfo();
            }
        }
    }
    
    // Método para buscar doctores por especialidad
    public void buscarPorEspecialidad(String especialidad) {
        System.out.println("\n--- Doctores de " + especialidad + " en " + nombre + " ---");
        boolean encontrado = false;
        
        for (Doctor d : doctores) {
            if (d.getEspecialidad().equalsIgnoreCase(especialidad)) {
                d.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay doctores de esa especialidad en este hospital");
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }
}
