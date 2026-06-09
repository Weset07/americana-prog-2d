import java.util.Scanner;

public class FactorialPromedioVectores {
    
    /**
     * Método para calcular el factorial de un número
     */
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            System.out.println("Error: No se puede calcular factorial de número negativo");
            return -1;
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * Método para calcular el promedio de un vector
     */
    public static double calcularPromedio(int[] vector) {
        int suma = 0;
        for (int valor : vector) {
            suma += valor;
        }
        return (double) suma / vector.length;
    }
    
    /**
     * Método para leer un vector desde la entrada del usuario
     */
    public static int[] leerVector(Scanner scanner, String nombreVector, int cantidad) {
        int[] vector = new int[cantidad];
        System.out.println("\nIngrese los " + cantidad + " elementos del vector " + nombreVector + ":");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de elementos X para el vector X: ");
        int cantidadX = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de elementos Y para el vector Y: ");
        int cantidadY = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de elementos Z para el vector Z: ");
        int cantidadZ = scanner.nextInt();
        
        // Leer los tres vectores
        int[] vectorX = leerVector(scanner, "X", cantidadX);
        int[] vectorY = leerVector(scanner, "Y", cantidadY);
        int[] vectorZ = leerVector(scanner, "Z", cantidadZ);
        
        // Calcular promedios
        double promedioX = calcularPromedio(vectorX);
        double promedioY = calcularPromedio(vectorY);
        double promedioZ = calcularPromedio(vectorZ);
        
        // Calcular factoriales de los promedios (redondeados a entero)
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Vector X - Promedio: " + promedioX + " - Factorial: " + calcularFactorial((int) Math.round(promedioX)));
        System.out.println("Vector Y - Promedio: " + promedioY + " - Factorial: " + calcularFactorial((int) Math.round(promedioY)));
        System.out.println("Vector Z - Promedio: " + promedioZ + " - Factorial: " + calcularFactorial((int) Math.round(promedioZ)));
        
        scanner.close();
    }
}
