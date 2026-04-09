import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de los vectores: ");
        int n = sc.nextInt();
        int[] v1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + " del primer vector: ");
            v1[i] = sc.nextInt();
        }
        int[] v2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + " del segundo vector: ");
            v2[i] = sc.nextInt();
        }
        int[] suma = new int[n];
        for (int i = 0; i < n; i++) {
            suma[i] = v1[i] + v2[i];
        }
        System.out.print("Vector resultante: ");
        for (int num : suma) System.out.print(num + " ");
        System.out.println();
        sc.close();
    }
}