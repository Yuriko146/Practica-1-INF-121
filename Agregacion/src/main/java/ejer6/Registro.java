/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class Registro {
    private String fecha;
    private int cantidad;
    private Medicamento medicamento;
    private String cliente;
    
    public Registro(String fecha, int cantidad, Medicamento medicamento, String cliente) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.medicamento = medicamento;
        this.cliente = cliente;
    }
    
    public void mostrarRegistro() {
        System.out.println("Fecha: " + fecha + " | Cliente: " + cliente + 
                         " | Medicamento: " + medicamento.getNombre() + 
                         " | Cant: " + cantidad + " | Total: $" + (cantidad * medicamento.getPrecio()));
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }
}