/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer13;

import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v;
    

    public Fruta(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = 0;
        this.v = new String[30];
    }
    
    // a) Constructor 2: Con array de vitaminas
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        this.v = new String[30];
        System.arraycopy(vitaminas, 0, this.v, 0, vitaminas.length);
    }
    
    // a) Constructor 3: Con número y array de vitaminas
    public Fruta(String nombre, String tipo, int nroVitaminas, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = nroVitaminas;
        this.v = new String[30];
        System.arraycopy(vitaminas, 0, this.v, 0, Math.min(nroVitaminas, vitaminas.length));
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNroVitaminas() {
        return nroVitaminas;
    }
    
    public String[] getVitaminas() {
        return Arrays.copyOf(v, nroVitaminas);
    }
    
    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + nombre + ":");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.println("  - " + v[i]);
        }
    }
    
    public int contarCitricas() {
        int contador = 0;
        for (int i = 0; i < nroVitaminas; i++) {
            if (v[i].toUpperCase().contains("C")) {
                contador++;
            }
        }
        return contador;
    }
    
    public void ordenarVitaminas() {
        String[] temp = Arrays.copyOf(v, nroVitaminas);
        Arrays.sort(temp);
        System.arraycopy(temp, 0, v, 0, nroVitaminas);
    }
    
    public void mostrarInfo() {
        System.out.println("Fruta: " + nombre + " (" + tipo + ")");
        System.out.println("Numero de vitaminas: " + nroVitaminas);
    }
}