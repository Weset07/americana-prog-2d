import java.util.Scanner;

public class Actividad1Cuadrantes {
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

        swapCuadrantes24(matriz);
        System.out.println("\nResultado Actividad 1 (intercambiar cuadrante 2 y 4):");
        imprimir(matriz);

        sc.close();
    }

    private static void swapCuadrantes24(int[][] matriz) {
        int n = matriz.length;
        int mitad = n / 2;
        int inicioDerecha = mitad + (n % 2);
        int inicioAbajo = inicioDerecha;

        for (int i = 0; i < mitad; i++) {
            for (int j = 0; j < mitad; j++) {
                int fila2 = i;
                int col2 = inicioDerecha + j;
                int fila4 = inicioAbajo + i;
                int col4 = inicioDerecha + j;
                int temp = matriz[fila2][col2];
                matriz[fila2][col2] = matriz[fila4][col4];
                matriz[fila4][col4] = temp;
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
