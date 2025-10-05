/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author USUARIO
 */
public class Celular {
    private String nroTel;
    private String dueno;
    private int espacio; // en GB
    private int ram; // en GB
    private int nroApp;

    public Celular(String nroTel, String dueno, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueno = dueno;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    public void incrementarApps() {
        this.nroApp += 10;
    }

    public void disminuirEspacio() {
        this.espacio -= 5;
    }

    public void mostrarDatos() {
        System.out.println("Numero Telefono: " + nroTel);
        System.out.println("Dueño: " + dueno);
        System.out.println("Espacio: " + espacio + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Numero de Apps: " + nroApp);
        System.out.println("----------------------------");
    }

    public String getNroTel() {
        return nroTel;
    }

    public void setNroTel(String nroTel) {
        this.nroTel = nroTel;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getNroApp() {
        return nroApp;
    }

    public void setNroApp(int nroApp) {
        this.nroApp = nroApp;
    }
}
