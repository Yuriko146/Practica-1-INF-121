/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer13;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE FRUTAS =====\n");
        
        // a) Instanciar 3 frutas de 3 maneras diferentes (mínimo 2 vitaminas)
        System.out.println("--- CREANDO FRUTAS ---");
        
        // Forma 1: Constructor con vitaminas directas
        String[] vitaminas1 = {"Vitamina C", "Vitamina B6"};
        Fruta fruta1 = new Fruta("Kiwi", "Subtropical", vitaminas1);
        
        // Forma 2: Constructor con número y vitaminas
        String[] vitaminas2 = {"Vitamina A", "Vitamina C", "Vitamina E"};
        Fruta fruta2 = new Fruta("Naranja", "Citrica", 3, vitaminas2);
        
        // Forma 3: Constructor con vitaminas (4 vitaminas)
        String[] vitaminas3 = {"Vitamina D", "Vitamina B12", "Vitamina C", "Vitamina K"};
        Fruta fruta3 = new Fruta("Mango", "Tropical", vitaminas3);
        
        System.out.println("Frutas creadas exitosamente!\n");
        
        // b) Verificar cuál fruta tiene más vitaminas
        System.out.println("--- FRUTA CON MAS VITAMINAS ---");
        Fruta frutaConMasVitaminas = fruta1;
        if (fruta2.getNroVitaminas() > frutaConMasVitaminas.getNroVitaminas()) {
            frutaConMasVitaminas = fruta2;
        }
        if (fruta3.getNroVitaminas() > frutaConMasVitaminas.getNroVitaminas()) {
            frutaConMasVitaminas = fruta3;
        }
        System.out.println("La fruta con mas vitaminas es: " + frutaConMasVitaminas.getNombre() +
                          " con " + frutaConMasVitaminas.getNroVitaminas() + " vitaminas\n");
        
        // c) Mostrar vitaminas de cada fruta
        System.out.println("--- VITAMINAS POR FRUTA ---");
        fruta1.mostrarVitaminas();
        System.out.println();
        fruta2.mostrarVitaminas();
        System.out.println();
        fruta3.mostrarVitaminas();
        System.out.println();
        
        // d) Contar vitaminas cítricas (con 'C')
        System.out.println("--- VITAMINAS CITRICAS ---");
        int totalCitricas = fruta1.contarCitricas() + fruta2.contarCitricas() + fruta3.contarCitricas();
        System.out.println("Kiwi tiene " + fruta1.contarCitricas() + " vitaminas citricas");
        System.out.println("Naranja tiene " + fruta2.contarCitricas() + " vitaminas citricas");
        System.out.println("Mango tiene " + fruta3.contarCitricas() + " vitaminas citricas");
        System.out.println("Total de vitaminas citricas: " + totalCitricas + "\n");
        
        // e) Ordenar vitaminas alfabéticamente
        System.out.println("--- ORDENANDO VITAMINAS ALFABETICAMENTE ---");
        fruta1.ordenarVitaminas();
        fruta2.ordenarVitaminas();
        fruta3.ordenarVitaminas();
        
        System.out.println("Vitaminas ordenadas:\n");
        fruta1.mostrarVitaminas();
        System.out.println();
        fruta2.mostrarVitaminas();
        System.out.println();
        fruta3.mostrarVitaminas();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
