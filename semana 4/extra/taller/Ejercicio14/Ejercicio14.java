import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de los vectores (n): ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + " de A: ");
            A[i] = sc.nextInt();
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + " de B: ");
            B[i] = sc.nextInt();
        }
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[n - 1 - i];
        }
        System.out.print("Vector A: ");
        for (int num : A) System.out.print(num + " ");
        System.out.println();
        System.out.print("Vector B: ");
        for (int num : B) System.out.print(num + " ");
        System.out.println();
        System.out.print("Vector C (suma): ");
        for (int num : C) System.out.print(num + " ");
        System.out.println();
        sc.close();
    }
}