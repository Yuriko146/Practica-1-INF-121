/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Usuario
 */
public class SistemaBiblioteca {
    private ArchLibro archLibro;
    private ArchPrestamo archPrestamo;
    private ArchCliente archCliente;
    
    public SistemaBiblioteca() {
        this.archLibro = new ArchLibro("libros.dat");
        this.archPrestamo = new ArchPrestamo("prestamos.dat");
        this.archCliente = new ArchCliente("clientes.dat");
    }
    
    // a) Listar los libros cuyo precio estén entre 2 valores (x e y)
    public void listarLibrosPorRangoPrecio(double x, double y) {
        System.out.println("\n=== a) Libros con precio entre $" + x + " y $" + y + " ===");
        boolean encontrado = false;
        for (Libro libro : archLibro.getLibros()) {
            if (libro.getPrecio() >= x && libro.getPrecio() <= y) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros en ese rango de precio");
        }
        System.out.println();
    }
    
    // b) Calcular el ingreso total generado por un libro específico
    public void calcularIngresoLibro(int codigoLibro) {
        System.out.println("\n=== b) Ingreso total del libro código " + codigoLibro + " ===");
        
        Libro libro = archLibro.buscarLibro(codigoLibro);
        if (libro == null) {
            System.out.println("Libro no encontrado");
            return;
        }
        
        int cantidadPrestamos = 0;
        for (Prestamo p : archPrestamo.getPrestamos()) {
            if (p.getCodLibro() == codigoLibro) {
                cantidadPrestamos++;
            }
        }
        
        double ingresoTotal = cantidadPrestamos * libro.getPrecio();
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Precio por préstamo: $" + libro.getPrecio());
        System.out.println("Cantidad de préstamos: " + cantidadPrestamos);
        System.out.println("Ingreso total generado: $" + ingresoTotal);
        System.out.println();
    }
    
    // c) Mostrar la lista de libros que nunca fueron vendidos
    public void mostrarLibrosNuncaPrestados() {
        System.out.println("\n=== c) Libros que nunca fueron prestados ===");
        boolean hayLibrosSinPrestar = false;
        
        for (Libro libro : archLibro.getLibros()) {
            boolean prestado = false;
            for (Prestamo p : archPrestamo.getPrestamos()) {
                if (p.getCodLibro() == libro.getCodLibro()) {
                    prestado = true;
                    break;
                }
            }
            if (!prestado) {
                System.out.println(libro);
                hayLibrosSinPrestar = true;
            }
        }
        
        if (!hayLibrosSinPrestar) {
            System.out.println("Todos los libros han sido prestados al menos una vez");
        }
        System.out.println();
    }
    
    // d) Mostrar a todos los clientes que compraron un libro específico (dado su código)
    public void mostrarClientesPorLibro(int codigoLibro) {
        System.out.println("\n=== d) Clientes que prestaron el libro código " + codigoLibro + " ===");
        
        Libro libro = archLibro.buscarLibro(codigoLibro);
        if (libro != null) {
            System.out.println("Libro: " + libro.getTitulo());
        }
        
        boolean encontrado = false;
        for (Prestamo p : archPrestamo.getPrestamos()) {
            if (p.getCodLibro() == codigoLibro) {
                Cliente cliente = archCliente.buscarCliente(p.getCodCliente());
                if (cliente != null) {
                    System.out.println("  - " + cliente + " | Préstamo: " + p.getFechaPrestamo());
                    encontrado = true;
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron clientes que hayan prestado este libro");
        }
        System.out.println();
    }
    
    // e) Definir el libro más prestado
    public void definirLibroMasPrestado() {
        System.out.println("\n=== e) Libro más prestado ===");
        
        if (archLibro.getLibros().isEmpty()) {
            System.out.println("No hay libros registrados");
            return;
        }
        
        int maxPrestamos = 0;
        Libro libroMasPrestado = null;
        
        for (Libro libro : archLibro.getLibros()) {
            int contadorPrestamos = 0;
            for (Prestamo p : archPrestamo.getPrestamos()) {
                if (p.getCodLibro() == libro.getCodLibro()) {
                    contadorPrestamos++;
                }
            }
            
            if (contadorPrestamos > maxPrestamos) {
                maxPrestamos = contadorPrestamos;
                libroMasPrestado = libro;
            }
        }
        
        if (libroMasPrestado != null) {
            System.out.println("Libro: " + libroMasPrestado);
            System.out.println("Cantidad de préstamos: " + maxPrestamos);
        } else {
            System.out.println("No hay préstamos registrados");
        }
        System.out.println();
    }
    
    // f) Mostrar el cliente que tuvo más préstamos
    public void mostrarClienteConMasPrestamos() {
        System.out.println("\n=== f) Cliente con más préstamos ===");
        
        if (archCliente.getClientes().isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        
        int maxPrestamos = 0;
        Cliente clienteConMasPrestamos = null;
        
        for (Cliente cliente : archCliente.getClientes()) {
            int contadorPrestamos = 0;
            for (Prestamo p : archPrestamo.getPrestamos()) {
                if (p.getCodCliente() == cliente.getCodCliente()) {
                    contadorPrestamos++;
                }
            }
            
            if (contadorPrestamos > maxPrestamos) {
                maxPrestamos = contadorPrestamos;
                clienteConMasPrestamos = cliente;
            }
        }
        
        if (clienteConMasPrestamos != null) {
            System.out.println("Cliente: " + clienteConMasPrestamos);
            System.out.println("Cantidad de préstamos: " + maxPrestamos);
        } else {
            System.out.println("No hay préstamos registrados");
        }
        System.out.println();
    }
    
    public ArchLibro getArchLibro() {
        return archLibro;
    }
    
    public ArchPrestamo getArchPrestamo() {
        return archPrestamo;
    }
    
    public ArchCliente getArchCliente() {
        return archCliente;
    }
}
