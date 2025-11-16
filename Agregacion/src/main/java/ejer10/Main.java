/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 10: SISTEMA DE CHARLAS =====\n");
        
        // Crear evento
        Evento evento = new Evento("TechConf 2025");
        
        // Crear speakers
        Speaker sp1 = new Speaker("Carlos", "Mendoza", 35, 1234567, "Inteligencia Artificial");
        Speaker sp2 = new Speaker("María", "García", 40, 2345678, "Ciberseguridad");
        Speaker sp3 = new Speaker("Juan", "Pérez", 38, 3456789, "Cloud Computing");
        
        // Crear charlas
        Charla charla1 = new Charla("Auditorio A", "IA en la Industria 4.0", sp1);
        Charla charla2 = new Charla("Auditorio B", "Protección de Datos", sp2);
        Charla charla3 = new Charla("Sala 101", "AWS para Principiantes", sp3);
        
        // Agregar charlas al evento
        System.out.println("=== AGREGANDO CHARLAS ===");
        evento.agregarCharla(charla1);
        evento.agregarCharla(charla2);
        evento.agregarCharla(charla3);
        
        // Crear participantes
        Participante p1 = new Participante("Ana", "López", 22, 5555001, 101);
        Participante p2 = new Participante("Luis", "Torres", 25, 5555002, 102);
        Participante p3 = new Participante("Rosa", "Mamani", 21, 5555003, 103);
        Participante p4 = new Participante("Pedro", "Quispe", 28, 5555004, 104);
        Participante p5 = new Participante("Elena", "Condori", 23, 5555005, 105);
        Participante p6 = new Participante("Jorge", "Silva", 26, 5555006, 106);
        
        // Agregar participantes a las charlas
        System.out.println("\n=== AGREGANDO PARTICIPANTES ===");
        charla1.agregarParticipante(p1);
        charla1.agregarParticipante(p2);
        charla1.agregarParticipante(p3);
        charla1.agregarParticipante(p4);
        
        charla2.agregarParticipante(p5);
        charla2.agregarParticipante(p6);
        
        charla3.agregarParticipante(p1);
        charla3.agregarParticipante(p3);
        charla3.agregarParticipante(p5);
        
        // Mostrar evento completo
        evento.mostrarEvento();
        
        // a) Calcular edad promedio de participantes
        System.out.println("\n=== INCISO A: Edad promedio de participantes ===");
        double edadPromedio = evento.calcularEdadPromedio();
        System.out.println("Edad promedio: " + String.format("%.2f", edadPromedio) + " años");
        
        // b) Verificar si persona está en alguna charla
        System.out.println("\n=== INCISO B: Verificar personas en charlas ===");
        evento.verificarPersonaEnCharla("Ana", "López");
        evento.verificarPersonaEnCharla("Carlos", "Mendoza");
        evento.verificarPersonaEnCharla("Roberto", "Gómez");
        
        // c) Eliminar charlas del speaker con CI específico
        System.out.println("\n=== INCISO C: Eliminar charlas del speaker con CI 3456789 ===");
        evento.eliminarCharlasPorSpeaker(3456789);
        evento.mostrarEvento();
        
        // d) Ordenar charlas por número de participantes
        System.out.println("\n=== INCISO D: Ordenar charlas por participantes ===");
        evento.ordenarCharlasPorParticipantes();
        evento.mostrarEvento();
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
