/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTIÓN - ENTRADA UNIVERSITARIA =====\n");
        
        SistemaEntradaUniversitaria sistema = new SistemaEntradaUniversitaria();
        
        // b) Instanciar 2 fraternidades con encargados
        System.out.println("=== REGISTRANDO FRATERNIDADES ===");
        Fraternidad frat1 = new Fraternidad("Tinkus UMSA", "Roberto Mamani");
        Fraternidad frat2 = new Fraternidad("Caporales San Simón", "Andrea Quispe");
        sistema.registrarFraternidad(frat1);
        sistema.registrarFraternidad(frat2);
        
        // Instanciar 2 facultades
        System.out.println("\n=== REGISTRANDO FACULTADES ===");
        Facultad fac1 = new Facultad("Ingeniería", "ING");
        Facultad fac2 = new Facultad("Ciencias Económicas", "ECO");
        sistema.registrarFacultad(fac1);
        sistema.registrarFacultad(fac2);
        
        // Instanciar 5 participantes
        System.out.println("\n=== REGISTRANDO BAILARINES ===");
        Bailarin b1 = new Bailarin("Juan", "Pérez", 20, "12345678", "71234567");
        Bailarin b2 = new Bailarin("María", "López", 19, "23456789", "72345678");
        Bailarin b3 = new Bailarin("Carlos", "Mamani", 22, "34567890", "73456789");
        Bailarin b4 = new Bailarin("Ana", "Torres", 21, "45678901", "74567890");
        Bailarin b5 = new Bailarin("Luis", "Condori", 23, "56789012", "75678901");
        
        // Registrar bailarines en fraternidades y facultades
        sistema.registrarBailarin(b1, frat1, fac1);
        sistema.registrarBailarin(b2, frat1, fac1);
        sistema.registrarBailarin(b3, frat2, fac2);
        sistema.registrarBailarin(b4, frat2, fac1);
        sistema.registrarBailarin(b5, frat1, fac2);
        
        // c) Resolver lo que pide el cliente
        
        // 1. Ver bailarines con su fraternidad y facultad
        sistema.mostrarTodosBailarines();
        
        // 2. Conocer encargado de cada fraternidad
        sistema.mostrarEncargadosFraternidades();
        
        // 3. Ver edades de participantes
        sistema.mostrarEdadesParticipantes();
        
        // 4. Verificar que no estén en 2 o más fraternidades
        System.out.println("\n=== INTENTANDO REGISTRAR BAILARÍN EN 2DA FRATERNIDAD ===");
        sistema.registrarBailarin(b1, frat2, fac1); // Esto debe fallar
        
        // Mostrar información detallada por fraternidad
        System.out.println("\n========== INFORMACIÓN POR FRATERNIDAD ==========");
        for (Fraternidad f : sistema.getFraternidades()) {
            f.mostrarMiembros();
        }
        
        // Mostrar información detallada por facultad
        System.out.println("\n========== INFORMACIÓN POR FACULTAD ==========");
        for (Facultad f : sistema.getFacultades()) {
            f.mostrarBailarines();
        }
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}