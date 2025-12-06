/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        // Crear archivo de productos
        ArchivoProducto archivo = new ArchivoProducto("productos.dat");
        archivo.crearArchivo();
        
        System.out.println("=== PRUEBA DEL SISTEMA DE PRODUCTOS ===\n");
        
        // b) Guardar productos
        System.out.println("--- Guardando productos ---");
        archivo.guardaProducto(new Producto(101, "Laptop", 1200.50f));
        archivo.guardaProducto(new Producto(102, "Mouse", 25.99f));
        archivo.guardaProducto(new Producto(103, "Teclado", 45.75f));
        archivo.guardaProducto(new Producto(104, "Monitor", 350.00f));
        archivo.guardaProducto(new Producto(105, "Auriculares", 89.99f));
        
        // Mostrar todos los productos
        archivo.mostrarTodosProductos();
        
        // c) Buscar producto por código
        System.out.println("--- Buscando productos ---");
        archivo.buscaProducto(103);
        archivo.buscaProducto(999); // Producto que no existe
        System.out.println();
        
        // d) Calcular promedio de precios
        System.out.println("--- Calculando promedio de precios ---");
        archivo.calcularPromedioPrecios();
        System.out.println();
        
        // e) Mostrar producto más caro
        System.out.println("--- Mostrando producto más caro ---");
        archivo.mostrarProductoMasCaro();
    }
}
