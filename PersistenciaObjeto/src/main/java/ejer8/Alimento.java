/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Alimento {
    private String nombre;
    private String fechaVencimiento;
    private int cantidad;
    
    // Constructor
    public Alimento() {
        this.nombre = "";
        this.fechaVencimiento = "";
        this.cantidad = 0;
    }
    
    public Alimento(String nombre, String fechaVencimiento, int cantidad) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Método para verificar si el alimento está vencido
    public boolean estaVencido() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaVenc = LocalDate.parse(fechaVencimiento, formatter);
            LocalDate fechaActual = LocalDate.now();
            return fechaVenc.isBefore(fechaActual);
        } catch (Exception e) {
            return false;
        }
    }
    
    // Método para verificar si caducó antes de una fecha dada
    public boolean caducoAntesDe(String fechaX) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaVenc = LocalDate.parse(fechaVencimiento, formatter);
            LocalDate fechaComparar = LocalDate.parse(fechaX, formatter);
            return fechaVenc.isBefore(fechaComparar);
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Alimento[nombre='" + nombre + "', fechaVenc=" + fechaVencimiento + 
               ", cantidad=" + cantidad + (estaVencido() ? " ⚠️ VENCIDO" : " ✓") + "]";
    }
}
