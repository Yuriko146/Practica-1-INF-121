/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Departamento {
    private String nombre;
    private String area;
    ArrayList<Empleado> empleados;
    
    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }
    
    // Método para mostrar empleados
    public void mostrarEmpleados() {
        System.out.println("\n--- Departamento: " + nombre + " ---");
        if (empleados.isEmpty()) {
            System.out.println("Sin empleados");
        } else {
            for (Empleado e : empleados) {
                System.out.println("- " + e.getNombre() + " | Cargo: " + e.getCargo() + 
                                 " | Sueldo: $" + e.getSueldo());
            }
        }
    }
    
    // Método para cambiar salario de todos los empleados
    public void cambioSalario(double nuevoSueldo) {
        for (Empleado e : empleados) {
            e.setSueldo(nuevoSueldo);
        }
        System.out.println("Salario actualizado a $" + nuevoSueldo + " para todos los empleados de " + nombre);
    }
    
    // Método para agregar empleado
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    
    // Método para quitar empleado
    public void quitarEmpleado(Empleado emp) {
        empleados.remove(emp);
    }
    
    // Método para verificar si contiene un empleado
    public boolean contieneEmpleado(Empleado emp) {
        return empleados.contains(emp);
    }
    
    public String getNombre() {
        return nombre;
    }
}


