/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Usuario
 */
public class ArchivoProducto {
    private String nomA;
    private java.util.ArrayList<Producto> productos;
    
    // Constructor
    public ArchivoProducto(String nomA) {
        this.nomA = nomA;
        this.productos = new java.util.ArrayList<>();
    }
    
    // a) Implementar el diagrama de clases (ya implementado)
    
    // b) Implementa guardarProducto(Producto p) para almacenar productos
    public void guardaProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto guardado: " + p);
    }
    
    // Método para crear archivo (simulado)
    public void crearArchivo() {
        productos.clear();
        System.out.println("Archivo '" + nomA + "' creado");
    }
    
    // c) Implementa buscarProducto(int c) buscando el código, para mostrar los datos de un producto
    public Producto buscaProducto(int c) {
        for (Producto p : productos) {
            if (p.getCodigo() == c) {
                System.out.println("Producto encontrado: " + p);
                return p;
            }
        }
        System.out.println("Producto con código " + c + " no encontrado");
        return null;
    }
    
    // d) Calcular el promedio de precios de los productos
    public float calcularPromedioPrecios() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para calcular el promedio");
            return 0;
        }
        
        float suma = 0;
        for (Producto p : productos) {
            suma += p.getPrecio();
        }
        
        float promedio = suma / productos.size();
        System.out.println("Promedio de precios: " + promedio);
        return promedio;
    }
    
    // e) Mostrar el producto más caro
    public Producto mostrarProductoMasCaro() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el archivo");
            return null;
        }
        
        Producto masCaro = productos.get(0);
        for (Producto p : productos) {
            if (p.getPrecio() > masCaro.getPrecio()) {
                masCaro = p;
            }
        }
        
        System.out.println("Producto más caro: " + masCaro);
        return masCaro;
    }
    
    // Método auxiliar para mostrar todos los productos
    public void mostrarTodosProductos() {
        System.out.println("\n--- Lista de Productos en '" + nomA + "' ---");
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
        System.out.println("----------------------------------\n");
    }
}