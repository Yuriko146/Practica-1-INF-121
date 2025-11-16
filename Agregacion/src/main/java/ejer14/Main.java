/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer14;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 14: SISTEMA EMPRESA-EMPLEADOS =====");
        System.out.println("(Relación de Agregación)\n");
        
        // a) Crear empresa y agregar empleados
        System.out.println("=== CREANDO EMPRESA ===");
        Empresa empresa = new Empresa("TechSolutions Ltda.");
        System.out.println("✓ Empresa creada: " + empresa.getNombre() + "\n");
        
        System.out.println("=== AGREGANDO EMPLEADOS ===");
        Empleado emp1 = new Empleado("Juan Pérez", "Gerente General", 15000);
        Empleado emp2 = new Empleado("María López", "Desarrolladora Senior", 12000);
        Empleado emp3 = new Empleado("Carlos Mamani", "Contador", 8000);
        Empleado emp4 = new Empleado("Ana Torres", "Diseñadora UX/UI", 9500);
        Empleado emp5 = new Empleado("Luis García", "Desarrollador Junior", 6000);
        Empleado emp6 = new Empleado("Rosa Quispe", "Analista de Datos", 10000);
        
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);
        empresa.agregarEmpleado(emp5);
        empresa.agregarEmpleado(emp6);
        
        // b) Mostrar información de la empresa y empleados
        System.out.println("\n=== INCISO B: Información de la Empresa ===");
        empresa.mostrarInformacion();
        
        // c) Buscar empleado por nombre
        System.out.println("\n=== INCISO C: Buscar Empleado por Nombre ===");
        empresa.buscarYMostrarEmpleado("María López");
        empresa.buscarYMostrarEmpleado("Pedro González"); // No existe
        
        // e) Calcular y mostrar promedio salarial
        System.out.println("\n=== INCISO E: Promedio Salarial ===");
        empresa.mostrarPromedioSalarial();
        
        // e) Listar empleados con salario mayor a un valor
        System.out.println("\n=== INCISO E: Empleados con Salario Mayor ===");
        empresa.listarEmpleadosSalarioMayor(9000);
        empresa.listarEmpleadosSalarioMayor(12000);
        
        // d) Eliminar empleado por nombre
        System.out.println("\n=== INCISO D: Eliminar Empleado ===");
        empresa.eliminarEmpleadoPorNombre("Luis García");
        empresa.eliminarEmpleadoPorNombre("Roberto Sánchez"); // No existe
        
        // Mostrar información actualizada
        System.out.println("\n=== INFORMACIÓN ACTUALIZADA ===");
        empresa.mostrarInformacion();
        
        // Recalcular promedio después de eliminar empleado
        System.out.println("\n=== PROMEDIO SALARIAL ACTUALIZADO ===");
        empresa.mostrarPromedioSalarial();
        
        // Estadísticas finales
        System.out.println("\n=== ESTADÍSTICAS FINALES ===");
        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Total de empleados: " + empresa.getCantidadEmpleados());
        System.out.println("Promedio salarial: Bs. " + 
                         String.format("%.2f", empresa.calcularPromedioSalarial()));
        
        System.out.println("\n===== FIN DEL PROGRAMA =====");
        System.out.println("\nNOTA: La relación de AGREGACIÓN permite que los empleados");
        System.out.println("existan independientemente de la empresa. Si la empresa");
        System.out.println("desaparece, los empleados siguen existiendo.");
    }
}