/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author USUARIO
 */
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego() {
        this.nombre = "Sin nombre";
        this.plataforma = "Sin plataforma";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Sin plataforma";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó 1 jugador. Total: " + cantidadJugadores);
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
    }

    public String getNombre() { return nombre; }
    public String getPlataforma() { return plataforma; }
    public int getCantidadJugadores() { return cantidadJugadores; }

    @Override
    public String toString() {
        return "Videojuego: " + nombre + " | Plataforma: " + plataforma + 
               " | Jugadores: " + cantidadJugadores;
    }
}