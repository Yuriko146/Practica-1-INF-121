/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    // c) Agregar producto con validaciones
    public void agregarProducto(Producto p) {
        // Validar que el precio no sea negativo
        if (p.getPrecio() < 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser negativo");
        }
        
        // Validar que el stock no sea negativo
        if (p.getStock() < 0) {
            throw new IllegalArgumentException("Error: El stock no puede ser negativo");
        }
        
        // Validar que el código no exista
        for (Producto prod : productos) {
            if (prod.getCodigo().equals(p.getCodigo())) {
                throw new IllegalArgumentException("Error: Ya existe un producto con el código " + p.getCodigo());
            }
        }
        
        productos.add(p);
        System.out.println("✓ Producto agregado: " + p.getNombre());
    }
    
    // d) Buscar producto por código
    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Error: Producto no encontrado con código " + codigo);
    }
    
    // e) Vender producto
    public void venderProducto(String codigo, int cantidad) {
        // Buscar el producto
        Producto producto = buscarProducto(codigo);
        
        // Verificar si hay stock suficiente
        if (producto.getStock() < cantidad) {
            throw new IllegalStateException("Error: Stock insuficiente. Disponible: " + 
                                          producto.getStock() + ", Solicitado: " + cantidad);
        }
        
        // Reducir el stock
        producto.setStock(producto.getStock() - cantidad);
        System.out.println("✓ Venta realizada: " + cantidad + " unidades de " + producto.getNombre());
        System.out.println("  Stock restante: " + producto.getStock());
    }
    
    public void mostrarInventario() {
        System.out.println("\n========== INVENTARIO ==========");
        if (productos.isEmpty()) {
            System.out.println("- Sin productos en inventario");
        } else {
            System.out.println("Total de productos: " + productos.size());
            System.out.println("--------------------------------");
            for (int i = 0; i < productos.size(); i++) {
                System.out.print((i + 1) + ". ");
                productos.get(i).mostrarInfo();
            }
        }
        System.out.println("================================\n");
    }
}
