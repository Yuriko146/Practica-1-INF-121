/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Usuario
 */
public class Prestamo {
    private int codCliente;
    private int codLibro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    // Constructor
    public Prestamo() {
        this.codCliente = 0;
        this.codLibro = 0;
        this.fechaPrestamo = "";
        this.fechaDevolucion = "";
    }
    
    public Prestamo(int codCliente, int codLibro, String fechaPrestamo, String fechaDevolucion) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de Prestamo - tipo: " + type);
    }
    
    // Getters
    public int getCodCliente() {
        return codCliente;
    }
    
    public int getCodLibro() {
        return codLibro;
    }
    
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    // Setters
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }
    
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    @Override
    public String toString() {
        return "Prestamo[codCliente=" + codCliente + ", codLibro=" + codLibro + 
               ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + "]";
    }
}