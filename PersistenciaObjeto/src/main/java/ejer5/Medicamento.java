/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Usuario
 */
public class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;
    
    // Constructor
    public Medicamento() {
        this.nombre = "";
        this.codMedicamento = 0;
        this.tipo = "";
        this.precio = 0.0;
    }
    
    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    // Método leer()
    public void leer() {
        System.out.println("Leyendo medicamento...");
    }
    
    // Método mostrar()
    public void mostrar() {
        System.out.println("Medicamento: " + nombre + ", Código: " + codMedicamento + 
                         ", Tipo: " + tipo + ", Precio: $" + precio);
    }
    
    // Método getTipo()
    public String getTipo() {
        return tipo;
    }
    
    // Método getPrecio()
    public double getPrecio() {
        return precio;
    }
    
    // Getters adicionales
    public String getNombre() {
        return nombre;
    }
    
    public int getCodMedicamento() {
        return codMedicamento;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodMedicamento(int codMedicamento) {
        this.codMedicamento = codMedicamento;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Medicamento[nombre=" + nombre + ", codigo=" + codMedicamento + 
               ", tipo=" + tipo + ", precio=$" + precio + "]";
    }
}