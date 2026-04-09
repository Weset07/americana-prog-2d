import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.print("Vector en sentido inverso: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}