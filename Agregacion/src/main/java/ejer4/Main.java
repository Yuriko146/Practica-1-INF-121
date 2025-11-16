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
        // a) Diagrama de clases (comentado en código)
        /*
         * DIAGRAMA DE CLASES:
         * 
         * +------------------+          +------------------+
         * |     Ropero       |          |       Ropa       |
         * +------------------+          +------------------+
         * | - material       |          | - tipo           |
         * | - ropas[20]      |◆-------->| - material       |
         * | - nroRopas       |   1   *  +------------------+
         * +------------------+          | + getTipo()      |
         * | + adicionarPrenda()|        | + getMaterial()  |
         * | + eliminarPrendas()|        | + toString()     |
         * | + mostrarPrendas() |        +------------------+
         * +------------------+
         * 
         * Composición: Ropero tiene un array de 20 Ropas
         */
        
        System.out.println("=== EJERCICIO 4: ROPERO ===\n");
        
        // Crear ropero
        Ropero miRopero = new Ropero("Madera");
        
        // b) Adicionar N prendas al ropero
        System.out.println("=== INCISO B: Adicionar prendas ===");
        miRopero.adicionarPrenda(new Ropa("Camisa", "Algodón"));
        miRopero.adicionarPrenda(new Ropa("Pantalón", "Jean"));
        miRopero.adicionarPrenda(new Ropa("Camisa", "Seda"));
        miRopero.adicionarPrenda(new Ropa("Chaqueta", "Cuero"));
        miRopero.adicionarPrenda(new Ropa("Pantalón", "Algodón"));
        miRopero.adicionarPrenda(new Ropa("Vestido", "Seda"));
        miRopero.adicionarPrenda(new Ropa("Suéter", "Lana"));
        
        // Mostrar todas las prendas
        miRopero.mostrarTodasPrendas();
        
        // d) Mostrar prendas de material X y tipo Y
        System.out.println("\n=== INCISO D: Mostrar prendas filtradas ===");
        miRopero.mostrarPrendasFiltradas("Algodón", "Camisa");
        miRopero.mostrarPrendasFiltradas("Seda", "Vestido");
        
        // c) Eliminar prendas de material X o tipo Y
        System.out.println("\n=== INCISO C: Eliminar prendas ===");
        System.out.println("Eliminando prendas de material 'Algodón' O tipo 'Chaqueta':");
        miRopero.eliminarPrendas("Algodón", "Chaqueta");
        
        // Mostrar prendas después de eliminar
        miRopero.mostrarTodasPrendas();
    }
}