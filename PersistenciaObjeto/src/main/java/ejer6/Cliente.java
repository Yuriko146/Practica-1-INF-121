/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int codCliente;
    private String ci;
    private String nombre;
    private String apellido;
    
    // Constructor
    public Cliente() {
        this.codCliente = 0;
        this.ci = "";
        this.nombre = "";
        this.apellido = "";
    }
    
    public Cliente(int codCliente, String ci, String nombre, String apellido) {
        this.codCliente = codCliente;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de Cliente - tipo: " + type);
    }
    
    // Getters
    public int getCodCliente() {
        return codCliente;
    }
    
    public String getCi() {
        return ci;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    // Setters
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString() {
        return "Cliente[codigo=" + codCliente + ", CI=" + ci + 
               ", nombre='" + nombre + " " + apellido + "']";
    }
}