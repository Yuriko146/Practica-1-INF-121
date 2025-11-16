/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author USUARIO
 */
public class OtroProducto extends Producto {
    private String categoria;
    private String marca;
    
    public OtroProducto(String nombre, double precio, String codigo, int stock,
                       String categoria, String marca) {
        super(nombre, precio, codigo, stock);
        this.categoria = categoria;
        this.marca = marca;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("PRODUCTO: " + nombre + " | $" + precio + 
                         " | Categoría: " + categoria + " | Marca: " + marca + 
                         " | Stock: " + stock);
    }
}
