/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciar videojuegos usando diferentes constructores
        Videojuego juego1 = new Videojuego("Minecraft", "PC", 5);
        Videojuego juego2 = new Videojuego("Fortnite");

        System.out.println("=== VIDEOJUEGOS CREADOS ===");
        System.out.println(juego1);
        System.out.println(juego2);
        System.out.println();

         //agregar un jugador
        System.out.println("=== Agregar 1 jugador a " + juego1.getNombre() + " ===");
        juego1.agregarJugadores();
        System.out.println();

        //agregar varios jugadores por teclado
        System.out.print("Ingrese cantidad de jugadores a agregar a " + juego2.getNombre() + ": ");
        int cantidad = sc.nextInt();
        juego2.agregarJugadores(cantidad);
        System.out.println();

        System.out.println("=== ESTADO FINAL ===");
        System.out.println(juego1);
        System.out.println(juego2);

        sc.close();
    }
}
