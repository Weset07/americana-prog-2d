import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
        // Pedir el tamaño de los vectores
        System.out.print("¿Cuántos estudiantes ingresará? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        // Crear los vectores
        int[] cedulas = new int[n];
        String[] nombres = new String[n];
        int[] edades = new int[n];
        
        // Ingresar datos de los estudiantes
        for (int i = 0; i < n; i++) {
            System.out.print("Cédula del estudiante: ");
            cedulas[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer 1
            
            System.out.print("Ingrese nombre de cédula " + cedulas[i] + ": ");
            nombres[i] = scanner.nextLine();
            
            System.out.print("Ingrese edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer 2
        } // las limpiezas de los buffers es debido al cambio de tipo de dato
        
        // Encontrar edad máxima y mínima
        int edadMaxima = edades[0];
        int edadMinima = edades[0];
        double sumaEdades = 0;
        
        for (int i = 0; i < n; i++) {
            if (edades[i] > edadMaxima) {
                edadMaxima = edades[i];
            }
            if (edades[i] < edadMinima) {
                edadMinima = edades[i];
            }
            sumaEdades += edades[i];
        }
        
        double promedioEdad = sumaEdades / n;
        
        // Mostrar resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Edad Mayor: " + edadMaxima);
        System.out.println("Edad Menor: " + edadMinima);
        System.out.println("Promedio de Edades: " + String.format("%.2f", promedioEdad));
        
        // Imprimir estudiantes con edad máxima
        System.out.println("\n===== ESTUDIANTES CON EDAD MÁXIMA =====");
        for (int i = 0; i < n; i++) {
            if (edades[i] == edadMaxima) {
                System.out.println("Cédula: " + cedulas[i] + ", Nombre: " + nombres[i] + ", Edad: " + edades[i]);
            }
        }
        
        // Imprimir estudiantes con edad mínima
        System.out.println("\n===== ESTUDIANTES CON EDAD MÍNIMA =====");
        for (int i = 0; i < n; i++) {
            if (edades[i] == edadMinima) {
                System.out.println("Cédula: " + cedulas[i] + ", Nombre: " + nombres[i] + ", Edad: " + edades[i]);
            }
        }
        } // Cierre del try-with-resources
    }
}
