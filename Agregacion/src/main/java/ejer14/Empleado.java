/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer14;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Puesto: " + puesto + 
                         " | Salario: Bs. " + String.format("%.2f", salario));
    }
}