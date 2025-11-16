/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: SISTEMA DE FARMACIA ===\n");
        
        // Crear la farmacia (clase principal)
        Farmacia farmacia = new Farmacia("Farmacia Central", "Av. 6 de Agosto #2500");
        
        // Crear medicamentos
        Medicamento med1 = new Medicamento("Ibuprofeno 400mg", 15.50, "MED001", 
                                          50, "Ibuprofeno", "Bayer");
        Medicamento med2 = new Medicamento("Amoxicilina 500mg", 45.00, "MED002", 
                                          30, "Amoxicilina", "Genfar");
        Medicamento med3 = new Medicamento("Paracetamol 500mg", 12.00, "MED003", 
                                          100, "Paracetamol", "MK");
        
        // Crear otros productos
        OtroProducto prod1 = new OtroProducto("Alcohol en gel 500ml", 25.00, "PRO001", 
                                             80, "Higiene", "CleanMax");
        OtroProducto prod2 = new OtroProducto("Vitamina C 1000mg", 35.00, "PRO002", 
                                             60, "Suplementos", "Centrum");
        OtroProducto prod3 = new OtroProducto("Termómetro digital", 55.00, "PRO003", 
                                             20, "Equipo médico", "Omron");
        
        // Agregar productos a la farmacia
        System.out.println("=== AGREGANDO PRODUCTOS ===");
        farmacia.agregarProducto(med1);
        farmacia.agregarProducto(med2);
        farmacia.agregarProducto(med3);
        farmacia.agregarProducto(prod1);
        farmacia.agregarProducto(prod2);
        farmacia.agregarProducto(prod3);
        
        // Mostrar inventario completo
        farmacia.mostrarInventario();
        
        // Crear registros de ventas (composición con Medicamento)
        System.out.println("\n=== REGISTROS DE VENTAS ===");
        Registro reg1 = new Registro("15/11/2025", 2, med1, "Juan Pérez");
        Registro reg2 = new Registro("15/11/2025", 1, med2, "María López");
        Registro reg3 = new Registro("15/11/2025", 3, med3, "Carlos Ruiz");
        
        reg1.mostrarRegistro();
        reg2.mostrarRegistro();
        reg3.mostrarRegistro();
        
        // Buscar medicamentos por principio activo
        farmacia.buscarMedicamentos("Ibuprofeno");
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
