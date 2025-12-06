/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Usuario
 */
public class Libro {
    private int codLibro;
    private String titulo;
    private double precio;
    
    // Constructor
    public Libro() {
        this.codLibro = 0;
        this.titulo = "";
        this.precio = 0.0;
    }
    
    public Libro(int codLibro, String titulo, double precio) {
        this.codLibro = codLibro;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de Libro - tipo: " + type);
    }
    
    // Getters
    public int getCodLibro() {
        return codLibro;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    // Setters
    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Libro[codigo=" + codLibro + ", titulo='" + titulo + "', precio=$" + precio + "]";
    }
}
