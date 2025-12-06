/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArchZoo {
    private String nombre;
    private ArrayList<Zoologico> zoologicos;
    
    // Constructor
    public ArchZoo(String nombre) {
        this.nombre = nombre;
        this.zoologicos = new ArrayList<>();
    }
    
    // a) Implementar los métodos crear, modificar y eliminar de ArchZoo
    
    // Método crear
    public void crear() {
        zoologicos.clear();
        System.out.println("Archivo de zoológicos '" + nombre + "' creado/reiniciado");
    }
    
    // Método para agregar zoológico
    public void agregarZoologico(Zoologico zoo) {
        zoologicos.add(zoo);
        System.out.println("Zoológico agregado: " + zoo.getNombre());
    }
    
    // Método modificar (por ID)
    public void modificar(int id, String nuevoNombre) {
        System.out.println("\n=== a) Modificar zoológico ===");
        boolean encontrado = false;
        
        for (Zoologico zoo : zoologicos) {
            if (zoo.getId() == id) {
                System.out.println("Zoológico encontrado: " + zoo.getNombre() + " (ID: " + id + ")");
                String nombreAnterior = zoo.getNombre();
                zoo.setNombre(nuevoNombre);
                System.out.println("Nombre modificado: '" + nombreAnterior + "' → '" + nuevoNombre + "'");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró el zoológico con ID: " + id);
        }
        System.out.println();
    }
    
    // Método eliminar (por ID)
    public void eliminar(int id) {
        System.out.println("\n=== a) Eliminar zoológico ===");
        boolean eliminado = false;
        
        for (int i = 0; i < zoologicos.size(); i++) {
            if (zoologicos.get(i).getId() == id) {
                Zoologico zooEliminado = zoologicos.remove(i);
                System.out.println("Zoológico eliminado: " + zooEliminado.getNombre() + " (ID: " + id + ")");
                eliminado = true;
                break;
            }
        }
        
        if (!eliminado) {
            System.out.println("No se encontró el zoológico con ID: " + id);
        }
        System.out.println();
    }
    
    // Método para listar todos los zoológicos
    public void listar() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    LISTADO DE ZOOLÓGICOS                              ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        
        if (zoologicos.isEmpty()) {
            System.out.println("║  No hay zoológicos registrados                                        ║");
        } else {
            for (Zoologico zoo : zoologicos) {
                zoo.mostrarAnimales();
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
    
    // b) Listar los zoológicos que contengan mayor cantidad variedad de animales
    public void listarZooMayorVariedad() {
        System.out.println("\n=== b) Zoológicos con mayor variedad de animales ===");
        
        if (zoologicos.isEmpty()) {
            System.out.println("No hay zoológicos registrados");
            return;
        }
        
        // Encontrar la variedad máxima
        int maxVariedad = 0;
        for (Zoologico zoo : zoologicos) {
            int variedad = zoo.contarVariedadAnimales();
            if (variedad > maxVariedad) {
                maxVariedad = variedad;
            }
        }
        
        // Mostrar zoológicos con la variedad máxima
        System.out.println("Variedad máxima encontrada: " + maxVariedad + " especies diferentes");
        System.out.println("\nZoológicos con esta variedad:");
        
        for (Zoologico zoo : zoologicos) {
            if (zoo.contarVariedadAnimales() == maxVariedad) {
                System.out.println("\n  🏆 " + zoo.getNombre() + " (ID: " + zoo.getId() + ")");
                System.out.println("      - Total de animales: " + zoo.getNroAnimales());
                System.out.println("      - Variedad de especies: " + zoo.contarVariedadAnimales());
            }
        }
        System.out.println();
    }
    
    // c) Listar los zoológicos vacíos y eliminarlos
    public void listarYEliminarZoologicosVacios() {
        System.out.println("\n=== c) Listar y eliminar zoológicos vacíos ===");
        
        ArrayList<Zoologico> zoosVacios = new ArrayList<>();
        
        for (Zoologico zoo : zoologicos) {
            if (zoo.estaVacio()) {
                zoosVacios.add(zoo);
                System.out.println("  Zoológico vacío encontrado: " + zoo.getNombre() + " (ID: " + zoo.getId() + ")");
            }
        }
        
        if (zoosVacios.isEmpty()) {
            System.out.println("No hay zoológicos vacíos");
        } else {
            zoologicos.removeAll(zoosVacios);
            System.out.println("\nTotal de zoológicos vacíos eliminados: " + zoosVacios.size());
        }
        System.out.println();
    }
    
    // d) Mostrar a los animales de la especie x
    public void mostrarAnimalesEspecieX(String especieX) {
        System.out.println("\n=== d) Animales de la especie: " + especieX + " ===");
        boolean encontrado = false;
        
        for (Zoologico zoo : zoologicos) {
            boolean encontradoEnZoo = false;
            
            for (int i = 0; i < zoo.getNroAnimales(); i++) {
                if (zoo.getAnimales()[i].getEspecie().equalsIgnoreCase(especieX)) {
                    if (!encontradoEnZoo) {
                        System.out.println("\n  Zoológico: " + zoo.getNombre() + " (ID: " + zoo.getId() + ")");
                        encontradoEnZoo = true;
                    }
                    System.out.println("    • " + zoo.getAnimales()[i]);
                    encontrado = true;
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron animales de la especie: " + especieX);
        }
        System.out.println();
    }
    
    // e) Mover los animales de un zoológico x a un zoológico y
    public void moverAnimales(int idZooOrigen, int idZooDestino) {
        System.out.println("\n=== e) Mover animales del zoo " + idZooOrigen + " al zoo " + idZooDestino + " ===");
        
        Zoologico zooOrigen = null;
        Zoologico zooDestino = null;
        
        // Buscar los zoológicos
        for (Zoologico zoo : zoologicos) {
            if (zoo.getId() == idZooOrigen) {
                zooOrigen = zoo;
            }
            if (zoo.getId() == idZooDestino) {
                zooDestino = zoo;
            }
        }
        
        if (zooOrigen == null) {
            System.out.println("No se encontró el zoológico origen con ID: " + idZooOrigen);
            return;
        }
        
        if (zooDestino == null) {
            System.out.println("No se encontró el zoológico destino con ID: " + idZooDestino);
            return;
        }
        
        System.out.println("Moviendo animales de '" + zooOrigen.getNombre() + "' a '" + zooDestino.getNombre() + "'");
        
        int animalesMovidos = 0;
        
        // Mover todos los animales del origen al destino
        for (int i = 0; i < zooOrigen.getNroAnimales(); i++) {
            Animal animal = zooOrigen.getAnimales()[i];
            
            // Verificar si hay espacio en el destino
            if (zooDestino.getNroAnimales() < 30) {
                zooDestino.adicionarAnimal(animal);
                System.out.println("  ✓ Movido: " + animal.getNombre() + " (" + animal.getEspecie() + ")");
                animalesMovidos++;
            } else {
                System.out.println("  ✗ No hay espacio para: " + animal.getNombre());
            }
        }
        
        // Vaciar el zoológico origen
        zooOrigen.setNroAnimales(0);
        
        System.out.println("\nTotal de animales movidos: " + animalesMovidos);
        System.out.println("Zoológico '" + zooOrigen.getNombre() + "' ahora está vacío");
        System.out.println();
    }
    
    public ArrayList<Zoologico> getZoologicos() {
        return zoologicos;
    }
}
