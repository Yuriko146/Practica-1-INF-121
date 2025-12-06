/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArchCliente {
    private String nomArch;
    private ArrayList<Cliente> clientes;
    
    // Constructor
    public ArchCliente(String nomArch) {
        this.nomArch = nomArch;
        this.clientes = new ArrayList<>();
    }
    
    // Método method(type): type
    public void method(String type) {
        System.out.println("Método genérico de ArchCliente - tipo: " + type);
    }
    
    // Método para agregar cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre() + " " + cliente.getApellido());
    }
    
    // Método para listar todos los clientes
    public void listarClientes() {
        System.out.println("\n=== LISTADO DE CLIENTES ===");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
        System.out.println("==========================\n");
    }
    
    // Método para buscar cliente por código
    public Cliente buscarCliente(int codigo) {
        for (Cliente c : clientes) {
            if (c.getCodCliente() == codigo) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
