/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stockInicial) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stockInicial;
    }
    
    public boolean vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
            return false;
        }
        
        if (cantidad <= stock) {
            stock -= cantidad;
            double totalVenta = cantidad * precio;
            System.out.println("Venta exitosa:");
            System.out.println("  - Producto: " + nombre);
            System.out.println("  - Cantidad vendida: " + cantidad);
            System.out.println("  - Total: Bs. " + totalVenta);
            System.out.println("  - Stock restante: " + stock);
            return true;
        } else {
            System.out.println("Stock insuficiente!");
            System.out.println("  - Stock disponible: " + stock);
            System.out.println("  - Cantidad solicitada: " + cantidad);
            return false;
        }
    }
    
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
            return;
        }
        
        stock += cantidad;
        System.out.println("Reabastecimiento exitoso:");
        System.out.println("  - Producto: " + nombre);
        System.out.println("  - Cantidad añadida: " + cantidad);
        System.out.println("  - Stock actual: " + stock);
    }
    public void mostrarInfo() {
        System.out.println("\n========== INFORMACIÓN DEL PRODUCTO ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Bs. " + precio);
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("==============================================\n");
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
}