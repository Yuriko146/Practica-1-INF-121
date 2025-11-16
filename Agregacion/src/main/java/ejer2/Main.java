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
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 2 departamentos, uno con 5 empleados y otro sin empleados
        Departamento dept1 = new Departamento("Ventas", "Comercial");
        Departamento dept2 = new Departamento("IT", "Tecnología");
        
        // Agregar 5 empleados al departamento 1
        dept1.agregarEmpleado(new Empleado("Juan Pérez", "Vendedor", 3000));
        dept1.agregarEmpleado(new Empleado("María López", "Gerente", 5000));
        dept1.agregarEmpleado(new Empleado("Carlos Ruiz", "Vendedor", 3000));
        dept1.agregarEmpleado(new Empleado("Ana Torres", "Asistente", 2500));
        dept1.agregarEmpleado(new Empleado("Luis Gómez", "Vendedor", 3000));
        
        System.out.println("=== INCISO A ===");
        System.out.println("Departamento 1 creado con 5 empleados");
        System.out.println("Departamento 2 creado sin empleados");
        
        // b) Agregar el método mostrarEmpleados()
        System.out.println("\n=== INCISO B ===");
        dept1.mostrarEmpleados();
        dept2.mostrarEmpleados();
        
        // c) Implementar cambioSalario() para todos los empleados de un departamento
        System.out.println("\n=== INCISO C ===");
        dept1.cambioSalario(3500);
        dept1.mostrarEmpleados();
        
        // d) Verificar si algún empleado del departamento 1 pertenece al departamento 2
        System.out.println("\n=== INCISO D ===");
        Empleado empPrueba = new Empleado("Juan Pérez", "Vendedor", 3000);
        if (dept2.contieneEmpleado(empPrueba)) {
            System.out.println("El empleado pertenece al Departamento 2");
        } else {
            System.out.println("Ningún empleado del Dept 1 está en el Dept 2");
        }
        
        // e) Mover empleados del departamento 1 al departamento 2
        System.out.println("\n=== INCISO E ===");
        ArrayList<Empleado> empleadosAMover = new ArrayList<>();
        // Guardamos referencia a los empleados a mover
        for (int i = 0; i < 2; i++) { // Movemos 2 empleados
            empleadosAMover.add(dept1.empleados.get(i));
        }
        
        // Movemos los empleados
        for (Empleado e : empleadosAMover) {
            dept1.quitarEmpleado(e);
            dept2.agregarEmpleado(e);
        }
        
        System.out.println("Empleados movidos del Dept 1 al Dept 2");
        dept1.mostrarEmpleados();
        dept2.mostrarEmpleados();
    }
}