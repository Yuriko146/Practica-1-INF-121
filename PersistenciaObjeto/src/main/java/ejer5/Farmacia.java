/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Usuario
 */
public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    int nroMedicamentos;
    private Medicamento[] m;
    
    // Constructor
    public Farmacia() {
        this.nombreFarmacia = "";
        this.sucursal = 0;
        this.direccion = "";
        this.nroMedicamentos = 0;
        this.m = new Medicamento[100];
    }
    
    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.nroMedicamentos = 0;
        this.m = new Medicamento[100];
    }
    
    // Método leer()
    public void leer() {
        System.out.println("Leyendo farmacia...");
    }
    
    // Método mostrar()
    public void mostrar() {
        System.out.println("\n=== Farmacia: " + nombreFarmacia + " ===");
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de medicamentos: " + nroMedicamentos);
    }
    
    // Método getDireccion()
    public String getDireccion() {
        return direccion;
    }
    
    // Método getSucursal()
    public int getSucursal() {
        return sucursal;
    }
    
    // Método mostrarMedicamentos(x) - Mostrar medicamentos de tipo x
    public void mostrarMedicamentos(String tipoX) {
        System.out.println("\n--- Medicamentos de tipo: " + tipoX + " ---");
        boolean encontrado = false;
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipoX)) {
                m[i].mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron medicamentos de tipo " + tipoX);
        }
    }
    
    // Método buscarMedicamento(x) - Buscar medicamento por código
    public Medicamento buscarMedicamento(int codX) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getCodMedicamento() == codX) {
                return m[i];
            }
        }
        return null;
    }
    
    // Método para adicionar medicamentos
    public void adicionarMedicamento(Medicamento medicamento) {
        if (nroMedicamentos < 100) {
            m[nroMedicamentos] = medicamento;
            nroMedicamentos++;
            System.out.println("Medicamento agregado: " + medicamento.getNombre());
        } else {
            System.out.println("No se pueden agregar más medicamentos (límite alcanzado)");
        }
    }
    
    // Getters adicionales
    public String getNombreFarmacia() {
        return nombreFarmacia;
    }
    
    public int getNroMedicamentos() {
        return nroMedicamentos;
    }
    
    public Medicamento[] getMedicamentos() {
        return m;
    }
}
