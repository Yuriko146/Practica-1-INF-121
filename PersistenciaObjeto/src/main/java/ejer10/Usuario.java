/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    
    // Constructor
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    // Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    // Setters
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString() {
        return "Usuario: " + nombreUsuario + " | Contraseña: " + contrasena;
    }
}
