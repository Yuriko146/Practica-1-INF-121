/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer14;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    // a) Método para agregar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("✓ Empleado agregado: " + empleado.getNombre());
    }
    
    // b) Mostrar información de la empresa y sus empleados
    public void mostrarInformacion() {
        System.out.println("\n========================================");
        System.out.println("EMPRESA: " + nombre);
        System.out.println("Total de empleados: " + empleados.size());
        System.out.println("========================================");
        
        if (empleados.isEmpty()) {
            System.out.println("- Sin empleados registrados");
        } else {
            for (int i = 0; i < empleados.size(); i++) {
                System.out.print((i + 1) + ". ");
                empleados.get(i).mostrarInfo();
            }
        }
    }
    
    // c) Buscar empleado por nombre
    public Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
    
    public void buscarYMostrarEmpleado(String nombre) {
        System.out.println("\n--- Buscando empleado: " + nombre + " ---");
        Empleado empleado = buscarEmpleadoPorNombre(nombre);
        
        if (empleado != null) {
            System.out.println("✓ Empleado encontrado:");
            empleado.mostrarInfo();
        } else {
            System.out.println("✗ Empleado no encontrado");
        }
    }
    
    // d) Eliminar empleado por nombre
    public boolean eliminarEmpleadoPorNombre(String nombre) {
        Empleado empleado = buscarEmpleadoPorNombre(nombre);
        
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("✓ Empleado eliminado: " + nombre);
            return true;
        } else {
            System.out.println("✗ No se pudo eliminar. Empleado no encontrado: " + nombre);
            return false;
        }
    }
    
    // e) Calcular y mostrar promedio salarial
    public double calcularPromedioSalarial() {
        if (empleados.isEmpty()) {
            return 0;
        }
        
        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        
        return suma / empleados.size();
    }
    
    public void mostrarPromedioSalarial() {
        double promedio = calcularPromedioSalarial();
        System.out.println("\n--- Promedio Salarial ---");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para calcular el promedio");
        } else {
            System.out.println("Promedio salarial de " + nombre + ": Bs. " + 
                             String.format("%.2f", promedio));
        }
    }
    
    // e) Listar empleados con salario mayor a un valor dado
    public void listarEmpleadosSalarioMayor(double salarioMinimo) {
        System.out.println("\n--- Empleados con salario mayor a Bs. " + 
                         String.format("%.2f", salarioMinimo) + " ---");
        
        boolean encontrados = false;
        for (Empleado e : empleados) {
            if (e.getSalario() > salarioMinimo) {
                e.mostrarInfo();
                encontrados = true;
            }
        }
        
        if (!encontrados) {
            System.out.println("No hay empleados con salario mayor a Bs. " + 
                             String.format("%.2f", salarioMinimo));
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidadEmpleados() {
        return empleados.size();
    }
}
