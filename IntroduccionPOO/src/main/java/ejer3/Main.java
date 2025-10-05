/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTIÓN DE PRODUCTOS =====\n");
        
        // Crear producto: Laptop con precio Bs. 5000 y stock inicial de 10
        Producto laptop = new Producto("Laptop HP", 5000.0, 10);
        
        // Mostrar información inicial
        laptop.mostrarInfo();
        
        // Vender 3 laptops
        System.out.println("--- Venta 1 ---");
        laptop.vender(3);
        System.out.println();
        
        // Vender 5 laptops más
        System.out.println("--- Venta 2 ---");
        laptop.vender(5);
        System.out.println();
        
        // Intentar vender más de las que hay en stock
        System.out.println("--- Venta 3 (sin stock suficiente) ---");
        laptop.vender(5);
        System.out.println();
        
        // Reabastecer 15 unidades
        System.out.println("--- Reabastecimiento ---");
        laptop.reabastecer(15);
        System.out.println();
        
        // Vender después del reabastecimiento
        System.out.println("--- Venta 4 (después de reabastecer) ---");
        laptop.vender(10);
        System.out.println();
        
        // Mostrar información final
        laptop.mostrarInfo();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
