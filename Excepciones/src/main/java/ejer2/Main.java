/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== CALCULADORA CON MANEJO DE ERRORES =====\n");
        
        // Prueba 1: Operaciones exitosas
        System.out.println("=== OPERACIONES EXITOSAS ===");
        try {
            double a = 10, b = 5;
            System.out.println(a + " + " + b + " = " + Calculadora.sumar(a, b));
            System.out.println(a + " - " + b + " = " + Calculadora.restar(a, b));
            System.out.println(a + " × " + b + " = " + Calculadora.multiplicar(a, b));
            System.out.println(a + " ÷ " + b + " = " + Calculadora.dividir(a, b));
            System.out.println("✓ Operaciones exitosas\n");
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage() + "\n");
        }
        
        // Prueba 2: División por cero
        System.out.println("=== PRUEBA: DIVISIÓN POR CERO ===");
        try {
            double resultado = Calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 3: Conversión exitosa
        System.out.println("=== PRUEBA: CONVERSIÓN EXITOSA ===");
        try {
            String valor = "123";
            int numero = Calculadora.convertirAEntero(valor);
            System.out.println("'" + valor + "' convertido a: " + numero);
            System.out.println("✓ Conversión exitosa\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Prueba 4: Conversión con texto inválido
        System.out.println("=== PRUEBA: CONVERSIÓN CON TEXTO INVÁLIDO ===");
        try {
            String valor = "abc123";
            int numero = Calculadora.convertirAEntero(valor);
            System.out.println("Resultado: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 5: Conversión con cadena vacía
        System.out.println("=== PRUEBA: CONVERSIÓN CON CADENA VACÍA ===");
        try {
            String valor = "";
            int numero = Calculadora.convertirAEntero(valor);
            System.out.println("Resultado: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        // Prueba 6: Operaciones con valores convertidos
        System.out.println("=== PRUEBA: OPERACIONES CON VALORES CONVERTIDOS ===");
        try {
            String strA = "25";
            String strB = "5";
            
            int a = Calculadora.convertirAEntero(strA);
            int b = Calculadora.convertirAEntero(strB);
            
            System.out.println("Valores convertidos: a=" + a + ", b=" + b);
            System.out.println("Suma: " + Calculadora.sumar(a, b));
            System.out.println("División: " + Calculadora.dividir(a, b));
            System.out.println("✓ Operaciones exitosas\n");
        } catch (Exception e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Prueba 7: Múltiples errores combinados
        System.out.println("=== PRUEBA: CONVERSIÓN Y DIVISIÓN POR CERO ===");
        try {
            String strA = "10";
            String strB = "0";
            
            int a = Calculadora.convertirAEntero(strA);
            int b = Calculadora.convertirAEntero(strB);
            
            System.out.println("Intentando dividir " + a + " ÷ " + b);
            double resultado = Calculadora.dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error de conversión: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("✗ Error aritmético: " + e.getMessage());
            System.out.println("✓ Excepción capturada correctamente\n");
        }
        
        System.out.println("===== FIN DEL PROGRAMA =====");
    }
}
