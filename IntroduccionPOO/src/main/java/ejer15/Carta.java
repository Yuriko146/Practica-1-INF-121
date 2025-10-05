/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer15;

/**
 *
 * @author USUARIO
 */
public class Carta {
    private String codigo;
    private String descripcion;
    private String remitente;
    private String destinatario;
    
    public Carta(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getRemitente() {
        return remitente;
    }
    
    public String getDestinatario() {
        return destinatario;
    }
}