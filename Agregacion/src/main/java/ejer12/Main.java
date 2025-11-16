/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer12;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 12: SISTEMA HOSPITAL-DOCTOR =====");
        System.out.println("(Relación de Agregación)\n");
        
        // a) Crear doctores
        System.out.println("=== CREANDO DOCTORES ===");
        Doctor doc1 = new Doctor("María Pérez", "Cardiología", "MP-12345");
        Doctor doc2 = new Doctor("Juan García", "Pediatría", "JG-23456");
        Doctor doc3 = new Doctor("Ana Torres", "Traumatología", "AT-34567");
        Doctor doc4 = new Doctor("Carlos López", "Cardiología", "CL-45678");
        Doctor doc5 = new Doctor("Laura Mamani", "Neurología", "LM-56789");
        
        System.out.println("✓ 5 doctores creados\n");
        
        // b) Crear hospitales
        System.out.println("=== CREANDO HOSPITALES ===");
        Hospital hospital1 = new Hospital("Hospital San Juan de Dios", "Av. Arce #1234");
        Hospital hospital2 = new Hospital("Clínica Los Andes", "Calle Murillo #567");
        Hospital hospital3 = new Hospital("Hospital Obrero", "Av. Brasil #890");
        
        System.out.println("✓ 3 hospitales creados\n");
        
        // c) Asignar doctores a hospitales
        // IMPORTANTE: En agregación, un doctor puede trabajar en múltiples hospitales
        System.out.println("=== ASIGNANDO DOCTORES A HOSPITALES ===\n");
        
        System.out.println("--- Hospital San Juan de Dios ---");
        hospital1.asignarDoctor(doc1);
        hospital1.asignarDoctor(doc2);
        hospital1.asignarDoctor(doc3);
        
        System.out.println("\n--- Clínica Los Andes ---");
        hospital2.asignarDoctor(doc1); // Doc1 trabaja en 2 hospitales
        hospital2.asignarDoctor(doc4);
        hospital2.asignarDoctor(doc5);
        
        System.out.println("\n--- Hospital Obrero ---");
        hospital3.asignarDoctor(doc2); // Doc2 trabaja en 2 hospitales
        hospital3.asignarDoctor(doc3); // Doc3 trabaja en 2 hospitales
        hospital3.asignarDoctor(doc5); // Doc5 trabaja en 2 hospitales
        
        // c) Mostrar doctores de cada hospital
        System.out.println("\n\n=== MOSTRANDO DOCTORES POR HOSPITAL ===");
        hospital1.mostrarDoctores();
        hospital2.mostrarDoctores();
        hospital3.mostrarDoctores();
        
        // Demostrar que los doctores pueden trabajar en múltiples hospitales
        System.out.println("\n\n=== DOCTORES QUE TRABAJAN EN MÚLTIPLES HOSPITALES ===");
        System.out.println("Dr./Dra. " + doc1.getNombre() + " trabaja en:");
        System.out.println("  - " + hospital1.getNombre());
        System.out.println("  - " + hospital2.getNombre());
        
        System.out.println("\nDr./Dra. " + doc2.getNombre() + " trabaja en:");
        System.out.println("  - " + hospital1.getNombre());
        System.out.println("  - " + hospital3.getNombre());
        
        System.out.println("\nDr./Dra. " + doc3.getNombre() + " trabaja en:");
        System.out.println("  - " + hospital1.getNombre());
        System.out.println("  - " + hospital3.getNombre());
        
        // Buscar doctores por especialidad en cada hospital
        System.out.println("\n\n=== BÚSQUEDA POR ESPECIALIDAD ===");
        hospital1.buscarPorEspecialidad("Cardiología");
        hospital2.buscarPorEspecialidad("Cardiología");
        
        // Remover un doctor de un hospital (no lo elimina, solo lo desvincula)
        System.out.println("\n\n=== REMOVIENDO DOCTOR DE UN HOSPITAL ===");
        hospital1.removerDoctor(doc3);
        System.out.println("\nDespués de remover a Dr./Dra. " + doc3.getNombre() + 
                         " del " + hospital1.getNombre() + ":");
        hospital1.mostrarDoctores();
        
        System.out.println("\nPero Dr./Dra. " + doc3.getNombre() + 
                         " aún trabaja en " + hospital3.getNombre() + ":");
        hospital3.mostrarDoctores();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
        System.out.println("\nNOTA: La relación de AGREGACIÓN permite que los doctores");
        System.out.println("existan independientemente de los hospitales y puedan");
        System.out.println("trabajar en múltiples hospitales simultáneamente.");
    }
}
