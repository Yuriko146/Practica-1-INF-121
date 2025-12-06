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
public class ArchiNota {
    private String nombreArchi;
    private ArrayList<Nota> notas;
    
    // Constructor
    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
        this.notas = new ArrayList<>();
    }
    
    // a) Implementar el diagrama de clases (ya implementado)
    
    // b) Implementar un método para agregar a varios estudiantes
    public void agregarEstudiantes(List<Nota> listaNotas) {
        for (Nota nota : listaNotas) {
            notas.add(nota);
            System.out.println("Nota agregada: " + nota);
        }
        System.out.println("Total de notas agregadas: " + listaNotas.size() + "\n");
    }
    
    // Método para agregar una sola nota
    public void agregarNota(Nota nota) {
        notas.add(nota);
        System.out.println("Nota agregada: " + nota);
    }
    
    // c) Obtener el promedio de notas de todos los estudiantes
    public float obtenerPromedioNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas");
            return 0;
        }
        
        float suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaFinal();
        }
        
        float promedio = suma / notas.size();
        System.out.println("Promedio general de notas: " + promedio);
        return promedio;
    }
    
    // d) Buscar al o los estudiantes con la mejor nota
    public List<Nota> buscarMejoresEstudiantes() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas");
            return new ArrayList<>();
        }
        
        // Encontrar la nota máxima
        float notaMaxima = notas.get(0).getNotaFinal();
        for (Nota nota : notas) {
            if (nota.getNotaFinal() > notaMaxima) {
                notaMaxima = nota.getNotaFinal();
            }
        }
        
        // Buscar todos los estudiantes con la nota máxima
        List<Nota> mejoresEstudiantes = new ArrayList<>();
        for (Nota nota : notas) {
            if (nota.getNotaFinal() == notaMaxima) {
                mejoresEstudiantes.add(nota);
            }
        }
        
        System.out.println("\n--- Estudiantes con la mejor nota (" + notaMaxima + ") ---");
        for (Nota nota : mejoresEstudiantes) {
            System.out.println(nota);
        }
        
        return mejoresEstudiantes;
    }
    
    // e) Eliminar a todos los estudiantes de una determinada materia
    public void eliminarPorMateria(String materia) {
        int cantidadEliminada = 0;
        ArrayList<Nota> notasAEliminar = new ArrayList<>();
        
        for (Nota nota : notas) {
            if (nota.getMateria().equalsIgnoreCase(materia)) {
                notasAEliminar.add(nota);
                cantidadEliminada++;
            }
        }
        
        notas.removeAll(notasAEliminar);
        
        System.out.println("\n--- Eliminación por materia ---");
        System.out.println("Materia: " + materia);
        System.out.println("Estudiantes eliminados: " + cantidadEliminada);
    }
    
    // Método auxiliar para mostrar todas las notas
    public void mostrarTodasNotas() {
        System.out.println("\n--- Archivo: " + nombreArchi + " ---");
        System.out.println("Total de registros: " + notas.size());
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas");
        } else {
            for (Nota nota : notas) {
                System.out.println(nota);
            }
        }
        System.out.println("----------------------------------\n");
    }
    
    // Método para mostrar notas por materia
    public void mostrarPorMateria(String materia) {
        System.out.println("\n--- Notas de la materia: " + materia + " ---");
        boolean encontrado = false;
        for (Nota nota : notas) {
            if (nota.getMateria().equalsIgnoreCase(materia)) {
                System.out.println(nota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay estudiantes en esta materia");
        }
        System.out.println();
    }
}