import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear dos arrays para nombres y edades (máximo 50 alumnos)
        String[] nombres = new String[50];
        int[] edades = new int[50];
        int cantidad = 0;
        
        // Leer nombres y edades hasta que se ingrese "*"
        while (true) {
            System.out.print("Ingresa el nombre del alumno (* para terminar): ");
            String nombre = scanner.nextLine();
            
            if (nombre.equals("*")) {
                break;
            }
            
            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            nombres[cantidad] = nombre;
            edades[cantidad] = edad;
            cantidad = cantidad + 1;
        }
        
        // Mostrar alumnos mayores de edad (18 años)
        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }
        
        // Encontrar la edad máxima
        int edadMaxima = edades[0];
        for (int i = 1; i < cantidad; i++) {
            if (edades[i] > edadMaxima) {
                edadMaxima = edades[i];
            }
        }
        
        // Mostrar alumnos con la edad máxima
        System.out.println("\nAlumnos más grandes (edad: " + edadMaxima + "):");
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] == edadMaxima) {
                System.out.println(nombres[i]);
            }
        }
    }
}
