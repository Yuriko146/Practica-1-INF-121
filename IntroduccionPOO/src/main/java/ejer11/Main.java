/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer11;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE CAFETERIA =====\n");
        System.out.println();
        System.out.println("--- CREANDO PRODUCTO ---");
        Producto cafe = new Producto("Cafe Americano", 15.50);
        System.out.println();
        
        // Mostrar información del producto
        System.out.println("--- INFORMACION DEL PRODUCTO ---");
        cafe.mostrarInfo();
        System.out.println();
        
        // Usar setters para modificar el producto
        System.out.println("--- MODIFICANDO PRODUCTO ---");
        cafe.setPrecio(18.00);
        System.out.println("Nuevo precio: Bs. " + cafe.getPrecio());
        System.out.println();
        
        // c) Crear un objeto Pedido
        System.out.println("--- CREANDO PEDIDO ---");
        Pedido pedido1 = new Pedido(101, "Registrado");
        System.out.println();
        
        // Mostrar información del pedido
        System.out.println("--- INFORMACION DEL PEDIDO ---");
        pedido1.mostrarInfo();
        System.out.println();
        
        // Cambiar estado del pedido usando setter
        System.out.println("--- ACTUALIZANDO ESTADO DEL PEDIDO ---");
        pedido1.setEstado("En preparacion");
        System.out.println("Nuevo estado: " + pedido1.getEstado());
        System.out.println();
        
        pedido1.setEstado("Entregado");
        System.out.println("Estado final: " + pedido1.getEstado());
        System.out.println();
        
        // Mostrar estado final de ambos objetos
        System.out.println("--- RESUMEN FINAL ---");
        cafe.mostrarInfo();
        System.out.println();
        pedido1.mostrarInfo();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}