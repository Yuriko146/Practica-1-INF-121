/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ArchFarmacia {
    private String na;
    ArrayList<Farmacia> farmacias;
    
    // Constructor
    public ArchFarmacia(String na) {
        this.na = na;
        this.farmacias = new ArrayList<>();
    }
    
    // Método ArchMedicamento(na)
    public void ArchMedicamento(String nombreArchivo) {
        this.na = nombreArchivo;
        System.out.println("Archivo de medicamentos creado: " + na);
    }
    
    // Método crearArchivo()
    public void crearArchivo() {
        farmacias.clear();
        System.out.println("Archivo '" + na + "' creado/reiniciado");
    }
    
    // Método adicionar()
    public void adicionar(Farmacia farmacia) {
        farmacias.add(farmacia);
        System.out.println("Farmacia agregada: " + farmacia.getNombreFarmacia());
    }
    
    // Método listar()
    public void listar() {
        System.out.println("\n========================================");
        System.out.println("LISTADO DE FARMACIAS - Archivo: " + na);
        System.out.println("========================================");
        if (farmacias.isEmpty()) {
            System.out.println("No hay farmacias registradas");
        } else {
            for (Farmacia f : farmacias) {
                f.mostrar();
                System.out.println("Medicamentos en esta farmacia:");
                for (int i = 0; i < f.getNroMedicamentos(); i++) {
                    System.out.print("  ");
                    f.getMedicamentos()[i].mostrar();
                }
                System.out.println("----------------------------------------");
            }
        }
    }
    
    // a) Mostrar los medicamentos para la tos de la Sucursal número X
    public void mostrarMedicamentosTos(int sucursalX) {
        System.out.println("\n=== a) Medicamentos para la tos - Sucursal " + sucursalX + " ===");
        boolean encontrado = false;
        for (Farmacia f : farmacias) {
            if (f.getSucursal() == sucursalX) {
                System.out.println("Farmacia: " + f.getNombreFarmacia());
                f.mostrarMedicamentos("tos");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró la sucursal " + sucursalX);
        }
    }
    
    // b) Mostrar el número de sucursal y su dirección que tienen el medicamento "Tapsin"
    public void mostrarMedicamentosResfrios() {
        System.out.println("\n=== b) Sucursales con medicamento 'Tapsin' ===");
        boolean encontrado = false;
        for (Farmacia f : farmacias) {
            for (int i = 0; i < f.getNroMedicamentos(); i++) {
                if (f.getMedicamentos()[i].getNombre().equalsIgnoreCase("Tapsin")) {
                    System.out.println("Sucursal: " + f.getSucursal() + 
                                     ", Dirección: " + f.getDireccion());
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el medicamento 'Tapsin' en ninguna farmacia");
        }
    }
    
    // c) Buscar medicamentos por tipo
    public void precioMedicamentoTos() {
        System.out.println("\n=== c) Buscar medicamentos por tipo ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el tipo de medicamento a buscar: ");
        String tipoBuscar = scanner.nextLine();
        
        System.out.println("\nMedicamentos de tipo '" + tipoBuscar + "':");
        boolean encontrado = false;
        for (Farmacia f : farmacias) {
            for (int i = 0; i < f.getNroMedicamentos(); i++) {
                if (f.getMedicamentos()[i].getTipo().equalsIgnoreCase(tipoBuscar)) {
                    System.out.println("Farmacia: " + f.getNombreFarmacia() + 
                                     " (Sucursal " + f.getSucursal() + ")");
                    f.getMedicamentos()[i].mostrar();
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron medicamentos de tipo '" + tipoBuscar + "'");
        }
    }
    
    // d) Ordenar las farmacias según su dirección en orden alfabético
    public void mostrarMedicamentosMenor10s() {
        System.out.println("\n=== d) Farmacias ordenadas por dirección (alfabético) ===");
        ArrayList<Farmacia> farmaciasOrdenadas = new ArrayList<>(farmacias);
        Collections.sort(farmaciasOrdenadas, new Comparator<Farmacia>() {
            @Override
            public int compare(Farmacia f1, Farmacia f2) {
                return f1.getDireccion().compareToIgnoreCase(f2.getDireccion());
            }
        });
        
        for (Farmacia f : farmaciasOrdenadas) {
            System.out.println("Dirección: " + f.getDireccion() + 
                             " - Farmacia: " + f.getNombreFarmacia() + 
                             " (Sucursal " + f.getSucursal() + ")");
        }
    }
    
    // e) Mover los medicamentos de tipo x de la farmacia y a la farmacia z
    public void moverMedicamentos(String tipoX, int sucursalY, int sucursalZ) {
        System.out.println("\n=== e) Mover medicamentos de tipo '" + tipoX + 
                         "' de sucursal " + sucursalY + " a sucursal " + sucursalZ + " ===");
        
        Farmacia farmaciaOrigen = null;
        Farmacia farmaciaDestino = null;
        
        // Buscar las farmacias
        for (Farmacia f : farmacias) {
            if (f.getSucursal() == sucursalY) {
                farmaciaOrigen = f;
            }
            if (f.getSucursal() == sucursalZ) {
                farmaciaDestino = f;
            }
        }
        
        if (farmaciaOrigen == null) {
            System.out.println("No se encontró la sucursal origen " + sucursalY);
            return;
        }
        if (farmaciaDestino == null) {
            System.out.println("No se encontró la sucursal destino " + sucursalZ);
            return;
        }
        
        // Mover medicamentos
        ArrayList<Medicamento> medicamentosAMover = new ArrayList<>();
        for (int i = 0; i < farmaciaOrigen.getNroMedicamentos(); i++) {
            if (farmaciaOrigen.getMedicamentos()[i].getTipo().equalsIgnoreCase(tipoX)) {
                medicamentosAMover.add(farmaciaOrigen.getMedicamentos()[i]);
            }
        }
        
        // Agregar a destino
        for (Medicamento med : medicamentosAMover) {
            farmaciaDestino.adicionarMedicamento(med);
            System.out.println("Movido: " + med.getNombre() + " -> Sucursal " + sucursalZ);
        }
        
        // Eliminar del origen
        int nuevoNro = 0;
        Medicamento[] nuevoArray = new Medicamento[100];
        for (int i = 0; i < farmaciaOrigen.getNroMedicamentos(); i++) {
            if (!farmaciaOrigen.getMedicamentos()[i].getTipo().equalsIgnoreCase(tipoX)) {
                nuevoArray[nuevoNro++] = farmaciaOrigen.getMedicamentos()[i];
            }
        }
        System.arraycopy(nuevoArray, 0, farmaciaOrigen.getMedicamentos(), 0, nuevoNro);
        farmaciaOrigen.nroMedicamentos = nuevoNro;
        
        System.out.println("Total de medicamentos movidos: " + medicamentosAMover.size());
    }
}