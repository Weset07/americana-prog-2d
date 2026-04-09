import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.print("Dato a buscar: ");
        int dato = sc.nextInt();
        int count = 0;
        for (int num : vector) {
            if (num == dato) count++;
        }
        System.out.println("El dato " + dato + " aparece " + count + " veces.");
        sc.close();
    }
}