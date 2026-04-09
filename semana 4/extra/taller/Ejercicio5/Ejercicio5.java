import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        double promedio = (double) suma / n;
        int count = 0;
        for (int num : vector) {
            if (num < promedio) count++;
        }
        System.out.println("Cantidad de números menores que el promedio (" + promedio + "): " + count);
        sc.close();
    }
}