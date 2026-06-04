import java.util.Scanner;

public class ActividadMatrizQuadrantes {
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

        int[][] matrizActividad1 = copiar(matriz);
        swapCuadrantes24(matrizActividad1);
        System.out.println("\nActividad 1: intercambiar cuadrante 2 y cuadrante 4:");
        imprimir(matrizActividad1);

        int[][] matrizActividad2 = copiar(matriz);
        swapCuadrantes13(matrizActividad2);
        System.out.println("\nActividad 2: intercambiar cuadrante 1 y cuadrante 3:");
        imprimir(matrizActividad2);

        sc.close();
    }

    private static int[][] copiar(int[][] original) {
        int n = original.length;
        int[][] copia = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(original[i], 0, copia[i], 0, n);
        }
        return copia;
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
