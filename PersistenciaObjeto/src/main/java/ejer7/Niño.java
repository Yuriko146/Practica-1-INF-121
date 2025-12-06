/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author Usuario
 */
public class Niño extends Persona {
    private int edad;
    private double peso;
    private String talla;
    
    // Constructor
    public Niño() {
        super();
        this.edad = 0;
        this.peso = 0.0;
        this.talla = "";
    }
    
    public Niño(String nombre, String apellidoPaterno, String apellidoMaterno, String ci, 
                int edad, double peso, String talla) {
        super(nombre, apellidoPaterno, apellidoMaterno, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }
    
    // Getters
    public int getEdad() {
        return edad;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public String getTalla() {
        return talla;
    }
    
    // Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    // Método para verificar si el peso es adecuado según edad y talla
    public boolean tienePesoAdecuado() {
        // Tabla simplificada de peso ideal por edad
        double pesoMinimo = 0, pesoMaximo = 0;
        
        switch(edad) {
            case 1:
                pesoMinimo = 8.0;
                pesoMaximo = 12.0;
                break;
            case 2:
                pesoMinimo = 10.0;
                pesoMaximo = 15.0;
                break;
            case 3:
                pesoMinimo = 12.0;
                pesoMaximo = 17.0;
                break;
            case 4:
                pesoMinimo = 14.0;
                pesoMaximo = 19.0;
                break;
            case 5:
                pesoMinimo = 16.0;
                pesoMaximo = 21.0;
                break;
            case 6:
                pesoMinimo = 18.0;
                pesoMaximo = 24.0;
                break;
            case 7:
                pesoMinimo = 20.0;
                pesoMaximo = 27.0;
                break;
            case 8:
                pesoMinimo = 22.0;
                pesoMaximo = 30.0;
                break;
            case 9:
                pesoMinimo = 24.0;
                pesoMaximo = 33.0;
                break;
            case 10:
                pesoMinimo = 26.0;
                pesoMaximo = 36.0;
                break;
            default:
                pesoMinimo = 8.0;
                pesoMaximo = 50.0;
        }
        
        return peso >= pesoMinimo && peso <= pesoMaximo;
    }
    
    // Método para verificar si la talla es adecuada según edad
    public boolean tieneTallaAdecuada() {
        // Tallas por edad aproximadas
        String tallaEsperada = "";
        switch(edad) {
            case 1:
            case 2:
                tallaEsperada = "2T";
                break;
            case 3:
                tallaEsperada = "3T";
                break;
            case 4:
                tallaEsperada = "4T";
                break;
            case 5:
            case 6:
                tallaEsperada = "XS";
                break;
            case 7:
            case 8:
                tallaEsperada = "S";
                break;
            case 9:
            case 10:
                tallaEsperada = "M";
                break;
            default:
                return true;
        }
        
        return talla.equalsIgnoreCase(tallaEsperada);
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Edad: " + edad + " años | Peso: " + peso + " kg | Talla: " + talla;
    }
}
