/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer15;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE BUZON Y CARTAS =====\n");
        
        // a) Instanciar 3 buzones con al menos 3 cartas cada uno
        Buzon buzon1 = new Buzon(1);
        Buzon buzon2 = new Buzon(2);
        Buzon buzon3 = new Buzon(3);
        
        // b) Crear cartas con descripciones
        Carta c1 = new Carta("C123", "Querido amigo te escribo para decirte que...");
        c1.setRemitente("Juan Alvarez");
        c1.setDestinatario("Peter Chaves");
        
        Carta c2 = new Carta("C456", "Estimado cliente su pedido esta listo");
        c2.setRemitente("Pepe Mujica");
        c2.setDestinatario("Wilmer Perez");
        
        Carta c3 = new Carta("C789", "Feliz cumpleaños querida amiga");
        c3.setRemitente("Paty Vasques");
        c3.setDestinatario("Pepe Mujica");
        
        Carta c4 = new Carta("C111", "Te amo mucho mi amor");
        c4.setRemitente("Ana Lopez");
        c4.setDestinatario("Peter Chaves");
        
        Carta c5 = new Carta("C222", "La reunion es mañana");
        c5.setRemitente("Carlos Ruiz");
        c5.setDestinatario("Wilmer Perez");
        
        Carta c6 = new Carta("C333", "Gracias por tu amor y apoyo");
        c6.setRemitente("Maria Silva");
        c6.setDestinatario("Juan Alvarez");
        
        Carta c7 = new Carta("C444", "El amor es lo mas importante");
        c7.setRemitente("Pedro Gomez");
        c7.setDestinatario("Ana Lopez");
        
        Carta c8 = new Carta("C555", "Recuerda traer documentos");
        c8.setRemitente("Sofia Torres");
        c8.setDestinatario("Carlos Ruiz");
        
        Carta c9 = new Carta("C666", "Espero verte pronto amigo");
        c9.setRemitente("Luis Diaz");
        c9.setDestinatario("Maria Silva");
        
        // Agregar cartas a buzones
        buzon1.agregarCarta(c1);
        buzon1.agregarCarta(c2);
        buzon1.agregarCarta(c3);
        
        buzon2.agregarCarta(c4);
        buzon2.agregarCarta(c5);
        buzon2.agregarCarta(c6);
        
        buzon3.agregarCarta(c7);
        buzon3.agregarCarta(c8);
        buzon3.agregarCarta(c9);
        
        System.out.println("Buzones creados con 3 cartas cada uno\n");
        
        // c) Verificar cartas recibidas por "Peter Chaves"
        System.out.println("--- c) CARTAS DE PETER CHAVES ---");
        int total = buzon1.contarCartasDestinatario("Peter Chaves") + 
                   buzon2.contarCartasDestinatario("Peter Chaves") + 
                   buzon3.contarCartasDestinatario("Peter Chaves");
        System.out.println("Peter Chaves recibio: " + total + " cartas\n");
        
        // d) Eliminar carta con código "C456"
        System.out.println("--- d) ELIMINAR CARTA C456 ---");
        if (buzon1.eliminarCarta("C456")) {
            System.out.println("Carta C456 eliminada");
            System.out.println("Cartas restantes en buzon 1: " + buzon1.getNroC() + "\n");
        }
        
        // e) Verificar remitente de carta a "Pepe Mujica"
        System.out.println("--- e) REMITENTE PARA PEPE MUJICA ---");
        String rem = buzon1.buscarRemitente("Pepe Mujica");
        if (rem != null) {
            System.out.println("Remitente: " + rem + "\n");
        }
        
        // f) Buscar palabra "amor" en las cartas
        System.out.println("--- f) BUSCAR PALABRA 'amor' ---");
        buzon2.buscarPalabra("amor");
        System.out.println();
        
        // g) Mostrar código, remitente y destinatario
        System.out.println("--- g) COINCIDENCIAS ---");
        buzon1.mostrarCoincidencias();
        System.out.println();
        buzon2.mostrarCoincidencias();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
