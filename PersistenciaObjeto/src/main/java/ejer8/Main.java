/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║       SISTEMA DE GESTIÓN DE REFRIGERADOR                 ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
        
        // Crear refrigerador
        ArchRefri refri = new ArchRefri("Refri Principal");
        refri.crear();
        
        // Agregar alimentos con diferentes fechas de vencimiento
        System.out.println("\n--- Agregando alimentos al refrigerador ---");
        refri.agregarAlimento(new Alimento("Leche", "15/12/2025", 3));
        refri.agregarAlimento(new Alimento("Yogurt", "05/12/2025", 5));
        refri.agregarAlimento(new Alimento("Queso", "20/12/2025", 2));
        refri.agregarAlimento(new Alimento("Jamón", "01/12/2025", 4));
        refri.agregarAlimento(new Alimento("Mantequilla", "25/12/2025", 0));
        refri.agregarAlimento(new Alimento("Huevos", "10/12/2025", 12));
        refri.agregarAlimento(new Alimento("Tomate", "03/12/2025", 0));
        refri.agregarAlimento(new Alimento("Lechuga", "08/12/2025", 2));
        refri.agregarAlimento(new Alimento("Zanahoria", "18/12/2025", 6));
        refri.agregarAlimento(new Alimento("Manzanas", "02/12/2025", 8));
        
        // Listar todos los alimentos
        refri.listarAlimentos();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              EJECUCIÓN DE OPERACIONES                     ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        // a) Modificar un alimento por nombre
        refri.modificarPorNombre("Leche", "Leche Descremada", "22/12/2025", 5);
        
        // a) Eliminar un alimento por nombre
        refri.eliminarPorNombre("Tomate");
        
        // b) Mostrar alimentos caducados antes de una fecha dada
        refri.mostrarAlimentosCaducadosAntes("07/12/2025");
        
        // c) Eliminar alimentos con cantidad 0
        refri.eliminarAlimentosCantidadCero();
        
        // d) Buscar alimentos ya vencidos
        refri.buscarAlimentosVencidos();
        
        // e) Mostrar alimento con mayor cantidad
        refri.mostrarAlimentoMayorCantidad();
        
        // Listar estado final del refrigerador
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              ESTADO FINAL DEL REFRIGERADOR                ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        refri.listarAlimentos();
        
        // Estadísticas finales
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("ESTADÍSTICAS FINALES:");
        System.out.println("Total de alimentos en el refrigerador: " + refri.getAlimentos().size());
        
        int vencidos = 0;
        int porVencer = 0;
        for (Alimento a : refri.getAlimentos()) {
            if (a.estaVencido()) {
                vencidos++;
            } else {
                porVencer++;
            }
        }
        System.out.println("Alimentos vencidos: " + vencidos);
        System.out.println("Alimentos por vencer: " + porVencer);
        System.out.println("═══════════════════════════════════════════════════════════\n");
    }
}