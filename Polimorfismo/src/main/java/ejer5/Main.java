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
        // Crear un objeto Celular
        Celular miCelular = new Celular("72345678", "Juan Perez", 128, 8, 45);

        // d) Mostrar datos ANTES de los operadores
        System.out.println("===== ANTES DE LOS OPERADORES =====");
        miCelular.mostrarDatos();

        // b) Aplicar operador ++ (incrementar apps)
        System.out.println("Aplicando operador ++ (incrementar apps en 10)...");
        miCelular.incrementarApps();

        // c) Aplicar operador -- (disminuir espacio)
        System.out.println("Aplicando operador -- (disminuir espacio en 5 GB)...");
        miCelular.disminuirEspacio();

        // d) Mostrar datos DESPUÉS de los operadores
        System.out.println("\n===== DESPUES DE LOS OPERADORES =====");
        miCelular.mostrarDatos();
    }
}

