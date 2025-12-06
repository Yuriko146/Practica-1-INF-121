/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║       SISTEMA DE GESTIÓN DE ZOOLÓGICOS                   ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
        
        // Crear archivo de zoológicos
        ArchZoo archivo = new ArchZoo("zoologicos.dat");
        archivo.crear();
        
        // Crear zoológicos
        System.out.println("\n--- Creando zoológicos ---");
        Zoologico zoo1 = new Zoologico(1, "Zoo Central");
        Zoologico zoo2 = new Zoologico(2, "Bioparque Norte");
        Zoologico zoo3 = new Zoologico(3, "Parque Safari");
        Zoologico zoo4 = new Zoologico(4, "Zoo Metropolitano");
        Zoologico zoo5 = new Zoologico(5, "Reserva Ecológica");
        
        // Agregar animales al Zoo 1
        System.out.println("\n--- Agregando animales al Zoo Central ---");
        zoo1.adicionarAnimal(new Animal("León", "Simba", 3));
        zoo1.adicionarAnimal(new Animal("Tigre", "Shere Khan", 2));
        zoo1.adicionarAnimal(new Animal("Elefante", "Dumbo", 4));
        zoo1.adicionarAnimal(new Animal("Jirafa", "Melman", 5));
        zoo1.adicionarAnimal(new Animal("León", "Nala", 2));
        
        // Agregar animales al Zoo 2
        System.out.println("\n--- Agregando animales al Bioparque Norte ---");
        zoo2.adicionarAnimal(new Animal("Oso", "Baloo", 3));
        zoo2.adicionarAnimal(new Animal("Lobo", "Akela", 6));
        zoo2.adicionarAnimal(new Animal("Águila", "Zeus", 2));
        
        // Agregar animales al Zoo 3
        System.out.println("\n--- Agregando animales al Parque Safari ---");
        zoo3.adicionarAnimal(new Animal("León", "Leo", 4));
        zoo3.adicionarAnimal(new Animal("Cebra", "Marty", 8));
        zoo3.adicionarAnimal(new Animal("Hipopótamo", "Gloria", 3));
        zoo3.adicionarAnimal(new Animal("Rinoceronte", "Tank", 2));
        zoo3.adicionarAnimal(new Animal("Cocodrilo", "Tick-Tock", 3));
        zoo3.adicionarAnimal(new Animal("Flamenco", "Pink", 12));
        
        // Zoo 4 - Con pocos animales para demostrar traslado
        System.out.println("\n--- Agregando animales al Zoo Metropolitano ---");
        zoo4.adicionarAnimal(new Animal("Panda", "Po", 2));
        zoo4.adicionarAnimal(new Animal("Tigre", "Tigresa", 1));
        
        // Zoo 5 - Vacío para demostrar eliminación
        System.out.println("\n--- Zoo Reserva Ecológica (vacío) ---");
        
        // Agregar zoológicos al archivo
        System.out.println("\n--- Registrando zoológicos en el sistema ---");
        archivo.agregarZoologico(zoo1);
        archivo.agregarZoologico(zoo2);
        archivo.agregarZoologico(zoo3);
        archivo.agregarZoologico(zoo4);
        archivo.agregarZoologico(zoo5);
        
        // Listar todos los zoológicos
        archivo.listar();
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              EJECUCIÓN DE OPERACIONES                     ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        // a) Modificar un zoológico
        archivo.modificar(2, "Bioparque del Norte - Renovado");
        
        // b) Listar zoológicos con mayor variedad de animales
        archivo.listarZooMayorVariedad();
        
        // c) Listar y eliminar zoológicos vacíos
        archivo.listarYEliminarZoologicosVacios();
        
        // d) Mostrar animales de una especie específica
        archivo.mostrarAnimalesEspecieX("León");
        
        // e) Mover animales de un zoológico a otro
        archivo.moverAnimales(4, 1);
        
        // a) Eliminar un zoológico
        archivo.eliminar(3);
        
        // Listar estado final
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║              ESTADO FINAL DEL SISTEMA                     ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        archivo.listar();
        
        // Estadísticas finales
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("ESTADÍSTICAS FINALES:");
        System.out.println("Total de zoológicos activos: " + archivo.getZoologicos().size());
        
        int totalAnimales = 0;
        for (Zoologico zoo : archivo.getZoologicos()) {
            totalAnimales += zoo.getNroAnimales();
        }
        System.out.println("Total de animales en el sistema: " + totalAnimales);
        System.out.println("═══════════════════════════════════════════════════════════\n");
    }
}