/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author USUARIO
 */
public class Ropero {
    private String material;
    private Ropa[] ropas;
    private int nroRopas;
    
    public Ropero(String material) {
        this.material = material;
        this.ropas = new Ropa[20];
        this.nroRopas = 0;
    }
    
    // b) Adicionar N prendas al ropero
    public boolean adicionarPrenda(Ropa prenda) {
        if (nroRopas < 20) {
            ropas[nroRopas] = prenda;
            nroRopas++;
            System.out.println("Prenda agregada: " + prenda);
            return true;
        } else {
            System.out.println("Ropero lleno, no se puede agregar más prendas");
            return false;
        }
    }
    
    // c) Eliminar prendas de material X o de tipo Y
    public void eliminarPrendas(String materialX, String tipoY) {
        int eliminadas = 0;
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(materialX) || 
                ropas[i].getTipo().equalsIgnoreCase(tipoY)) {
                System.out.println("Eliminando: " + ropas[i]);
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < nroRopas - 1; j++) {
                    ropas[j] = ropas[j + 1];
                }
                ropas[nroRopas - 1] = null;
                nroRopas--;
                i--; // Ajustar índice después de eliminar
                eliminadas++;
            }
        }
        System.out.println("Total de prendas eliminadas: " + eliminadas);
    }
    
    // d) Mostrar prendas de material X y de tipo Y (ambas condiciones)
    public void mostrarPrendasFiltradas(String materialX, String tipoY) {
        System.out.println("\n--- Prendas con Material '" + materialX + 
                         "' Y Tipo '" + tipoY + "' ---");
        boolean encontrado = false;
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(materialX) && 
                ropas[i].getTipo().equalsIgnoreCase(tipoY)) {
                System.out.println("- " + ropas[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron prendas con esos criterios");
        }
    }
    
    // Método para mostrar todas las prendas
    public void mostrarTodasPrendas() {
        System.out.println("\n--- Ropero de " + material + " ---");
        System.out.println("Prendas almacenadas: " + nroRopas + "/20");
        if (nroRopas == 0) {
            System.out.println("El ropero está vacío");
        } else {
            for (int i = 0; i < nroRopas; i++) {
                System.out.println((i + 1) + ". " + ropas[i]);
            }
        }
    }
}
