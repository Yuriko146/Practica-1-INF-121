/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    
    public Mascota(String nombre, String tipo, int energiaInicial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energiaInicial;
    }
    
    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " ha sido alimentado. Energia: " + energia);
    }
    
    public void jugar() {
        energia -= 15;
        if (energia < 0) {
            energia = 0;
        }
        System.out.println(nombre + " esta jugando. Energia: " + energia);
    }
    
    public void mostrarEnergia() {
        System.out.println(nombre + " (" + tipo + ") - Energia: " + energia + "/100");
    }
    public String getNombre() {
        return nombre;
    }
    
    public int getEnergia() {
        return energia;
    }
}