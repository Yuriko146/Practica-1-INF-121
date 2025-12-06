/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

import java.util.Base64;

/**
 *
 * @author Usuario
 */
public class Cifrador {
    // Cifrado usando XOR con una clave
    private static final String CLAVE = "MiClaveSecreta2025";
    
    // Método para cifrar usando Base64 y XOR
    public static String cifrar(String texto) {
        try {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char caracterTexto = texto.charAt(i);
                char caracterClave = CLAVE.charAt(i % CLAVE.length());
                resultado.append((char) (caracterTexto ^ caracterClave));
            }
            // Codificar en Base64 para que sea texto seguro
            return Base64.getEncoder().encodeToString(resultado.toString().getBytes());
        } catch (Exception e) {
            return texto;
        }
    }
    
    // Método para descifrar
    public static String descifrar(String textoCifrado) {
        try {
            // Decodificar desde Base64
            byte[] decodificado = Base64.getDecoder().decode(textoCifrado);
            String textoXOR = new String(decodificado);
            
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < textoXOR.length(); i++) {
                char caracterTexto = textoXOR.charAt(i);
                char caracterClave = CLAVE.charAt(i % CLAVE.length());
                resultado.append((char) (caracterTexto ^ caracterClave));
            }
            return resultado.toString();
        } catch (Exception e) {
            return textoCifrado;
        }
    }
}
