/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArchNiño {
    private String na;
    private ArrayList<Niño> niños;
    
    // Constructor
    public ArchNiño(String na) {
        this.na = na;
        this.niños = new ArrayList<>();
    }
    
    // a) Crear, leer, listar y mostrar
    public void crear() {
        niños.clear();
        System.out.println("Archivo '" + na + "' creado/reiniciado");
    }
    
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ingreso de datos del niño ---");
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Apellido Paterno: ");
        String apellidoPaterno = scanner.nextLine();
        
        System.out.print("Apellido Materno: ");
        String apellidoMaterno = scanner.nextLine();
        
        System.out.print("CI: ");
        String ci = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        
        System.out.print("Talla (XS, S, M, L, etc.): ");
        String talla = scanner.nextLine();
        
        Niño nino = new Niño(nombre, apellidoPaterno, apellidoMaterno, ci, edad, peso, talla);
        niños.add(nino);
        System.out.println("Niño agregado correctamente");
    }
    
    public void listar() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                        LISTADO DE NIÑOS                                   ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════╣");
        
        if (niños.isEmpty()) {
            System.out.println("║  No hay niños registrados                                                 ║");
        } else {
            for (int i = 0; i < niños.size(); i++) {
                System.out.println("║ " + (i + 1) + ". " + niños.get(i));
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════╝\n");
    }
    
    public void mostrar(int indice) {
        if (indice >= 0 && indice < niños.size()) {
            System.out.println("\n--- Datos del niño ---");
            System.out.println(niños.get(indice));
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void adicionar(Niño niño) {
        niños.add(niño);
        System.out.println("Niño agregado: " + niño.getNombre());
    }
    
    // b) Cuántos niños tienen el peso adecuado de acuerdo a su talla y edad
    public void contarNiñosPesoAdecuado() {
        System.out.println("\n=== b) Niños con peso adecuado según talla y edad ===");
        int contador = 0;
        
        for (Niño nino : niños) {
            if (nino.tienePesoAdecuado()) {
                contador++;
                System.out.println("✓ " + nino);
            }
        }
        
        System.out.println("\nTotal de niños con peso adecuado: " + contador);
        System.out.println("Total de niños registrados: " + niños.size());
        System.out.println();
    }
    
    // c) Mostrar a los niños que de acuerdo a la edad no tienen el peso o la talla adecuada
    public void mostrarNiñosPesoTallaInadecuada() {
        System.out.println("\n=== c) Niños con peso o talla inadecuada según edad ===");
        boolean hayProblemas = false;
        
        for (Niño nino : niños) {
            boolean pesoAdecuado = nino.tienePesoAdecuado();
            boolean tallaAdecuada = nino.tieneTallaAdecuada();
            
            if (!pesoAdecuado || !tallaAdecuada) {
                System.out.println("\n⚠ " + nino);
                
                if (!pesoAdecuado) {
                    System.out.println("   ► Peso inadecuado para su edad");
                }
                if (!tallaAdecuada) {
                    System.out.println("   ► Talla inadecuada para su edad");
                }
                hayProblemas = true;
            }
        }
        
        if (!hayProblemas) {
            System.out.println("Todos los niños tienen peso y talla adecuados");
        }
        System.out.println();
    }
    
    // d) Determinar el promedio de edad en los niños
    public void determinarPromedioEdad() {
        System.out.println("\n=== d) Promedio de edad de los niños ===");
        
        if (niños.isEmpty()) {
            System.out.println("No hay niños registrados");
            return;
        }
        
        int sumaEdades = 0;
        for (Niño nino : niños) {
            sumaEdades += nino.getEdad();
        }
        
        double promedio = (double) sumaEdades / niños.size();
        
        System.out.println("Total de niños: " + niños.size());
        System.out.println("Suma de edades: " + sumaEdades + " años");
        System.out.println("Promedio de edad: " + String.format("%.2f", promedio) + " años");
        System.out.println();
    }
    
    // e) Buscar al niño con el carnet x
    public void buscarNiñoPorCI(String ciX) {
        System.out.println("\n=== e) Buscar niño por CI: " + ciX + " ===");
        boolean encontrado = false;
        
        for (Niño nino : niños) {
            if (nino.getCi().equals(ciX)) {
                System.out.println("✓ Niño encontrado:");
                System.out.println(nino);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("✗ No se encontró ningún niño con CI: " + ciX);
        }
        System.out.println();
    }
    
    // f) Mostrar a los niños con la talla más alta
    public void mostrarNiñosTallaMasAlta() {
        System.out.println("\n=== f) Niños con la talla más alta ===");
        
        if (niños.isEmpty()) {
            System.out.println("No hay niños registrados");
            return;
        }
        
        // Convertir tallas a valores numéricos para comparar
        double tallaMaxima = 0;
        String tallaMaximaStr = "";
        
        for (Niño niño : niños) {
            double tallaValor = convertirTallaANumero(niño.getTalla());
            if (tallaValor > tallaMaxima) {
                tallaMaxima = tallaValor;
                tallaMaximaStr = niño.getTalla();
            }
        }
        
        System.out.println("Talla más alta encontrada: " + tallaMaximaStr);
        System.out.println("\nNiños con esta talla:");
        
        for (Niño niño : niños) {
            if (niño.getTalla().equalsIgnoreCase(tallaMaximaStr)) {
                System.out.println("  • " + niño);
            }
        }
        System.out.println();
    }
    
    // Método auxiliar para convertir tallas a números
    private double convertirTallaANumero(String talla) {
        switch(talla.toUpperCase()) {
            case "2T": return 2.0;
            case "3T": return 3.0;
            case "4T": return 4.0;
            case "XS": return 5.0;
            case "S": return 6.0;
            case "M": return 7.0;
            case "L": return 8.0;
            case "XL": return 9.0;
            default: return 0.0;
        }
    }
    
    public ArrayList<Niño> getNiños() {
        return niños;
    }
}
