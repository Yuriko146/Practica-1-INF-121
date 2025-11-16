/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Farmacia {
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productos;
    
    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }
    
    public void mostrarInventario() {
        System.out.println("\n=== FARMACIA: " + nombre + " ===");
        System.out.println("Dirección: " + direccion);
        System.out.println("Total de productos: " + productos.size());
        System.out.println();
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public void buscarMedicamentos(String principio) {
        System.out.println("\nBuscando medicamentos con principio activo: " + principio);
        for (Producto p : productos) {
            if (p instanceof Medicamento) {
                Medicamento m = (Medicamento) p;
                if (m.getPrincipioActivo().equalsIgnoreCase(principio)) {
                    m.mostrarInfo();
                }
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }
}
