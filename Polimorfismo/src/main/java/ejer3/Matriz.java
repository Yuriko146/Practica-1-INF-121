/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author USUARIO
 */
public class Matriz {
    private float[][] matriz;
    private static final int TAMANO = 10;

    public Matriz() {
        this.matriz = new float[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (i == j) {
                    this.matriz[i][j] = 1.0f;
                } else {
                    this.matriz[i][j] = 0.0f;
                }
            }
        }
    }

    public Matriz(float[][] matriz) {
        this.matriz = new float[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }

    public Matriz sumar(Matriz matriz) {
        float[][] resultado = new float[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                resultado[i][j] = this.matriz[i][j] + matriz.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public Matriz restar(Matriz matriz) {
        float[][] resultado = new float[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                resultado[i][j] = this.matriz[i][j] - matriz.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public boolean igual(Matriz matriz) {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (this.matriz[i][j] != matriz.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void imprimir() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.printf("%.2f ", this.matriz[i][j]);
            }
            System.out.println();
        }
    }

    public float[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(float[][] matriz) {
        this.matriz = matriz;
    }

    // Programa principal
    public static void main(String[] args) {
        // Crear matriz identidad
        System.out.println("=== Matriz Identidad ===");
        Matriz m1 = new Matriz();
        m1.imprimir();

        // Crear matriz con valores personalizados
        System.out.println("\n=== Matriz Personalizada ===");
        float[][] valores = new float[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                valores[i][j] = i + j;
            }
        }
        Matriz m2 = new Matriz(valores);
        m2.imprimir();

        // Sumar matrices
        System.out.println("\n=== Suma de Matrices ===");
        Matriz suma = m1.sumar(m2);
        suma.imprimir();

        // Restar matrices
        System.out.println("\n=== Resta de Matrices ===");
        Matriz resta = m2.restar(m1);
        resta.imprimir();

        // Comparar matrices
        System.out.println("\n=== Comparación de Matrices ===");
        System.out.println("¿m1 es igual a m2? " + m1.igual(m2));
        System.out.println("¿m1 es igual a m1? " + m1.igual(m1));
    }
}