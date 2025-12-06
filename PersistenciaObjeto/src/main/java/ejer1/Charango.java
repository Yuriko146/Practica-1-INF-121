/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;
import java.io.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Charango implements Serializable {
    // Atributos
    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas;
    
    private static final String ARCHIVO = "charangos.dat";
    
    // Constructor
    public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.nroCuerdas = nroCuerdas;
        this.cuerdas = new boolean[10];
        System.arraycopy(cuerdas, 0, this.cuerdas, 0, Math.min(cuerdas.length, 10));
    }
    
    // Getters
    public String getMaterial() {
        return material;
    }
    
    public int getNroCuerdas() {
        return nroCuerdas;
    }
    
    public boolean[] getCuerdas() {
        return cuerdas;
    }
    
    // Método auxiliar para contar cuerdas falsas
    public int contarCuerdasFalsas() {
        int count = 0;
        for (boolean cuerda : cuerdas) {
            if (!cuerda) count++;
        }
        return count;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Material: ").append(material)
          .append(", Nro Cuerdas: ").append(nroCuerdas)
          .append(", Estado cuerdas: [");
        for (int i = 0; i < cuerdas.length; i++) {
            sb.append(cuerdas[i] ? "T" : "F");
            if (i < cuerdas.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
    
    // ============ MÉTODOS ESTÁTICOS PARA GESTIÓN ============
    
    // Método para guardar charangos en archivo
    public static void guardarCharangos(List<Charango> charangos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(charangos);
            System.out.println("✓ Charangos guardados exitosamente");
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }
    
    // Método para cargar charangos desde archivo
    @SuppressWarnings("unchecked")
    public static List<Charango> cargarCharangos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            return (List<Charango>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, creando nueva lista");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    // b) Eliminar charangos con más de 6 cuerdas en false
    public static void eliminarCharangosCuerdasRotas(List<Charango> charangos) {
        int inicial = charangos.size();
        charangos.removeIf(c -> c.contarCuerdasFalsas() > 6);
        int eliminados = inicial - charangos.size();
        System.out.println("✓ Eliminados " + eliminados + " charangos con más de 6 cuerdas rotas");
    }
    
    // c) Listar charangos de material X
    public static void listarPorMaterial(List<Charango> charangos, String material) {
        System.out.println("\n=== CHARANGOS DE MATERIAL: " + material.toUpperCase() + " ===");
        boolean encontrado = false;
        for (Charango c : charangos) {
            if (c.getMaterial().equalsIgnoreCase(material)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron charangos de ese material");
        }
    }
    
    // d) Buscar charangos con 10 cuerdas
    public static void buscarCharangos10Cuerdas(List<Charango> charangos) {
        System.out.println("\n=== CHARANGOS CON 10 CUERDAS ===");
        boolean encontrado = false;
        for (Charango c : charangos) {
            if (c.getNroCuerdas() == 10) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron charangos con 10 cuerdas");
        }
    }
    
    // e) Ordenar por material alfabéticamente
    public static void ordenarPorMaterial(List<Charango> charangos) {
        charangos.sort(Comparator.comparing(Charango::getMaterial));
        System.out.println("✓ Charangos ordenados por material alfabéticamente");
    }
    
    // Método para crear datos de prueba
    public static List<Charango> crearDatosPrueba() {
        List<Charango> charangos = new ArrayList<>();
        
        charangos.add(new Charango("Cedro", 10, 
            new boolean[]{true, true, true, true, true, true, true, true, true, true}));
        charangos.add(new Charango("Pino", 10, 
            new boolean[]{true, false, true, false, true, false, false, false, false, false}));
        charangos.add(new Charango("Caoba", 8, 
            new boolean[]{true, true, false, true, true, true, false, true, false, false}));
        charangos.add(new Charango("Cedro", 10, 
            new boolean[]{false, false, false, true, true, false, false, true, false, false}));
        charangos.add(new Charango("Bambú", 10, 
            new boolean[]{true, true, true, true, true, true, true, true, false, false}));
        
        return charangos;
    }
    
    // ============ MAIN ============
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Charango> charangos;
        
        // Crear datos de prueba
        charangos = crearDatosPrueba();
        guardarCharangos(charangos);
        
        int opcion;
        do {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║   GESTIÓN DE CHARANGOS             ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.println("1. Cargar charangos desde archivo");
            System.out.println("2. Eliminar charangos con +6 cuerdas rotas");
            System.out.println("3. Listar por material");
            System.out.println("4. Buscar charangos con 10 cuerdas");
            System.out.println("5. Ordenar por material");
            System.out.println("6. Mostrar todos los charangos");
            System.out.println("7. Guardar y salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    charangos = cargarCharangos();
                    System.out.println("Cargados " + charangos.size() + " charangos");
                    break;
                case 2:
                    eliminarCharangosCuerdasRotas(charangos);
                    guardarCharangos(charangos);
                    break;
                case 3:
                    System.out.print("Ingrese el material: ");
                    String material = sc.nextLine();
                    listarPorMaterial(charangos, material);
                    break;
                case 4:
                    buscarCharangos10Cuerdas(charangos);
                    break;
                case 5:
                    ordenarPorMaterial(charangos);
                    guardarCharangos(charangos);
                    break;
                case 6:
                    System.out.println("\n=== TODOS LOS CHARANGOS ===");
                    for (Charango c : charangos) {
                        System.out.println(c);
                    }
                    break;
                case 7:
                    guardarCharangos(charangos);
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 7);
        
        sc.close();
    }
}