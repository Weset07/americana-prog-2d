import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vectorX = leerVector(scanner, "X");
        int[] vectorY = leerVector(scanner, "Y");
        int[] vectorZ = leerVector(scanner, "Z");

        mostrarDatos(vectorX, "X");
        mostrarDatos(vectorY, "Y");
        mostrarDatos(vectorZ, "Z");

        System.out.println();
        ordenarEImprimir(vectorX, "X");
        ordenarEImprimir(vectorY, "Y");
        ordenarEImprimir(vectorZ, "Z");

        scanner.close();
    }

    private static int[] leerVector(Scanner scanner, String nombre) {
        System.out.print("Ingrese el tamaño del vector " + nombre + ": ");
        int tamaño = scanner.nextInt();
        while (tamaño <= 0) {
            System.out.print("El tamaño debe ser mayor que cero. Ingrese otro valor: ");
            tamaño = scanner.nextInt();
        }

        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del vector " + nombre + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static void mostrarDatos(int[] vector, String nombre) {
        int mayor = vector[0];
        int menor = vector[0];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            if (vector[i] < menor) {
                menor = vector[i];
            }
            suma += vector[i];
        }

        double promedio = (double) suma / vector.length;
        long factorial = calcularFactorial(menor);

        System.out.println();
        System.out.println("Resultados del vector " + nombre + ":");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f%n", promedio);
        if (menor < 0) {
            System.out.println("Factorial del menor: no se puede calcular para números negativos.");
        } else {
            System.out.println("Factorial del menor (" + menor + "): " + factorial);
        }
    }

    private static long calcularFactorial(int número) {
        if (número < 0) {
            return -1;
        }
        long resultado = 1;
        for (int i = 2; i <= número; i++) {
            resultado *= i;
        }
        return resultado;
    }

    private static void ordenarEImprimir(int[] vector, String nombre) {
        int[] copia = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            copia[i] = vector[i];
        }

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[j] < copia[i]) {
                    int temp = copia[i];
                    copia[i] = copia[j];
                    copia[j] = temp;
                }
            }
        }

        System.out.print("Vector " + nombre + " ordenado: ");
        for (int i = 0; i < copia.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(copia[i]);
        }
        System.out.println();
    }
}
