import java.util.Scanner;

public class MatrizSerpiente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] M = new int[20][20];
        int fil, col;
        int k = 1;

        System.out.print("Inserte filas de M: ");
        fil = sc.nextInt();

        System.out.print("Inserte cols. de M: ");
        col = sc.nextInt();

        // Llenar la matriz
        for (int i = 0; i < fil; i++) {

            if (i % 2 == 0) { // fila impar en PSeInt

                for (int j = 0; j < col; j++) {
                    M[i][j] = k;
                    k++;
                }

            } else { // fila par en PSeInt

                for (int j = col - 1; j >= 0; j--) {
                    M[i][j] = k;
                    k++;
                }
            }
        }

        // Imprimir la matriz
        System.out.println("\nMatriz generada:");

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {
                System.out.printf("[%02d]", M[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}