import java.util.Scanner;

public class Ejercicio1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector A: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        System.out.print("\nIngrese el tamaño del vector B: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = sc.nextInt();
        }

        int[] C = new int[Math.min(n, m)];
        int cSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    boolean yaEsta = false;
                    for (int k = 0; k < cSize; k++) {
                        if (C[k] == A[i]) {
                            yaEsta = true;
                            break;
                        }
                    }
                    if (!yaEsta) {
                        C[cSize++] = A[i];
                    }
                    break;
                }
            }
        }

        System.out.println("\nVector C (intersección):");
        if (cSize == 0) {
            System.out.println("No hay elementos en común.");
        } else {
            for (int i = 0; i < cSize; i++) {
                System.out.print(C[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
