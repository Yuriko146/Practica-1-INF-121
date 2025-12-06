/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES Y NOTAS ===\n");
        
        // Crear archivo de notas
        ArchiNota archivo = new ArchiNota("notas_2024.dat");
        
        // Crear estudiantes
        Estudiante est1 = new Estudiante("2021001", "Juan", "Pérez", "García", 20);
        Estudiante est2 = new Estudiante("2021002", "María", "López", "Martínez", 21);
        Estudiante est3 = new Estudiante("2021003", "Carlos", "Rodríguez", "Fernández", 22);
        Estudiante est4 = new Estudiante("2021004", "Ana", "Gómez", "Sánchez", 20);
        Estudiante est5 = new Estudiante("2021005", "Luis", "Torres", "Ramírez", 23);
        Estudiante est6 = new Estudiante("2021006", "Sofia", "Morales", "Castro", 21);
        
        // b) Agregar varios estudiantes con sus notas
        System.out.println("--- Agregando estudiantes ---");
        List<Nota> listaNotas = new ArrayList<>();
        listaNotas.add(new Nota("Programación", 85.5f, est1));
        listaNotas.add(new Nota("Matemáticas", 92.0f, est2));
        listaNotas.add(new Nota("Programación", 78.5f, est3));
        listaNotas.add(new Nota("Física", 88.0f, est4));
        listaNotas.add(new Nota("Matemáticas", 95.5f, est5));
        listaNotas.add(new Nota("Programación", 95.5f, est6));
        
        archivo.agregarEstudiantes(listaNotas);
        
        // Mostrar todas las notas
        archivo.mostrarTodasNotas();
        
        // c) Obtener promedio de notas
        System.out.println("--- Calculando promedio general ---");
        archivo.obtenerPromedioNotas();
        System.out.println();
        
        // d) Buscar estudiantes con la mejor nota
        archivo.buscarMejoresEstudiantes();
        System.out.println();
        
        // Mostrar estudiantes por materia antes de eliminar
        archivo.mostrarPorMateria("Programación");
        
        // e) Eliminar estudiantes de una materia
        archivo.eliminarPorMateria("Programación");
        
        // Mostrar todas las notas después de eliminar
        System.out.println("\n--- Después de eliminar Programación ---");
        archivo.mostrarTodasNotas();
        
        // Verificar el nuevo promedio
        System.out.println("--- Nuevo promedio después de eliminación ---");
        archivo.obtenerPromedioNotas();
    }
}