/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author USUARIO
 */
public class Parada {
    private String[] admins;
    private String[][] autos;
    private String nombreP;
    private int contAdmin;
    private int contAutos;

    // a) Constructor por defecto
    public Parada() {
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nombreP = "Sin nombre";
        this.contAdmin = 0;
        this.contAutos = 0;
    }

    // a) Constructor pidiendo datos
    public Parada(String nombreP) {
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nombreP = nombreP;
        this.contAdmin = 0;
        this.contAutos = 0;
    }

    // b) Método mostrar
    public void mostrar() {
        System.out.println("Parada: " + nombreP);
        System.out.println("Administradores:");
        for (int i = 0; i < contAdmin; i++) {
            System.out.println("  - " + admins[i]);
        }
        System.out.println("Autos:");
        for (int i = 0; i < contAutos; i++) {
            System.out.println("  - Modelo: " + autos[i][0] + 
                             ", Conductor: " + autos[i][1] + 
                             ", Placa: " + autos[i][2]);
        }
        System.out.println();
    }

    // c) Método adicionar admin
    public void adicionar(String x) {
        if (contAdmin < 10) {
            admins[contAdmin] = x;
            contAdmin++;
        }
    }

    // d) Método adicionar auto
    public void adicionar(String x, String y, String z) {
        if (contAutos < 10) {
            autos[contAutos][0] = x;
            autos[contAutos][1] = y;
            autos[contAutos][2] = z;
            contAutos++;
        }
    }

    // Getters y Setters
    public String[] getAdmins() {
        return admins;
    }

    public void setAdmins(String[] admins) {
        this.admins = admins;
    }

    public String[][] getAutos() {
        return autos;
    }

    public void setAutos(String[][] autos) {
        this.autos = autos;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
}
