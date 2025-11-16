/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 4: SISTEMA DE INVENTARIO =====\n");
        
        Inventario inventario = new Inventario();
        
        // Prueba 1: Agregar productos exitosamente
        System.out.println("=== PRUEBA 1: AGREGAR PRODUCTOS EXITOSAMENTE ===");
        try {
            Producto p1 = new Producto("P001", "Laptop Dell", 5500, 10);
            Producto p2 = new Producto("P002", "Mouse Logitech", 150, 25);
            Producto p3 = new Producto("P003", "Teclado Mecánico", 450, 15);
            
            inventario.agregarProducto(p1);
            inventario.agregarProducto(p2);
            inventario.agregarProducto(p3);
            System.out.println("✓ Todos los productos agregados correctamente\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        inventario.mostrarInventario();
        
        // Prueba 2: Intentar agregar producto con código duplicado
        System.out.println("=== PRUEBA 2: CÓDIGO DUPLICADO ===");
        try {
            Producto p4 = new Producto("P001", "Monitor Samsung", 1200, 8);
            inventario.agregarProducto(p4);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 3: Intentar agregar producto con precio negativo
        System.out.println("=== PRUEBA 3: PRECIO NEGATIVO ===");
        try {
            Producto p5 = new Producto("P004", "Producto Inválido", -500, 10);
            inventario.agregarProducto(p5);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 4: Intentar agregar producto con stock negativo
        System.out.println("=== PRUEBA 4: STOCK NEGATIVO ===");
        try {
            Producto p6 = new Producto("P005", "Producto Inválido", 200, -5);
            inventario.agregarProducto(p6);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 5: Buscar producto existente
        System.out.println("=== PRUEBA 5: BUSCAR PRODUCTO EXISTENTE ===");
        try {
            Producto encontrado = inventario.buscarProducto("P002");
            System.out.println("✓ Producto encontrado:");
            encontrado.mostrarInfo();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Prueba 6: Buscar producto inexistente
        System.out.println("=== PRUEBA 6: BUSCAR PRODUCTO INEXISTENTE ===");
        try {
            Producto encontrado = inventario.buscarProducto("P999");
            encontrado.mostrarInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 7: Vender producto con stock suficiente
        System.out.println("=== PRUEBA 7: VENTA CON STOCK SUFICIENTE ===");
        try {
            inventario.venderProducto("P002", 5);
            System.out.println();
        } catch (Exception e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        inventario.mostrarInventario();
        
        // Prueba 8: Vender producto con stock insuficiente
        System.out.println("=== PRUEBA 8: VENTA CON STOCK INSUFICIENTE ===");
        try {
            inventario.venderProducto("P002", 30);
        } catch (IllegalStateException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Prueba 9: Vender producto inexistente
        System.out.println("=== PRUEBA 9: VENDER PRODUCTO INEXISTENTE ===");
        try {
            inventario.venderProducto("P999", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        } catch (IllegalStateException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Prueba 10: Múltiples ventas
        System.out.println("=== PRUEBA 10: MÚLTIPLES VENTAS ===");
        try {
            inventario.venderProducto("P001", 3);
            inventario.venderProducto("P003", 5);
            System.out.println("✓ Ventas realizadas exitosamente\n");
        } catch (Exception e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Mostrar inventario final
        System.out.println("=== INVENTARIO FINAL ===");
        inventario.mostrarInventario();
        
        System.out.println("===== FIN DEL PROGRAMA =====");
    }
}