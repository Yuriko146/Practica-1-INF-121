/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

/**
 *
 * @author Usuario
 */
public class Animal {
    private String especie;
    private String nombre;
    private int cantidad;
    
    // Constructor
    public Animal() {
        this.especie = "";
        this.nombre = "";
        this.cantidad = 0;
    }
    
    public Animal(String especie, String nombre, int cantidad) {
        this.especie = especie;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    // Getters
    public String getEspecie() {
        return especie;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    // Setters
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Animal[especie='" + especie + "', nombre='" + nombre + "', cantidad=" + cantidad + "]";
    }
}
