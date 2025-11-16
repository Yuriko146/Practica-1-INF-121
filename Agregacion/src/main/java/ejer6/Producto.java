/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class Producto {
    protected String nombre;
    protected double precio;
    protected String codigo;
    protected int stock;
    
    public Producto(String nombre, double precio, String codigo, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + 
                         " | Código: " + codigo + " | Stock: " + stock);
    }
}

// Clase Medicamento (hereda de Producto)
class Medicamento extends Producto {
    private String principioActivo;
    private String laboratorio;
    
    public Medicamento(String nombre, double precio, String codigo, int stock,
                      String principioActivo, String laboratorio) {
        super(nombre, precio, codigo, stock);
        this.principioActivo = principioActivo;
        this.laboratorio = laboratorio;
    }
    
    public String getPrincipioActivo() {
        return principioActivo;
    }
    
    public String getLaboratorio() {
        return laboratorio;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("MEDICAMENTO: " + nombre + " | $" + precio + 
                         " | P.A: " + principioActivo + " | Lab: " + laboratorio + 
                         " | Stock: " + stock);
    }
}
