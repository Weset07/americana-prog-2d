import java.util.Scanner;

public class MatrizTriangular {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] M = new int[20][20];
        int d, cont = 1;

        System.out.print("Digite Dimension: ");
        d = sc.nextInt();

        // Llenar la matriz
        for (int i = 0; i < d; i++) {

            for (int j = 0; j < d; j++) {

                if ((i + j) <= (d - 1)) {
                    M[i][j] = cont;
                    cont++;
                } else {
                    M[i][j] = 0;
                }

            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz generada:");

        for (int i = 0; i < d; i++) {

            for (int j = 0; j < d; j++) {
                System.out.printf("[%02d]", M[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}