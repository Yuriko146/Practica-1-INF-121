/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // b) Método depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: El monto a depositar debe ser positivo");
        }
        saldo += monto;
        System.out.println("✓ Depósito exitoso: Bs. " + monto);
        System.out.println("  Nuevo saldo: Bs. " + saldo);
    }
    
    // b) Método retirar - solo lanza FondosInsuficientesException cuando monto > saldo
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException(
                "Error: Fondos insuficientes. Saldo disponible: Bs. " + saldo + 
                ", Monto solicitado: Bs. " + monto
            );
        }
        
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: El monto a retirar debe ser positivo");
        }
        
        saldo -= monto;
        System.out.println("✓ Retiro exitoso: Bs. " + monto);
        System.out.println("  Nuevo saldo: Bs. " + saldo);
    }
    
    // b) Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("\n========== INFORMACIÓN DE CUENTA ==========");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: Bs. " + saldo);
        System.out.println("===========================================\n");
    }
    
    public double getSaldo() {
        return saldo;
    }
}
