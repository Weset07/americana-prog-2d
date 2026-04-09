import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int sumaPares = 0;
        for (int num : vector) {
            if (num % 2 == 0) sumaPares += num;
        }
        System.out.println("Suma de los elementos pares: " + sumaPares);
        sc.close();
    }
}