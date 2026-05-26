import java.util.Scanner;

public class imparesm3DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int CIMPM3 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] % 2 == 1 && matriz[i][j] % 3 == 0) {
                    CIMPM3++;
                }
            }
        }
        System.out.println("Cantidad de elementos impares y múltiplos de 3 por encima de la diagonal principal: " + CIMPM3);

        sc.close();
    }
}
