/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 6: CUENTA BANCARIA CON EXCEPCIONES =====\n");
        
        // Crear cuenta con saldo inicial de 1000
        System.out.println("=== CREANDO CUENTA ===");
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
        cuenta.mostrarInfo();
        
        // Depósito válido
        System.out.println("=== PRUEBA 1: DEPÓSITO VÁLIDO ===");
        try {
            cuenta.depositar(500);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        cuenta.mostrarInfo();
        
        // Depósito con monto negativo
        System.out.println("=== PRUEBA 2: DEPÓSITO CON MONTO NEGATIVO ===");
        try {
            cuenta.depositar(-200);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción IllegalArgumentException capturada\n");
        }
        
        // Retiro válido
        System.out.println("=== PRUEBA 3: RETIRO VÁLIDO ===");
        try {
            cuenta.retirar(300);
            System.out.println();
        } catch (FondosInsuficientesException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        cuenta.mostrarInfo();
        
        // Retiro que supera el saldo
        System.out.println("=== PRUEBA 4: RETIRO QUE SUPERA EL SALDO ===");
        try {
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción FondosInsuficientesException capturada\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        cuenta.mostrarInfo();
        
        // Pruebas adicionales
        System.out.println("=== PRUEBA 5: RETIRO CON MONTO NEGATIVO ===");
        try {
            cuenta.retirar(-100);
        } catch (FondosInsuficientesException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage());
            System.out.println("✓ Excepción IllegalArgumentException capturada\n");
        }
        
        // Múltiples operaciones
        System.out.println("=== PRUEBA 6: MÚLTIPLES OPERACIONES ===");
        try {
            System.out.println("Realizando operaciones múltiples:");
            cuenta.depositar(200);
            cuenta.retirar(500);
            cuenta.depositar(100);
            System.out.println("✓ Todas las operaciones exitosas\n");
        } catch (FondosInsuficientesException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Intentar retirar exactamente el saldo disponible
        System.out.println("=== PRUEBA 7: RETIRAR SALDO COMPLETO ===");
        try {
            double saldoActual = cuenta.getSaldo();
            System.out.println("Intentando retirar todo el saldo: Bs. " + saldoActual);
            cuenta.retirar(saldoActual);
            System.out.println("✓ Retiro exitoso\n");
        } catch (FondosInsuficientesException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Estado final de la cuenta
        System.out.println("=== ESTADO FINAL DE LA CUENTA ===");
        cuenta.mostrarInfo();
        
        System.out.println("===== FIN DEL PROGRAMA =====");
    }
}

