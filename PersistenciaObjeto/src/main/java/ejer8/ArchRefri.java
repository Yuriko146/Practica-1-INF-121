/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArchRefri {
    private String nombre;
    private ArrayList<Alimento> alimentos;
    
    // Constructor
    public ArchRefri(String nombre) {
        this.nombre = nombre;
        this.alimentos = new ArrayList<>();
    }
    
    // Método para crear el archivo
    public void crear() {
        alimentos.clear();
        System.out.println("Refrigerador '" + nombre + "' creado/reiniciado");
    }
    
    // Método para agregar alimento
    public void agregarAlimento(Alimento alimento) {
        alimentos.add(alimento);
        System.out.println("Alimento agregado: " + alimento.getNombre());
    }
    
    // Método para listar todos los alimentos
    public void listarAlimentos() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║              CONTENIDO DEL REFRIGERADOR: " + nombre + "                    ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        
        if (alimentos.isEmpty()) {
            System.out.println("║  El refrigerador está vacío                                           ║");
        } else {
            for (int i = 0; i < alimentos.size(); i++) {
                System.out.println("║ " + (i + 1) + ". " + alimentos.get(i));
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
    
    // a) Implementar los métodos para Crear, Modificar por nombre y Eliminar por nombre
    
    // Método Crear - ya implementado arriba
    
    // Método Modificar por nombre
    public void modificarPorNombre(String nombreBuscar, String nuevoNombre, 
                                   String nuevaFecha, int nuevaCantidad) {
        System.out.println("\n=== a) Modificar alimento por nombre ===");
        boolean encontrado = false;
        
        for (Alimento alimento : alimentos) {
            if (alimento.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Alimento encontrado: " + alimento);
                
                // Modificar datos
                if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                    alimento.setNombre(nuevoNombre);
                }
                if (nuevaFecha != null && !nuevaFecha.isEmpty()) {
                    alimento.setFechaVencimiento(nuevaFecha);
                }
                if (nuevaCantidad >= 0) {
                    alimento.setCantidad(nuevaCantidad);
                }
                
                System.out.println("Alimento modificado: " + alimento);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró el alimento: " + nombreBuscar);
        }
        System.out.println();
    }
    
    // Método Eliminar por nombre
    public void eliminarPorNombre(String nombreEliminar) {
        System.out.println("\n=== a) Eliminar alimento por nombre ===");
        boolean eliminado = false;
        
        for (int i = 0; i < alimentos.size(); i++) {
            if (alimentos.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                Alimento alimentoEliminado = alimentos.remove(i);
                System.out.println("Alimento eliminado: " + alimentoEliminado);
                eliminado = true;
                break;
            }
        }
        
        if (!eliminado) {
            System.out.println("No se encontró el alimento: " + nombreEliminar);
        }
        System.out.println();
    }
    
    // b) Mostrar los alimentos que caducaron antes de una fecha dada X
    public void mostrarAlimentosCaducadosAntes(String fechaX) {
        System.out.println("\n=== b) Alimentos caducados antes de: " + fechaX + " ===");
        boolean encontrado = false;
        
        for (Alimento alimento : alimentos) {
            if (alimento.caducoAntesDe(fechaX)) {
                System.out.println("  ⚠️ " + alimento);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay alimentos que hayan caducado antes de esta fecha");
        }
        System.out.println();
    }
    
    // c) Eliminar los alimentos que tengan cantidad 0
    public void eliminarAlimentosCantidadCero() {
        System.out.println("\n=== c) Eliminar alimentos con cantidad 0 ===");
        
        ArrayList<Alimento> alimentosAEliminar = new ArrayList<>();
        
        for (Alimento alimento : alimentos) {
            if (alimento.getCantidad() == 0) {
                alimentosAEliminar.add(alimento);
                System.out.println("  Eliminando: " + alimento.getNombre());
            }
        }
        
        alimentos.removeAll(alimentosAEliminar);
        
        System.out.println("Total de alimentos eliminados: " + alimentosAEliminar.size());
        System.out.println();
    }
    
    // d) Buscar los alimentos ya vencidos
    public void buscarAlimentosVencidos() {
        System.out.println("\n=== d) Alimentos ya vencidos ===");
        boolean encontrado = false;
        
        for (Alimento alimento : alimentos) {
            if (alimento.estaVencido()) {
                System.out.println("  ⚠️ " + alimento);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("✓ No hay alimentos vencidos");
        }
        System.out.println();
    }
    
    // e) Mostrar el alimento que tenga más cantidad en el refri
    public void mostrarAlimentoMayorCantidad() {
        System.out.println("\n=== e) Alimento con mayor cantidad ===");
        
        if (alimentos.isEmpty()) {
            System.out.println("El refrigerador está vacío");
            return;
        }
        
        Alimento alimentoMaximo = alimentos.get(0);
        int cantidadMaxima = alimentoMaximo.getCantidad();
        
        for (Alimento alimento : alimentos) {
            if (alimento.getCantidad() > cantidadMaxima) {
                cantidadMaxima = alimento.getCantidad();
                alimentoMaximo = alimento;
            }
        }
        
        System.out.println("Alimento con mayor cantidad:");
        System.out.println("  " + alimentoMaximo);
        System.out.println();
    }
    
    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }
    
    public String getNombre() {
        return nombre;
    }
}