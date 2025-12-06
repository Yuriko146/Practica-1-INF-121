/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        ArchivoTrabajador archivo = new ArchivoTrabajador();
        
        // Crear el archivo
        archivo.crearArchivo("trabajadores.dat");
        
        // Guardar algunos trabajadores
        archivo.guardarTrabajador(new Trabajador("Juan Pérez", 1001, 5000.0));
        archivo.guardarTrabajador(new Trabajador("María García", 1002, 6500.0));
        archivo.guardarTrabajador(new Trabajador("Carlos López", 1003, 4500.0));
        archivo.guardarTrabajador(new Trabajador("Ana Martínez", 1004, 7000.0));
        
        // Mostrar todos los trabajadores
        archivo.mostrarTodos();
        
        // Aumentar salario del trabajador con carnet 1002 en un 10%
        System.out.println("\n=== Aumentando salario ===");
        archivo.aumentaSalario(1002, 10);
        
        // Buscar trabajador con mayor salario
        System.out.println("\n=== Trabajador con mayor salario ===");
        Trabajador mayor = archivo.buscarMayorSalario();
        if (mayor != null) {
            System.out.println(mayor);
        }
        
        // Ordenar trabajadores por salario
        System.out.println("\n=== Ordenando por salario ===");
        archivo.ordenarPorSalario();
        archivo.mostrarTodos();
    }
}