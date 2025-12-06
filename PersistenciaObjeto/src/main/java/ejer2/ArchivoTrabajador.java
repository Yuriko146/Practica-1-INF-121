/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;
import java.io.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ArchivoTrabajador {
    private String nombreArch;
    
    public ArchivoTrabajador() {
        this.nombreArch = "";
    }
    
    // a) Implementa un método para crear y guardar el archivo
    public void crearArchivo(String nombreArchivo) {
        this.nombreArch = nombreArchivo;
        try {
            File archivo = new File(nombreArchivo);
            // Si el archivo existe, lo eliminamos para empezar de cero
            if (archivo.exists()) {
                archivo.delete();
                System.out.println("Archivo anterior eliminado.");
            }
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + nombreArchivo);
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    
    // b) Implementa un método para guardar trabajadores
    public void guardarTrabajador(Trabajador t) {
        List<Trabajador> trabajadores = leerTodos();
        trabajadores.add(t);
        reescribirArchivo(trabajadores);
        System.out.println("Trabajador guardado correctamente.");
    }
    
    // c) Implementa un método para aumentar el salario de un trabajador t
    public void aumentaSalario(int carnet, double porcentaje) {
        List<Trabajador> trabajadores = leerTodos();
        boolean encontrado = false;
        
        for (Trabajador t : trabajadores) {
            if (t.getCarnet() == carnet) {
                double nuevoSalario = t.getSalario() * (1 + porcentaje / 100);
                t.setSalario(nuevoSalario);
                encontrado = true;
                System.out.println("Salario aumentado. Nuevo salario: " + nuevoSalario);
                break;
            }
        }
        
        if (encontrado) {
            reescribirArchivo(trabajadores);
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }
    
    // d) Buscar el trabajador con el mayor salario
    public Trabajador buscarMayorSalario() {
        List<Trabajador> trabajadores = leerTodos();
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores en el archivo.");
            return null;
        }
        
        Trabajador mayor = trabajadores.get(0);
        for (Trabajador t : trabajadores) {
            if (t.getSalario() > mayor.getSalario()) {
                mayor = t;
            }
        }
        return mayor;
    }
    
    // e) Ordenar a los trabajadores por su salario
    public void ordenarPorSalario() {
        List<Trabajador> trabajadores = leerTodos();
        trabajadores.sort((t1, t2) -> Double.compare(t1.getSalario(), t2.getSalario()));
        reescribirArchivo(trabajadores);
        System.out.println("Trabajadores ordenados por salario.");
    }
    
    // Método auxiliar para leer todos los trabajadores
    private List<Trabajador> leerTodos() {
        List<Trabajador> trabajadores = new ArrayList<>();
        File file = new File(nombreArch);
        
        if (!file.exists() || file.length() == 0) {
            return trabajadores;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(nombreArch))) {
            while (true) {
                try {
                    Trabajador t = (Trabajador) ois.readObject();
                    trabajadores.add(t);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return trabajadores;
    }
    
    // Método auxiliar para reescribir el archivo
    private void reescribirArchivo(List<Trabajador> trabajadores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(nombreArch))) {
            for (Trabajador t : trabajadores) {
                oos.writeObject(t);
            }
        } catch (IOException e) {
            System.out.println("Error al reescribir archivo: " + e.getMessage());
        }
    }
    
    // Método para mostrar todos los trabajadores
    public void mostrarTodos() {
        List<Trabajador> trabajadores = leerTodos();
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores registrados.");
        } else {
            System.out.println("\n=== Lista de Trabajadores ===");
            for (Trabajador t : trabajadores) {
                System.out.println(t);
            }
        }
    }
}