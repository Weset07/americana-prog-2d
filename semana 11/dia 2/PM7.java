import java.util.Scanner;

public class PM7 {
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
        int cparesm7 = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] % 2 == 0 && matriz[i][j] % 7 == 0) {
                    cparesm7++;
                }
            }
        }
        System.out.println("Cantidad de elementos pares y múltiplos de 7 por encima de la diagonal principal: " + cparesm7);
        sc.close();
    }
}
