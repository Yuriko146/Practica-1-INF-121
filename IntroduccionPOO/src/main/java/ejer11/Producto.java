/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer11;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Producto creado: " + nombre);
    }
    
    protected void finalizar() {
        System.out.println("Producto destruido: " + nombre);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Bs. " + precio);
    }
}