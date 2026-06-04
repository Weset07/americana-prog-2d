import java.util.Scanner;

public class Actividad2Cuadrantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n para la matriz n x n: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los " + (n * n) + " elementos de la matriz, fila por fila:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        imprimir(matriz);

        swapCuadrantes13(matriz);
        System.out.println("\nResultado Actividad 2 (intercambiar cuadrante 1 y 3):");
        imprimir(matriz);

        sc.close();
    }

    private static void swapCuadrantes13(int[][] matriz) {
        int n = matriz.length;
        int mitad = n / 2;
        int inicioAbajo = mitad + (n % 2);

        for (int i = 0; i < mitad; i++) {
            for (int j = 0; j < mitad; j++) {
                int fila1 = i;
                int col1 = j;
                int fila3 = inicioAbajo + i;
                int col3 = j;
                int temp = matriz[fila1][col1];
                matriz[fila1][col1] = matriz[fila3][col3];
                matriz[fila3][col3] = temp;
            }
        }
    }

    private static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
