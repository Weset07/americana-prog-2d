import java.util.Scanner;

public class PNDS {
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
        int cnarribadiagonals = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                cnarribadiagonals++;
                total += matriz[i][j];
            }
        }

        total = total / cnarribadiagonals;

        System.out.println("Cantidad de elementos negativos por encima de la diagonal principal: " + cnarribadiagonals);
        System.out.println("Promedio de los elementos negativos por encima de la diagonal principal: " + total);
        sc.close();
    }
}
    