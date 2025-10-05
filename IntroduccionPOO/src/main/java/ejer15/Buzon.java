/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer15;

/**
 *
 * @author USUARIO
 */
public class Buzon {
    private int nro;
    private int nroC;
    private String[][] c;  // c[50][3] - matriz para 50 cartas con 3 datos cada una
    private Carta[] cartas;
    
    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.c = new String[50][3];  // 50 filas, 3 columnas
        this.cartas = new Carta[50];
    }
    
    public void agregarCarta(Carta carta) {
        if (nroC < 50) {
            c[nroC][0] = carta.getCodigo();
            c[nroC][1] = carta.getRemitente();
            c[nroC][2] = carta.getDestinatario();
            cartas[nroC] = carta;
            nroC++;
        }
    }
    
    // c) Contar cartas de un destinatario
    public int contarCartasDestinatario(String destinatario) {
        int count = 0;
        for (int i = 0; i < nroC; i++) {
            if (cartas[i].getDestinatario().equals(destinatario)) {
                count++;
            }
        }
        return count;
    }
    
    // d) Eliminar carta por código
    public boolean eliminarCarta(String codigo) {
        for (int i = 0; i < nroC; i++) {
            if (c[i][0].equals(codigo)) {
                for (int j = i; j < nroC - 1; j++) {
                    c[j][0] = c[j + 1][0];
                    c[j][1] = c[j + 1][1];
                    c[j][2] = c[j + 1][2];
                    cartas[j] = cartas[j + 1];
                }
                nroC--;
                return true;
            }
        }
        return false;
    }
    
    // e) Buscar remitente
    public String buscarRemitente(String destinatario) {
        for (int i = 0; i < nroC; i++) {
            if (cartas[i].getDestinatario().equals(destinatario)) {
                return cartas[i].getRemitente();
            }
        }
        return null;
    }
    
    // f) Buscar palabra en descripciones
    public void buscarPalabra(String palabra) {
        System.out.println("Cartas con la palabra '" + palabra + "':");
        for (int i = 0; i < nroC; i++) {
            if (cartas[i].getDescripcion().toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("- " + cartas[i].getCodigo());
            }
        }
    }
    
    // g) Mostrar coincidencias (código, remitente, destinatario)
    public void mostrarCoincidencias() {
        System.out.println("Buzon #" + nro + ":");
        for (int i = 0; i < nroC; i++) {
            System.out.println("Codigo: " + c[i][0] + 
                             " | Remitente: " + c[i][1] + 
                             " | Destinatario: " + c[i][2]);
        }
    }
    
    public int getNroC() {
        return nroC;
    }
}