/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorUsuarios {
    private static final String NOMBRE_ARCHIVO = "usuarios_seguro.txt";
    private ArrayList<Usuario> usuarios;
    
    public GestorUsuarios() {
        this.usuarios = new ArrayList<>();
        cargarUsuarios();
    }
    
    // Guardar usuarios en el archivo
    public void guardarEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (Usuario usuario : usuarios) {
                // Cifrar nombre de usuario y contraseña
                String nombreCifrado = Cifrador.cifrar(usuario.getNombreUsuario());
                String contrasenaCifrada = Cifrador.cifrar(usuario.getContrasena());
                
                // Guardar en formato: nombreCifrado|contrasenaCifrada
                writer.write(nombreCifrado + "|" + contrasenaCifrada);
                writer.newLine();
            }
            System.out.println("✓ Datos guardados exitosamente en " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.out.println("✗ Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    // Cargar usuarios desde el archivo
    public void cargarUsuarios() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("ℹ Archivo no existe, se creará uno nuevo al guardar");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            usuarios.clear();
            
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 2) {
                    // Descifrar nombre de usuario y contraseña
                    String nombreDescifrado = Cifrador.descifrar(partes[0]);
                    String contrasenaDescifrada = Cifrador.descifrar(partes[1]);
                    
                    usuarios.add(new Usuario(nombreDescifrado, contrasenaDescifrada));
                }
            }
            System.out.println("✓ Se cargaron " + usuarios.size() + " usuarios desde el archivo");
        } catch (IOException e) {
            System.out.println("✗ Error al cargar el archivo: " + e.getMessage());
        }
    }
    
    // Agregar un nuevo usuario
    public void agregarUsuario(String nombreUsuario, String contrasena) {
        // Verificar si el usuario ya existe
        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                System.out.println("✗ El usuario '" + nombreUsuario + "' ya existe");
                return;
            }
        }
        
        Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasena);
        usuarios.add(nuevoUsuario);
        System.out.println("✓ Usuario '" + nombreUsuario + "' agregado exitosamente");
        
        // Guardar automáticamente en el archivo
        guardarEnArchivo();
    }
    
    // Mostrar todos los registros
    public void mostrarRegistros() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                   REGISTROS DE USUARIOS                               ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        
        if (usuarios.isEmpty()) {
            System.out.println("║  No hay usuarios registrados                                          ║");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario u = usuarios.get(i);
                System.out.println("║ " + (i + 1) + ". " + u);
            }
        }
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
    
    // Buscar usuario por nombre
    public void buscarUsuario(String nombreBuscar) {
        System.out.println("\n=== BÚSQUEDA DE USUARIO ===");
        System.out.println("Buscando: '" + nombreBuscar + "'");
        
        boolean encontrado = false;
        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\n✓ Usuario encontrado:");
                System.out.println("  Nombre de usuario: " + u.getNombreUsuario());
                System.out.println("  Contraseña: " + u.getContrasena());
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\n✗ Usuario '" + nombreBuscar + "' no encontrado");
        }
        System.out.println();
    }
    
    // Mostrar contenido cifrado del archivo
    public void mostrarArchivoCifrado() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║              CONTENIDO CIFRADO DEL ARCHIVO                            ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("║  El archivo no existe                                                 ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            int contador = 1;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println("║ " + contador + ". " + linea);
                contador++;
            }
            
            if (contador == 1) {
                System.out.println("║  El archivo está vacío                                                ║");
            }
        } catch (IOException e) {
            System.out.println("║  Error al leer el archivo                                             ║");
        }
        
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝\n");
    }
    
    public int getCantidadUsuarios() {
        return usuarios.size();
    }
}
