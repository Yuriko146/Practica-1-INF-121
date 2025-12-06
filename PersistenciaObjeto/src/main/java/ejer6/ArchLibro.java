/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArchLibro {
    private String nomArch;
    private ArrayList<Libro> libros;
    
    // Constructor
    public ArchLibro(String nomArch) {
        this.nomArch = nomArch;
        this.libros = new ArrayList<>();
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de ArchLibro - tipo: " + type);
    }
    
    // Método para agregar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }
    
    // Método para listar todos los libros
    public void listarLibros() {
        System.out.println("\n=== LISTADO DE LIBROS ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados");
        } else {
            for (Libro l : libros) {
                System.out.println(l);
            }
        }
        System.out.println("========================\n");
    }
    
    // Método para buscar libro por código
    public Libro buscarLibro(int codigo) {
        for (Libro l : libros) {
            if (l.getCodLibro() == codigo) {
                return l;
            }
        }
        return null;
    }
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }
}