/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer11;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private int numeroPedido;
    private String estado;
    
    public Pedido(int numeroPedido, String estado) {
        this.numeroPedido = numeroPedido;
        this.estado = estado;
        System.out.println("Pedido creado: #" + numeroPedido);
    }
    
    protected void finalizar() {
        System.out.println("Pedido destruido: #" + numeroPedido);
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void mostrarInfo() {
        System.out.println("Pedido #" + numeroPedido);
        System.out.println("Estado: " + estado);
    }
}
