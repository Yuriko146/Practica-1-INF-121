/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN DE FARMACIAS Y MEDICAMENTOS          ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
        
        // Crear archivo de farmacias
        ArchFarmacia archivo = new ArchFarmacia("farmacias.dat");
        archivo.crearArchivo();
        
        // Crear farmacias
        Farmacia farmacia1 = new Farmacia("Farmacia Central", 1, "Av. 6 de Agosto");
        Farmacia farmacia2 = new Farmacia("Farmacia Norte", 2, "Calle Comercio");
        Farmacia farmacia3 = new Farmacia("Farmacia Sur", 3, "Av. Arce");
        
        // Agregar medicamentos a Farmacia 1
        System.out.println("\n--- Agregando medicamentos a Farmacia Central ---");
        farmacia1.adicionarMedicamento(new Medicamento("Tapsin", 101, "tos", 15.50));
        farmacia1.adicionarMedicamento(new Medicamento("Paracetamol", 102, "fiebre", 8.00));
        farmacia1.adicionarMedicamento(new Medicamento("Jarabe X", 103, "tos", 22.00));
        farmacia1.adicionarMedicamento(new Medicamento("Ibuprofeno", 104, "dolor", 12.50));
        
        // Agregar medicamentos a Farmacia 2
        System.out.println("\n--- Agregando medicamentos a Farmacia Norte ---");
        farmacia2.adicionarMedicamento(new Medicamento("Tapsin", 201, "tos", 16.00));
        farmacia2.adicionarMedicamento(new Medicamento("Aspirina", 202, "dolor", 10.00));
        farmacia2.adicionarMedicamento(new Medicamento("Antitusivo", 203, "tos", 18.50));
        
        // Agregar medicamentos a Farmacia 3
        System.out.println("\n--- Agregando medicamentos a Farmacia Sur ---");
        farmacia3.adicionarMedicamento(new Medicamento("Vitamina C", 301, "vitamina", 25.00));
        farmacia3.adicionarMedicamento(new Medicamento("Antibiótico", 302, "infección", 35.00));
        
        // Adicionar farmacias al archivo
        System.out.println("\n--- Registrando farmacias en el archivo ---");
        archivo.adicionar(farmacia1);
        archivo.adicionar(farmacia2);
        archivo.adicionar(farmacia3);
        
        // Listar todas las farmacias
        archivo.listar();
        
        // a) Mostrar medicamentos para la tos de la Sucursal 1
        archivo.mostrarMedicamentosTos(1);
        
        // b) Mostrar sucursales con medicamento "Tapsin"
        archivo.mostrarMedicamentosResfrios();
        
        // c) Buscar medicamentos por tipo (simulado sin entrada de usuario)
        System.out.println("\n=== c) Buscar medicamentos por tipo ===");
        String tipoBuscar = "dolor";
        System.out.println("Buscando medicamentos de tipo: " + tipoBuscar);
        boolean encontrado = false;
        for (int i = 0; i < archivo.farmacias.size(); i++) {
            Farmacia f = archivo.farmacias.get(i);
            for (int j = 0; j < f.getNroMedicamentos(); j++) {
                if (f.getMedicamentos()[j].getTipo().equalsIgnoreCase(tipoBuscar)) {
                    System.out.println("Farmacia: " + f.getNombreFarmacia() + 
                                     " (Sucursal " + f.getSucursal() + ")");
                    f.getMedicamentos()[j].mostrar();
                    encontrado = true;
                }
            }
        }
        
        // d) Ordenar farmacias por dirección
        archivo.mostrarMedicamentosMenor10s();
        
        // e) Mover medicamentos de tipo "tos" de Sucursal 1 a Sucursal 3
        archivo.moverMedicamentos("tos", 1, 3);
        
        // Mostrar estado final
        System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              ESTADO FINAL DEL SISTEMA                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        archivo.listar();
    }
}