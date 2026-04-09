import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector A (n): ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + " de A: ");
            A[i] = sc.nextInt();
        }
        System.out.print("Tamaño del vector B (m): ");
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Elemento " + (i + 1) + " de B: ");
            B[i] = sc.nextInt();
        }
        int[] repetidos = new int[m];
        int repetidosSize = 0;
        for (int numB : B) {
            boolean found = false;
            for (int numA : A) {
                if (numB == numA) {
                    found = true;
                    break;
                }
            }
            if (found) {
                boolean yaAgregado = false;
                for (int k = 0; k < repetidosSize; k++) {
                    if (repetidos[k] == numB) {
                        yaAgregado = true;
                        break;
                    }
                }
                if (!yaAgregado) {
                    repetidos[repetidosSize++] = numB;
                }
            }
        }
        System.out.print("Elementos de B repetidos en A: ");
        for (int i = 0; i < repetidosSize; i++) {
            System.out.print(repetidos[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}