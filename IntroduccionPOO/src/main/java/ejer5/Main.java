/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTION DE PERSONAS =====\n");
        
        // a) Instanciar dos personas
        Persona persona1 = new Persona("Juan", "Garcia", "Lopez", 25, "1234567 LP");
        Persona persona2 = new Persona("Maria", "Garcia", "Perez", 16, "7654321 LP");
        
        // b) Mostrar datos de ambas personas
        System.out.println("--- PERSONA 1 ---");
        persona1.mostrarDatos();
        System.out.println();
        
        System.out.println("--- PERSONA 2 ---");
        persona2.mostrarDatos();
        System.out.println();
        
        // c) Verificar si son mayores de edad
        System.out.println("--- VERIFICACION DE MAYORIA DE EDAD ---");
        System.out.println(persona1.getNombre() + " es mayor de edad: " + 
                          (persona1.mayorDeEdad() ? "SI" : "NO"));
        System.out.println(persona2.getNombre() + " es mayor de edad: " + 
                          (persona2.mayorDeEdad() ? "SI" : "NO"));
        System.out.println();
        
        // d) Modificar edad de persona2
        System.out.println("--- MODIFICACION DE EDAD ---");
        persona2.modificarEdad(20);
        System.out.println("Ahora " + persona2.getNombre() + " es mayor de edad: " + 
                          (persona2.mayorDeEdad() ? "SI" : "NO"));
        System.out.println();
        
        // e) Verificar si tienen el mismo apellido paterno
        System.out.println("--- VERIFICACION DE APELLIDO ---");
        if (persona1.getPaterno().equals(persona2.getPaterno())) {
            System.out.println(persona1.getNombre() + " y " + persona2.getNombre() + 
                             " tienen el mismo apellido paterno: " + persona1.getPaterno());
        } else {
            System.out.println(persona1.getNombre() + " y " + persona2.getNombre() + 
                             " NO tienen el mismo apellido paterno");
        }
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
