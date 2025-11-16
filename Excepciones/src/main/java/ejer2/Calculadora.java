/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author USUARIO
 */
public class Calculadora {
    
    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    // b) Método para dividir - lanza ArithmeticException si divisor es cero
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return a / b;
    }
    
    // c) Método para convertir String a número entero
    public static int convertirAEntero(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: El valor no puede ser nulo o vacío");
        }
        
        try {
            return Integer.parseInt(valor.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: '" + valor + "' no es un número válido");
        }
    }
}

